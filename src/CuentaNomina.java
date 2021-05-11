/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DLCAMPOS
 */
public class CuentaNomina extends CuentaBancaria {
//sobre carga de contructores cuando se crean varios constructores del mismo nombre
    
    public CuentaNomina(String titular, double saldo){
   super(titular,saldo);
    
    }
    
    public CuentaNomina(){
    }
    
    @Override
    public void sacarDinero(double cantidad) {
        if(cantidad <0){
    return;
    }
   
    saldo -= cantidad;
    
    }

    @Override
    public void informarCondicioneLegales() {
        System.out.println("Cuenta nomina");
        System.out.println("No cobra interes");
        
    }
    
}
