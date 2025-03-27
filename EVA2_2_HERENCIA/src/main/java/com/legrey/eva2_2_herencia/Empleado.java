
package com.legrey.eva2_2_herencia;

public class Empleado {
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private int edad;
    private String rfc;
    private int claveEmpleado;
    
    public Empleado(){
    this.nombre = "Ruben";
    this.nombre = "Legarda";
    this.nombre = "Reyna";
    this.edad = 19;
    this.rfc = "geiwgyfef";
    this.claveEmpleado = 24550215;
    }

    public Empleado(String nombre, String apellidoPaterno, String apellidoMaterno, int edad, String rfc, int claveEmpleado) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.edad = edad;
        this.rfc = rfc;
        this.claveEmpleado = claveEmpleado;
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
    public int getClaveEmpleado(){
    return claveEmpleado;
    }
    public void setClaveEmpleado(int valor){
    claveEmpleado = valor;
    }
}
