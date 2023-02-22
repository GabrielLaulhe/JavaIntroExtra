

package extra;
import java.util.Scanner;
/**
 *
 * @author {Gabi}
 */

public class Extra16 {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        System.out.println("Ingrese la cantidad de personas");
        int n = leer.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese su nombre");
            String nombre = leer.next();
            System.out.println("Ingrese la edad de "+ nombre);
            int edad = leer.nextInt();
            
            if (edad>=18) {
                System.out.println(nombre + " Es mayor de edad");
                
            }else {
                System.out.println(nombre + "Es menor de edad");
            }
            System.out.println("Desea seguir mostrando personas?");
            String resp = leer.next();
            if (resp.equalsIgnoreCase("no")) {
                break;
            }
        }
    }

}
