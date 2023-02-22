package extra;

import java.util.Scanner;

/**
 *
 * @author {Gabi}
 */
public class Extra15 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        //  Crea una aplicación que le pida dos números al usuario y 
        //este pueda elegir entre sumar, restar, multiplicar y dividir. 
        //La aplicación debe tener una función para cada operación 
//matemática y deben devolver sus resultados para imprimirlos en el main. 

        System.out.print("Ingresa dos numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();

        boolean salir = false;
        String seguir;

        while (salir == false) {
            System.out.println("Calculadora");
            System.out.print("Ingresa una opcion: (1 sumar / 2 restar / 3 multiplicar / 4 dividir / 5 salir");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("La suma es: " + (num1 + num2));

                    break;
                case 2:
                    System.out.println("La resta es: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La multiplicación es: " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La división es: " + (num1 / num2));
                    break;

                case 5:
                    salir = true;
                    break;

            }

        }

    }

}
