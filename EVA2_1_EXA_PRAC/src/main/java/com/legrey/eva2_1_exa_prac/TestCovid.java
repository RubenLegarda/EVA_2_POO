package com.legrey.eva2_1_exa_prac;

public class TestCovid {
    private int edad;
    private boolean tieneEnfermedad;
    private int peso;
    private int estatura;//cm 170 / 100
    
    //CONSTRUCTORES
    public TestCovid(){
    this.edad = 43;
    this.tieneEnfermedad = false;
    this.peso = 80;
    this.estatura = 170;
    }
    public TestCovid(int edad, boolean tieneEnfermedad, int peso, int estatura){
    this.edad = edad;
    this.tieneEnfermedad = tieneEnfermedad;
    this.peso = peso;
    this.estatura = estatura;
    }
    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public boolean getTieneEnfermedad(){
        return tieneEnfermedad;
    }
    public void setTieneEnfermedad(boolean tieneEnfermedad){
        this.tieneEnfermedad = tieneEnfermedad;
    }
    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getEstatura(){
        return estatura;
    }
    public void setEstatura(int estatura){
        this.estatura = estatura;
    }

    private double calcularIMC(){
     double mts = estatura /100.0;
     return (peso /(mts * mts));
    }
    public String calcularPersonaRiesgo(){
        if(edad >= 65){
            return "Persona de riesgo";  
        }
        else if (tieneEnfermedad == true){
            return "Persona de riesgo";
        }
        else if (calcularIMC() > 30){
            return "Persona de riesgo";
        }
        else if (tieneEnfermedad == true){
            return "Persona LIBRE de riesgo";
        } 
        return null;
    }
}