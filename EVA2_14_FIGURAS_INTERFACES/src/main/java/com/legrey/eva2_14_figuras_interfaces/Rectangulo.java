package com.legrey.eva2_14_figuras_interfaces;

public class Rectangulo implements Figura, MostrarDatos {
    private double base;
    private double altura;

    // Constructor por defecto
    public Rectangulo() {
        this.base = 0;
        this.altura = 0;
    }

    // Constructor con argumentos
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura; // Error corregido
    }

    // Métodos Get y Set
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Método corregido para calcular el área
    @Override
    public double calcularArea() {
        return base * altura; // Error corregido
    }

    @Override
    public double calcularPerimetro() {
        return (base * 2) + (altura * 2);
    }
    
       @Override
    public void mostrarDatos() {
        System.out.println("Rectangulo: ");
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
    
}