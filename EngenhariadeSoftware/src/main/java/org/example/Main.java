package org.example;

public class Main {
    public static void main(String[] args) {
        Casa casa1 = new Casa("Taubaté", 250000.0, false);
        casa1.info();
        System.out.println();

        Casa casa2 = new Casa("Belo Horizonte", 180000.0, true);
        casa2.info();
        System.out.println();

        Proprietario proprietario1 = new Proprietario("João João", "1234567890");
        proprietario1.info();
        System.out.println();

        Proprietario proprietario2 = new Proprietario("Natasha Nataly", "0987654321");
        proprietario2.info();
        System.out.println();

        Inquilino inquilino1 = new Inquilino("Carlos Carlos", "11111111111");
        inquilino1.info();
        System.out.println();

        Inquilino inquilino2 = new Inquilino("Ana Anatoly", "22222222222");
        inquilino2.info();
        System.out.println();

        Aluguel contrato1 = new Aluguel("01", 1500.0, inquilino1, casa1);
        contrato1.info();
        System.out.println();

        Aluguel contrato2 = new Aluguel("02", 2000.0, inquilino2, casa2);
        contrato2.info();
        System.out.println();
    }
}