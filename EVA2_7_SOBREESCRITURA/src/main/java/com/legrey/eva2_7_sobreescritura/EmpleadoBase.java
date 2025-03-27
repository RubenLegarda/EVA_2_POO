package com.legrey.eva2_7_sobreescritura;

public class EmpleadoBase extends Empleado{
    private int clave;
    private double bono;
    
    public EmpleadoBase (){
    super();
    this.clave = 0;
    this.bono = 0;
    }
     public EmpleadoBase(String nombre, String apellidos,  double salario, int clave, double bono) {
         super(nombre, apellidos, salario);
        this.clave = clave;
        this.bono = bono;

    }
      public int getClave(){
    return clave;
    }
    public void setClave(int valor){
    clave = valor;
    }
      public double getBono(){
    return bono;
    }
    public void setBono(double valor){
    bono = valor;
    }
    
    @Override
    public double calcularSalario(){
    return  super.calcularSalario() * (1 + bono) ;
    //return  getSalario() * (1 + bono) ; TAMBIEN ES FUNCIONAL
    
    }
    
    @Override
    public String toString(){
    String cade = super.toString();
    cade = cade + "\nNumero de empleado: " + clave + "\n" + "Bono: " + bono + "\n" + "Salario total: " + calcularSalario();
    return cade;
    
    }
    

      
}
