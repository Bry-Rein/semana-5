/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana.pkg5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ulacit
 */
public class Semana5 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        int numero = (int) (Math.random() *100) ; 
        System.out.print(numero);
        System.out.println(""); 
        int cuenta = 0;
  
    
        Scanner scanner = new Scanner( System.in);
        System.out.println("INTRODUZCA el numero");
        int decision =scanner.nextInt();

        while (decision != numero){     
 
            if(numero > decision){
             System.out.println("es menor");
            }else if (numero < decision){
             System.out.println("es mayor"); 
            }
            
            System.out.println("INTRODUZCA el numero");
            decision =scanner.nextInt();
        }
        
        System.out.println("adivino");
    }
}
  
