package extra;

import java.util.Scanner;

/**
 *
 * @author {Gabi}
 */

public class Extra20 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        //Crear una función rellene un vector con números aleatorios, pasándole un arreglo por 
//parámetro. Después haremos otra función o procedimiento que imprima el vector.
        System.out.println("Ingrese el tamaño del vector: ");
        int n = leer.nextInt();
        int[] vector = new int[n];
        completarVector(vector, n);
        mostrarVector(vector, n);
    }

    public static int[] completarVector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100);
        }
        return vector;
    }

    public static void mostrarVector(int[] vector, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(" " + vector[i]);

        }
        System.out.println("");
    }

}


