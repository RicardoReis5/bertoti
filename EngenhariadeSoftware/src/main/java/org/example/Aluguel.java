package org.example;

public class Aluguel {
    private String contrato;
    private Double valorAluguel;
    private Inquilino inquilino;
    private Casa casa;

    public Aluguel(String contrato, Double valorAluguel, Inquilino inquilino, Casa casa) {
        this.contrato = contrato;
        this.valorAluguel = valorAluguel;
        this.inquilino = inquilino;
        this.casa = casa;
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public String getContrato() {
        return contrato;
    }

    public void setValorAluguel(Double valorAluguel) {
        this.valorAluguel = valorAluguel;
    }

    public Double getValorAluguel() {
        return valorAluguel;
    }

    public void info() {
        System.out.println("Número do contrato: " + contrato);
        System.out.println("Valor do aluguel: R$" + valorAluguel);
        System.out.println("Inquilino: " + inquilino.getNome());
        System.out.println("Casa alugada: " + casa.getLocal());
    }
}
