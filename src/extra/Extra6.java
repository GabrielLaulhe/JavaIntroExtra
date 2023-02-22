

package extra;
import java.util.Scanner;
/**
 *
 * @author {Gabi}
 */

public class Extra6 {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        
        int cantPers, cantMenor=0;
        double total = 0, menor = 0, persona, promedio;
        
        System.out.println("Ingrese a cantidad de personas a medir");
        cantPers = leer.nextInt();
        
        for (int i = 0; i < cantPers; i++) {
            System.out.println("Ingrese el numero de la persona " + (i+1) + ":");
            persona = leer.nextDouble();
            if (persona<1.6) {
                cantMenor ++;
                menor = menor + menor;
            }
            total = total + persona;
        }
        promedio = total / cantPers;
        System.out.println("La cantidad de personas menor a 1.6 es " + cantMenor);
        System.out.println("El promedio de altura es: " + promedio);
    }
    
}
