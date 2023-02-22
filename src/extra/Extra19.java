package extra;

import java.util.Scanner;

/**
 *
 * @author {Gabi}
 */

public class Extra19 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        //Escriba un programa que averigüe si dos vectores de N enteros son iguales (la 
//comparación deberá detenerse en cuanto se detecte alguna diferencia entre los 
//elementos

        int aux = 0;
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los valores del primer vector");
            vector1[i] = leer.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese los valores del segundo vector");
            vector2[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (vector1[i] != vector2[i]) {
                aux = 1;
                break;
            }
        }
        if (aux == 0) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

}
