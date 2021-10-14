/* EJERCICIO 6:
Se desea una aplicación que solicite 2 números enteros y realice la operación de potencia (sin uso de librerías).
*/

package Complementarios.Level1;
import java.util.Scanner;

public class Ejercicio6 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el número base: ");
        int a = scan.nextInt();

        System.out.print("Ingrese la potencia: ");
        int b = scan.nextInt();

        int r = a;
        for (int i = 1 ; i < b; i++){
            r = r*a;
        }
        System.out.print(a + "^" + b + " = " + r);
        scan.close();
    }
}
