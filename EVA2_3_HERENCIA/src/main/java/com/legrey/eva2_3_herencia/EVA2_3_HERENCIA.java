package com.legrey.eva2_3_herencia;

public class EVA2_3_HERENCIA {

    public static void main(String[] args) {  
    Empleado empleado = new Empleado();
    //EMPLEADO
    empleado.setNombre("Juan");
    System.out.println("Nombre: " + empleado.getNombre());
    empleado.setNumeroEmpleado(100);
    //PROVEEDOR
    Proveedor prov = new Proveedor();
    prov.setNombre("WALMART");
    prov.setCredito(false);
        System.out.println("Nombre: " + prov.getNombre()); 
        System.out.println("Credito: " + prov.getNombre()); 
    //CLIENTE
    Cliente cliente = new Cliente();
    cliente.setRazonSocial("H&M");
        System.out.println("Razon Social: " + cliente.getRazonSocial());
   }
}
