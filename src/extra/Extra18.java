package extra;

import java.util.Scanner;

/**
 *
 * @author {Gabi}
 */

public class Extra18 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        //         Realizar un algoritmo que calcule la suma de todos los elementos 
//de un vector de tamaño N, con los valores ingresados por el usuario

        int suma = 0;

        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese un valor al vector: ");
            vector[i] = leer.nextInt();
            suma += vector[i];

        }
        System.out.println("la suma de los elementos es: " + suma);
    }
}
