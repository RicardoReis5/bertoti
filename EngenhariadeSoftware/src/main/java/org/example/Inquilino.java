package org.example;

public class Inquilino {
    private String nome;
    private String cpf;

    public Inquilino(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void info() {
        System.out.println("Nome do inquilino: " + nome);
        System.out.println("CPF do inquilino: " + cpf);
    }
}
