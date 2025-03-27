package com.legrey.eva2_11_cuenta_banco;

public class CuentaCorriente extends Cuenta{
    private double limiteSaldo;

        public CuentaCorriente(){ 
        super();
        this.limiteSaldo = 0;
    }

    public CuentaCorriente(double saldo, double deposito, double retiro, double limiteSaldo) {
        super(saldo, deposito, retiro);
        this.limiteSaldo = limiteSaldo;
    }

    
    public double getLimiteSaldo() {
        return limiteSaldo;
    }

    public void setLimiteSaldo(double limiteSaldo) {
        this.limiteSaldo = limiteSaldo;
    }

    @Override
    public double Depositar() {
        return super.getSaldo() + super.getDeposito();
    }

    @Override
    public double Retirar() {
     return super.getSaldo() - super.getRetiro();
    }
    
    @Override
    public double saldoFinal() {
     return Depositar() + Retirar();
    }
        
    @Override
    public void imprimirDatos() {
        System.out.println("CUENTA CORRIENTE: ");
        System.out.println("Saldo: " + saldoFinal());
        System.out.println("Saldo Maximo: " + limiteSaldo);

    }
}
