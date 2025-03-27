package com.legrey.eva2_16_composicion;

public class Cliente extends Direccion{
    private String nombre;
    private String apellidos;
    private int edad;
    private Direccion direccion;//Cliente HAS A (TIENE UNA) DIRECCION

    public Cliente() {
        this.nombre = "";
        this.apellidos = "";
        this.edad = 0;
        this.direccion = new Direccion();
    }
    public Cliente(String nombre, String apellidos, int edad, String calle, String colonia, String cp, String ciudad, String estado) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.direccion = new Direccion();

    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString(){
    return "Datos del cliente:  \n" + 
            "Nombre: " + nombre + "\n" +
             "Apellido: " + apellidos + "\n" +
             "Edad: " + edad + "\n" +
             "Calle: " + direccion.getCalle() + "\n" +
             "Colonia: " + direccion.getColonia() + "\n" +
             "CP: " + direccion.getCp();
    }
}
