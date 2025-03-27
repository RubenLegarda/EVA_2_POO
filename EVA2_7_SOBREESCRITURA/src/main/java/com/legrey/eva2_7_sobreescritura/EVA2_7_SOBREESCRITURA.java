package com.legrey.eva2_7_sobreescritura;

public class EVA2_7_SOBREESCRITURA {

    public static void main(String[] args) {
       EmpleadoBase empBase = new EmpleadoBase ("Juan", "Perez", 1000, 16, 0.15); 
        System.out.println(empBase);
       EmpleadoTemporal empTemp = new EmpleadoTemporal("Juan","Perez",100,20,25);
        System.out.println(empTemp);

    }
   
}
