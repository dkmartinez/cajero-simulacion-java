
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DLCAMPOS
 */


/*
Programa que emula la interfaz de un cajero automatico. El programa presentara las siguientes opciones: 

Elija una de las siguientes opciones: 
Escriba 1 para consultar su saldo.
Escriba 2 para ingresar dinero. 
Escriba 3 para retirar dinero.
Escriba 4 para consultar sus últimos movimientos.

Para salir escriba cualquier otro numero
Una vez escrita la opción pulse la tecla Enter. 

Una vez el usuario ha elegido la opción, el programa le mostrara por pantalla el número correspondiente a la opcion elegida.

*/

public class Interfaz {
    public static void main(String [] args){
        
        System.out.println("Por favor intoduzca su numero de identificacion");
        Scanner scanner= new Scanner(System.in);
        String identificador = scanner.nextLine();
        
        System.out.println("Por favor introduzca su contraseña");
        String contrasena = scanner.nextLine();
        CajeroAutomatico cajero = new CajeroAutomatico(identificador, contrasena);
        
        
        int opcionElegida;
        
        
        do{
            
        System.out.println("Elija una de las siguientes opciones: ");
        System.out.println("Escriba 1 para consultar su saldo.");
        System.out.println("Escriba 2 para ingresar dinero." );
        System.out.println("Escriba 3 para retirar dinero.");
        System.out.println("Escriba 4 para consultar sus últimos movimientos");
        System.out.println("Escriba 5 para consultar Terminos y condiciones");
        System.out.println("Para salir escriba cualquier otro numero");
        
        Scanner scanner2= new Scanner(System.in);
        
         opcionElegida = scanner2.nextInt();
         
         switch(opcionElegida){
             case 1: cajero.mostrarSaldo();
             break;
             case 2: cajero.ingresarDinero();
             break;
             case 3: cajero.sacarDinero();
             break;
             case 4: cajero.consultarUltimosMovimientos();
             break;
             case 5: cajero.mostrarCondicionesLegales();
             break;
             default: 
                 cajero.salir();
         
         }
            
        }
        //while(opcionElegida <= 5);
        while((opcionElegida == 1) || (opcionElegida == 2) || (opcionElegida ==3) || opcionElegida ==4 || opcionElegida ==5);
        
    }
}


