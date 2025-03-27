package com.legrey.eva2_11_cuenta_banco;

public abstract class Cuenta {
      private double saldo;
      private double deposito;
      private double retiro;
      
//CONSTRUCTORES
    public Cuenta(){
    this.saldo = 0;
    this.deposito = 0;
    this.retiro = 0;
    
      }

    public Cuenta(double saldo, double deposito, double retiro) {
        this.saldo = saldo;
        this.deposito = deposito;
        this.retiro = retiro;
    }
  
    //GETTER y SETTER
//Saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
//Deposito
    public double getDeposito() {
        return deposito;
    }

    public void setDeposito(double deposito) {
        this.deposito = deposito;
    }
//Retiro
    public void setRetiro(double retiro) {
        this.retiro = retiro;
    }
    
    public double getRetiro() {
        return retiro;
    }

//Metodos Abstractos
    public abstract double Depositar();
    public abstract double Retirar();
    public abstract double saldoFinal();
    public abstract void imprimirDatos();  
}
