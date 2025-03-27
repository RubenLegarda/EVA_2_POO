package com.legrey.eva2_9_clasesabstractas;

public class EVA2_9_CLASESABSTRACTAS {

    public static void main(String[] args) {
       // Persona perso = new Persona();
       Cliente cliente = new Cliente("Ruben","Legarda", 19, "Fisica");
       cliente.imprimirDatos();
       Empleado empleado = new Empleado("Ruben","Legarda", 19, 782738.0);
       empleado.imprimirDatos();
       
    }
}
