package org.example;

public class Casa {
    private String local;
    private Double valorCasa;
    private Boolean isocupado;

    public Casa(String local, Double valor, Boolean isocupado){
        this.local = local;
        this.valorCasa = valor;
        this.isocupado = isocupado;
    }
    public void setLocal(String local) {
        this.local = local;
    }
    public String getLocal() {
        return local;
    }
    public Double setValor(Double valor) {
        this.valorCasa = valor;
        return valor;
    }
    public Double getValorCasa() {
        return valorCasa;
    }
    public void setIsocupado(Boolean isocupado) {
        this.isocupado = isocupado;
    }
    public Boolean getIsocupado() {
        return isocupado;
    }
    public void info(){
        System.out.println("Local: " + local);
        System.out.println("Valor: R$" + valorCasa);
        System.out.println("Está ocupado? " + isocupado);
    }
}