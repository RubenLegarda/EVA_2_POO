package com.legrey.eva2_5_protected;

public class Persona {
    protected String nombre;
    protected String apellidos;
    protected int edad;
    
     public Persona(){
    this.nombre = "____";
    this.apellidos = "_____";
    this.edad = 0;
    }
    
        public Persona(String nombre, String apellidos,  int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
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
    public int getEdad(){
    return edad;
    }
    public void setEdad(int valor){
    edad = valor;
    }

}
