package com.legrey.eva2_9_clasesabstractas;

public abstract class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    
    
     public Persona(){
    this.nombre = "____";
    this.apellido = "_____";
    this.edad = 0;
    }
    
        public Persona(String nombre, String apellido,  int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String valor){
    this.nombre = valor;
    }
    public String getApellido(){
    return apellido;
    }
    public void setApellido(String valor){
    this.apellido = valor;
    }
    public int getEdad(){
    return edad;
    }
    public void setEdad(int valor){
    this.edad = valor;
    }
    
    public abstract void imprimirDatos();
}
