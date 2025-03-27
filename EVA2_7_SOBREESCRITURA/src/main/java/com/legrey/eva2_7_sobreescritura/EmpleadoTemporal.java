package com.legrey.eva2_7_sobreescritura;

public class EmpleadoTemporal extends Empleado {
    private int numeroContrato;
    private int horas;
    
    public EmpleadoTemporal (){
    super();
    this.numeroContrato = 0;
    this.horas = 0;
    }
     public EmpleadoTemporal(String nombre, String apellidos,  double salario, int numeroContrato, int horas) {
         super(nombre, apellidos, salario);
        this.numeroContrato = numeroContrato;
        this.horas = horas;

    }
      public int getNumeroContrato(){
    return numeroContrato;
    }
    public void setNumeroContrato(int valor){
    numeroContrato = valor;
    }
      public double getHoras(){
    return horas;
    }
    public void setHoras(int valor){
    horas = valor;
    }
        @Override
    public double calcularSalario(){
    return  super.calcularSalario() * horas ;
    //return  getSalario() * (1 + bono) ; TAMBIEN ES FUNCIONAL
    
    }
    
    @Override
    public String toString(){
    String cade = super.toString() + "\n";
    cade = cade + "Numero de contrato: " + numeroContrato + "\n" + "Horas: " + horas + "\n" + "Salario total: " + calcularSalario();
    return cade;
    
    }

}
    

