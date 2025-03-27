package com.legrey.eva2_9_clasesabstractas;

public class Cliente extends Persona{
    private String tipoPersona;

    public Cliente() {
        super();
    }
    
public Cliente(String nombre, String apellido,  int edad, String tipoPersona) {
    super(nombre, apellido, edad);
        this.tipoPersona = tipoPersona;

    }
        
    
    
    public String getTipoPersona(){
    return tipoPersona;
    }
    public void setTipoPersona (String tipoPersona){
        this.tipoPersona = tipoPersona;
    }

    @Override
    public void imprimirDatos() {
        System.out.println("Cliente");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Apellido: " + getApellido());
        System.out.println("Edad: " + getEdad());
        System.out.println("Tipo persona: " + tipoPersona);
    }
    
    
}
