package com.legrey.eva2_6_sobreestructura;

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
     
    @Override
    public void imprimirDatos(){
        System.out.println("Clave: " + clave);
        super.imprimirDatos();
    }
}
