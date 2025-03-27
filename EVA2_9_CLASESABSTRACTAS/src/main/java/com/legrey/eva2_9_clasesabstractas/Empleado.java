
package com.legrey.eva2_9_clasesabstractas;

public class Empleado extends Persona{
    private double salario;

    public Empleado(String nombre, String apellido, int edad, double salario) {
        super(nombre, apellido, edad);
        this.salario = salario;
    }

    public double getSalario(){
    return salario;
    }    
    
    public void setEmpleado(double salario) {
        this.salario = salario;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Empleado");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Salario: " + salario);
    }
    
    
    
    
    
    
    
}
