package org.example;

public class Imovel {
    private String tipo;
    private double area;

    public Imovel(String tipo, double area, String endereco) {
        this.tipo = tipo;
        this.area = area;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void info() {
        System.out.println("Tipo de imóvel: " + tipo);
        System.out.println("Área: " + area + " metros quadrados");
    }
}