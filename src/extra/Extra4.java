package extra;

import java.util.Scanner;

/**
 *
 * @author {Gabi}
 */

public class Extra4 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
//        Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
//equivalente en romano.

        System.out.println("Ingrese un numero entre 1 y 10");
        int numero = leer.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Su numero es I");
                break;
            case 2:
                System.out.println("Su numero es II");
                break;
            case 3:
                System.out.println("Su numero es III");
                break;
            case 4:
                System.out.println("Su numero es IV");
                break;
            case 5:
                System.out.println("Su numero es V");
                break;
            case 6:
                System.out.println("Su numero es VI");
                break;
            case 7:
                System.out.println("Su numero es VII");
                break;
            case 8:
                System.out.println("Su numero es VIII");
                break;
            case 9:
                System.out.println("Su numero es IX");
                break;
            case 10:
                System.out.println("Su numero es X");
                break;
            default:
                System.out.println("El numero ingresado no es correcto");
        }

    }
}
