package main.java;

public class App {

    public static void main(String[] args) throws Exception {
        CorpoHumano c1 = new CorpoHumano(0, 0, 0, 0);
        c1.setMassa(65);
        c1.setVolume(0.07);
        c1.setDensidade(2000);
        c1.setAltura(1.7);
        System.out.println(c1.calcularIMC());
    }
}
