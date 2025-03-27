package com.legrey.eva2_5_protected;

public class Empleado extends Persona{
    private int clave;
    
    public Empleado (){
    super();
    }
     public Empleado(String nombre, String apellidos,  int edad, int clave) {
         super(nombre, apellidos, edad);
        this.clave = clave;

    }
      public int getClave(){
    return clave;
    }
    public void setClave(int valor){
    clave = valor;
    }
     
    public void imprimirDatos(){
        System.out.println("DATOS DEL EMPLEADO");
        System.out.println("Clave: " + clave);
        System.out.println("Nombre: " + super.nombre);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
    }
            
}
