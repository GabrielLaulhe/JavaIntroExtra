package extra;

import java.util.Scanner;

/**
 *
 * @author {Gabi}
 */
public class Extra7 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");
//Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el promedio
//de n números (n>0). El valor de n se solicitará al principio del programa y los números
//serán introducidos por el usuario. Realice dos versiones del programa, una usando el
//bucle “while” y otra con el bucle “do - while”.

    public static void main(String[] args) {

        System.out.println("Forma While");
        formaWhile();
        System.out.println("Forma DoWhile");
        formaDoWhile();
    }

    public static void formaDoWhile() {

        System.out.println("Ingrese la cantidad de numeros a tener en cuenta");
        int n = leer.nextInt();
        int suma = 0, numMax = 0, numMin = 0, numAux = 0, i = 0;
        do {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma = num + suma;

            if (num > numMax) {
                numMax = num;

            }
            if (i == 0) {
                numMin = num;
            }
            if (numMin > num) {
                numMin = num;
            }
            i++;
        } while (n != i);
        System.out.println("El valor maximo es de: " + numMax + " y el valor minimo es de: " + numMin);
        System.out.println("El promedio es de " + (suma / i));
    }

    public static void formaWhile() {

        System.out.println("Ingrese la cantidad de numeros a tener en cuenta");
        int n = leer.nextInt();
        int suma = 0, numMax = 0, numMin = 0, numAux = 0, i = 0;

        while (n != i) {
            System.out.println("Ingrese un numero");
            int num = leer.nextInt();
            suma = num + suma;

            if (num > numMax) {
                numMax = num;

            }
            if (i == 0) {
                numMin = num;
            }
            if (numMin > num) {
                numMin = num;
            }
            i++;

        }
        System.out.println("El valor maximo es de: " + numMax + " y el valor minimo es de: " + numMin);
        System.out.println("El promedio es de " + (suma / i));
    }
}
