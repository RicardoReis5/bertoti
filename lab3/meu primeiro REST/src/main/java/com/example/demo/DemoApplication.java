package com.example.demo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@SpringBootApplication
public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
}
@RestController
@RequestMapping("/cars")
class RestApiDemoController {
	private List<Car> cars = new ArrayList<>();

	public RestApiDemoController() {
		cars.addAll(List.of(
				new Car("Volkswagem Fusca"),
				new Car("Fiat Argo"),
				new Car("Ford Ecosport"),
				new Car("BMW 320i"),
				new Car("Toyota Corolla")
		));
}

	@GetMapping
	Iterable<Car> getCars() {
		return cars;
	}

	@GetMapping("/{id}")
	Optional<Car> getCarById(@PathVariable String id) {
		for (Car c: cars) {
			if  (c.getId().equals(id)){
				return Optional.of(c);
			}
		}
		return Optional.empty();
	}

	@PostMapping
	Car postCar(@RequestBody Car car) {
		cars.add(car);
		return car;
	}

	@PutMapping("/{id}")
	ResponseEntity<Car> putCar(@PathVariable String id,
							   @RequestBody Car car) {

		int carIndex = -1;

		for (Car c: cars) {
			if (c.getId().equals(id)) {
				carIndex = cars.indexOf(c);
				cars.set(carIndex, car);
			}
		}

		return (carIndex == -1) ?
				new ResponseEntity<>(postCar(car), HttpStatus.CREATED) :
				new ResponseEntity<>(car, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	void deleteCar(@PathVariable String id) {
		cars.removeIf(c -> c.getId().equals(id));
	}
}

class Car {
	private final String id;
	private String name;
	public Car(String id, String name){
		this.id = id;
		this.name = name;
	}
	public Car(String name) {
		this(UUID.randomUUID().toString(), name);
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}