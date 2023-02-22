/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class extra11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        Escribir un programa que lea un número entero y devuelva el número de dígitos que
//componen ese número. Por ejemplo, si introducimos el número 12345, el programa
//deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
//de división. Nota: recordar que las variables de tipo entero truncan los números o
//resultados.

        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero para calcular la cantidad de digitos que posee");
        int num = leer.nextInt();
        int i=0;
        do {
            num = num/10;
            i++;
        } while (num>=10);
        System.out.println("la cantidad de digitos que posee el numero ingresado es: " +(i+1));
        
        
                
        
        
        
    }
    
}
