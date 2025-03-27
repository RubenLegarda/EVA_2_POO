package com.legrey.eva2_12_final;

public class EVA2_12_FINAL {

    final static int VALOR = 100;
    
    public static void main(String[] args) {
        System.out.println("Valor: " + VALOR);
        //VALOR = 200; NO SE PUEDE MODIFICAR
        Docente docente = new Docente();
    }
}

class Persona{}
class Empleado extends Persona {}
final class Docente extends Empleado{} //HASTA AQUI LLEGA LA HERENCIA
//class DocenteKinder extends Docente{} //NO SE PUEDE HEREDAR
