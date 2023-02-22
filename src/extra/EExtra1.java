

package extra;
import java.util.Scanner;
/**
 *
 * @author {Gabi}
 */

public class EExtra1 {
    public static Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        System.out.println("Ingrese los minutos");
       
        int minutos = leer.nextInt();
        int dias,horas;
       dias = (minutos / 1440);      
       horas = (minutos % 1440 )/60;
       
        System.out.println("El equivalente es :" + dias + " dias " + horas + " Hs ") ;
        System.out.println("");
    }

}
