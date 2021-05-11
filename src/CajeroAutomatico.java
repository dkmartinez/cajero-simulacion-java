
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DLCAMPOS
 */
public class CajeroAutomatico {
   
        
  CuentaBancaria cuentaBancariaActual;
  
  CajeroAutomatico(String identificador, String contraseña) {
  double cantidadAleatoria = ThreadLocalRandom.current().nextDouble(0, 50000);
  
  cuentaBancariaActual = new CuentaAhorro("Nombre", cantidadAleatoria);
   
          
  }
    void mostrarSaldo() {
        System.out.println("Su saldo actual es " + cuentaBancariaActual.obtenerSaldo());
    }
    
    void ingresarDinero() {
        System.out.println("¿Cuanto dinero quiere ingresar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.ingresarDinero(cantidad);
    }
    public void sacarDinero(){
        System.out.println("¿Cuanto dinero quiere sacar?");
        Scanner scanner = new Scanner(System.in);
        double cantidad = scanner.nextDouble();
        cuentaBancariaActual.sacarDinero(cantidad);
   
    }
    
    
    void consultarUltimosMovimientos(){
        GeneradorAleatorioMovimientos generadorAleatorioDeMovimientos = new GeneradorAleatorioMovimientos();
        System.out.println("¿Cuantos movimientos quiere consultar?");
        Scanner scanner = new Scanner(System.in);
        int numeroDeMovimientos = scanner.nextInt();
        ArrayList<String> movimientos = generadorAleatorioDeMovimientos.obtenerMovimientos(numeroDeMovimientos, "pesos");
        mostrarMovimientos(movimientos);
    }
    
    void mostrarMovimientos(ArrayList<String> movimientos){
    for(String movimiento: movimientos){
        System.out.println(movimiento);
    }
    }
    
    protected void mostrarCondicionesLegales(){
    cuentaBancariaActual.informarCondicioneLegales();
    }
    
    void salir(){
        System.out.println("Gracias por utilizar nuestros servicios");
    }
}
