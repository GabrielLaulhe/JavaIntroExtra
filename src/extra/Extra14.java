package extra;

import java.util.Scanner;

/**
 *
 * @author {Gabi}
 */

public class Extra14 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
//Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
//hijos. Escriba un programa que pida la cantidad de familias y para cada familia la cantidad
//de hijos para averiguar la media de edad de los hijos de todas las familias.
    public static void main(String[] args) {
        int n, m, edades = 0, cantH = 0;
        System.out.println("Ingrese la cantidad de familias: ");
        n = leer.nextInt();
        int aux = n;
        while (aux > 0) {
            System.out.println("Ingrese la cantidad de hijos para la familia " + (n - aux + 1));
            m = leer.nextInt();
            cantH += m;
            for (int i = 1; i <= m; i++) {
                System.out.println("Ingrese la edad del hijo " + i);
                int edad = leer.nextInt();
                edades += edad;

            }
            aux--;
        }
        System.out.println("El promedio de edades de los hijos es: " + (edades / cantH));
    }
}
