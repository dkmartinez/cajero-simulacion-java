/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DLCAMPOS
 */
public abstract class CuentaBancaria {
    
    String titular;
    TipoDeCuenta tipoDeCuenta;
    protected double saldo;
    
    //CONSTANTES
    
   /* public static final String TIPO_AHORRO = "Ahorro";
    public static final String TIPO_NOMINA = "Nomina";
    
*/
    private final double COMISION = 1.2;
    
    //Contructores
    
    public CuentaBancaria(String titular, TipoDeCuenta tipo, double saldo){
    this.titular = titular;
    this.tipoDeCuenta = tipo;
    this.saldo = saldo;
    
    }
    //sobre carga de contructores cuando se crean varios constructores del mismo nombre
    
    public CuentaBancaria(String titular, double saldo){
    this.titular = titular;
    tipoDeCuenta = TipoDeCuenta.AHORRO;
    this.saldo = saldo;
    
    }
    
    public CuentaBancaria(){
    }
    
    //MEthodos
    public void sacarDinero(double cantidad){
    if(cantidad <0){
    return;
    }
   
    saldo -= cantidad;
   
    }
  
    
    public void ingresarDinero(double cantidad){
        if(cantidad < 0){
        return;
        }
    saldo += cantidad;
    }
    
    public void cambiarTipoCuenta(TipoDeCuenta nuevoTipo){
        
    tipoDeCuenta = nuevoTipo;
    }
    
    public double obtenerSaldo(){
        return saldo;
    }
    
    public abstract void informarCondicioneLegales();
    
   
}
