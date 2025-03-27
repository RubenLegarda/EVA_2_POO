package com.legrey.eva2_14_figuras_interfaces;

public class Circulo implements Figura, MostrarDatos{
    //atributos
    private double radio;
    
    
    //CONSTRUCTORES DEFAULT Y CON ARGUMENTOS
    
    //DEAFULT
    public Circulo(){ 
        this.radio = 0;
    }
    
    //CON ARGUMENTOS
    public Circulo(double radio) {
        this.radio = radio;  
    }
    
    //get y set
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
       this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calcularPerimetro() {
         return Math.PI * radio * 2;
    }

    @Override
    public void mostrarDatos() {
        System.out.println("Circulo: ");
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
            
            
    
}
