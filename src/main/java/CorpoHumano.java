package main.java;

public class CorpoHumano {
    private int massa;
    private double volume;
    private int densidade;
    private double altura;

    public CorpoHumano(int massa, double volume, int densidade, double altura) {
        this.massa = massa;
        this.volume = volume;
        this.densidade = densidade;
        this.altura = altura;
    }

    public double calcularIMC() {
        return massa / (altura * altura);
    }

    // massa methods
    public int getMassa() {
        return massa;
    }
    public void setMassa(int massa) {
        this.massa = massa;
    }

    // volume methods
    public double getVolume() {
        return volume;
    }
    public void setVolume(double volume) {
        this.volume = volume;
    }

    // densidade methods
    public int getDensidade() {
        return densidade;
    }
    public void setDensidade(int densidade) {
        this.densidade = densidade;
    }

    // altura methods
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
