package extra;

import java.util.Scanner;

/**
 *
 * @author {Gabi}
 */

public class Extra5 {

    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {

//Una obra social tiene tres clases de socios: 
//o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en 
//todos los tipos de tratamientos. 
//o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento para 
//los mismos tratamientos que los socios del tipo A. 
//o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos 
//tratamientos. 
//o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor 
//real que represente el costo del tratamiento (previo al descuento) y determine el 
//importe en efectivo a pagar por dicho socio
        System.out.println("Ingrese un tipo de socio: A, B o C: ");
        String socio = leer.next();

        System.out.println("Ingrese el costo del tratamiento");
        int costo = leer.nextInt();

        switch (socio) {
            case "A":
                System.out.println("El costo del tratamiento es: " + costo + " Con el descuento de 50% el costo es: " + (costo / 2));
                break;
            case "B":
                System.out.println("El costo del tratamiento es: " + costo + " Con el descuento de 35% el costo es: " + (costo * 0.65));
                break;
            case "C":
                System.out.println("El costo del tratamiento es: " + (costo));
                break;
            default:
                System.out.println("Opcion incorrecta");

        }
    }

}
