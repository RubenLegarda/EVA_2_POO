package com.legrey.eva2_10_figuras;

public class Circulo extends Figura{
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
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
    
    }
    
    @Override
    public double calcularPerimetro(){
        return Math.PI * radio * 2;
    
    }
    
}
