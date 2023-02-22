package extra;

import java.util.Scanner;

/**
 *
 * @author {Gabi}
 */

public class Extra22 {

    
    public static int suma = 0;

    public static void main(String[] args) {
        // Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios y 
        //muestre la suma de sus elementos.

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese las filas para la matriz:");
        int n = scan.nextInt();
        System.out.println("Ingrese las columnas para la matriz:");
        int m = scan.nextInt();
        int[][] matriz = new int[n][m];
        imprimirMatriz(rellenarMatriz(matriz, n, m), n, m);
        System.out.println("La suma de los elementos es: " + suma);
    }

    public static int[][] rellenarMatriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                suma += matriz[i][j];

            }

        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz, int n, int m) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matriz[i][j] + " ");

            }
            System.out.println("");

        }
    }

}
