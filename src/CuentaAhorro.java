/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DLCAMPOS
 */

//ahora en git
public class CuentaAhorro extends CuentaBancaria{
    
    private final double COMISION = 0.12;

    public CuentaAhorro(String titular, TipoDeCuenta tipo, double saldo){
    super(titular,tipo, saldo);
    
    }
    //sobre carga de contructores cuando se crean varios constructores del mismo nombre
    
    public CuentaAhorro(String titular, double saldo){
   super(titular,saldo);
    
    }
    
    public CuentaAhorro(){
    }
    
    @Override
    public void sacarDinero(double cantidad) {
        if(cantidad <0){
    return;
    }
   
    saldo -= cantidad;
    saldo -= COMISION;
    }

    @Override
    public void informarCondicioneLegales() {
        System.out.println("Condiciones legales");
        System.out.println("& asi");
    }
    
}
