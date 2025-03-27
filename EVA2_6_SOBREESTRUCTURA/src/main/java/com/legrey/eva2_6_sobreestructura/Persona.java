package com.legrey.eva2_6_sobreestructura;

public class Persona {
    private String nombre;
    private String apellidos;
    private int edad;
    
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
    
    public void imprimirDatos(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }

}
