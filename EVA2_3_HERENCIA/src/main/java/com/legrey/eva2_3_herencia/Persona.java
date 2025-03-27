package com.legrey.eva2_3_herencia;

public class Persona {
    
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String rfc;

       
    public Persona(){
    this.nombre = "____";
    this.nombre = "____";
    this.nombre = "_____";
    this.edad = 0;
    this.rfc = "_____";
    }
    
        public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String rfc) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.rfc = rfc;
    }
    
    public String getNombre(){
    return nombre;
    }
    public void setNombre(String valor){
    nombre = valor;
    }
    public String getApellidoPaterno(){
    return apellidoPaterno;
    }
    public void setApellidoPaterno(String valor){
    apellidoPaterno = valor;
    }
    public String getApellidoMaterno(){
    return apellidoMaterno;
    }
    public void setApellidoMaterno(String valor){
    apellidoMaterno = valor;
    }
    public int getEdad(){
    return edad;
    }
    public void setEdad(int valor){
    edad = valor;
    }
    public String getRfc(){
    return rfc;
    }
    public void setRfc(String valor){
    rfc = valor;
    }
}
