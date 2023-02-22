/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extra;


import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class extra10 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
//      Realice un programa para que el usuario adivine el resultado de una multiplicación entre
//dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
//si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
//al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
//utilizar la función Math.random() de Java.  

    Scanner leer = new Scanner(System.in);
        System.out.println("Dado los siguientes numeros, determine el resultado de su producto");
        int num1 = (int) (Math.random()*10);
        num1 = abs(num1);
        int num2 =(int) (Math.random()*10);
        num2 = abs(num2);
        int num3 = num1*num2;
        System.out.println("Los valores a multiplicar son: " +num1+  " y " +num2);
        int resultado;
        do{
            System.out.print("Ingrese el resultado: ");
        resultado = leer.nextInt();
        } while(resultado!=num3);
    }

}
