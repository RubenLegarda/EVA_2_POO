
package com.legrey.eva2_2_herencia;

public class Proveedor {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String rfc;
    private boolean credito;
    
    public Proveedor(){
    this.nombre = "Ruben";
    this.nombre = "Legarda";
    this.nombre = "Reyna";
    this.edad = 19;
    this.rfc = "geiwgyfef";
    this.credito = false;
    }

    public Proveedor(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String rfc, boolean credito) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.rfc = rfc;
        this.credito = credito;
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
    public boolean getCredito(){
    return credito;
    }
    public void setCredito(boolean valor){
    credito = valor;
    }
}
    