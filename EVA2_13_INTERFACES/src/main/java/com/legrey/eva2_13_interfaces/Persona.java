
package com.legrey.eva2_13_interfaces;

public class Persona {
    
    private String nombre;
    private String apellido;
    
     public Persona(){
    this.nombre = "";
    this.apellido = "";
    }
    
        public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;

        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


}
