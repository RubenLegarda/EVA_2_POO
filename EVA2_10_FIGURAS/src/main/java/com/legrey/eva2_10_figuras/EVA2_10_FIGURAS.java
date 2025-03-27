package com.legrey.eva2_10_figuras;

public class EVA2_10_FIGURAS {

    public static void main(String[] args) {
        Circulo circulo = new Circulo (100);
        System.out.println("CIRCULO:");
        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Perimetro: " + circulo.calcularPerimetro());
        Rectangulo rectangulo = new Rectangulo (10.0,20.0);
        System.out.println("RECTANGULO:");
        System.out.println("Area: " + rectangulo.calcularArea());
        System.out.println("Perimetro: " + rectangulo.calcularPerimetro());
        }
}
