package com.legrey.eva2_13_interfaces;

public class Empleado extends Persona implements MostrarDatos{
    private String clave;

    
    public Empleado() {
        super();
        this.clave = "";
    }
    public Empleado(String nombre, String apellido,String clave) {
        super(nombre, apellido);
        this.clave = clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    
    public String getClave() {
        return clave;
    }

    
    @Override
    public void imprimirDatos() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Clave: " + getClave());
    }
    
    
}
