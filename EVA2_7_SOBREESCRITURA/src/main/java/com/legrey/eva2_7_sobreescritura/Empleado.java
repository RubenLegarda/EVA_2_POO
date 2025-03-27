package com.legrey.eva2_7_sobreescritura;

public class Empleado {
    private String nombre;
    private String apellidos;
    private double salario;
    
     public Empleado(){
    this.nombre = "____";
    this.apellidos = "_____";
    this.salario = 0.0;
    }
    
        public Empleado (String nombre, String apellidos,  double salario) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.salario = salario;
    }
    
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String valor){
    nombre = valor;
    }
    public String getApellidos(){
    return apellidos;
    }
    public void setApellidos(String valor){
    apellidos = valor;
    }
    public double getSalario(){
    return salario;
    }
    public void setSalario(double valor){
    salario = valor;
    }
    
    public double calcularSalario(){
        return salario;
    }
    
 
    @Override
    public String toString() {
        String cade = "Nombre : " + nombre + "\n" + "Apellidos: " + apellidos + "\n" + "Salario: (sinCalculo): " + salario;
        return cade;
    }

}

