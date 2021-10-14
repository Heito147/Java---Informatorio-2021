/* EJERCICIO 5:
Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
*/

package Complementarios.Level1;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        int n1 = scan.nextInt();

        System.out.print("Ingrese el segundo valor: ");
        int n2 = scan.nextInt();

        int res = n1;

        for (int i = 1; i < n2 ; i++){
            res = res + n1;
        }
        System.out.println("El resultado es: " + res);
        scan.close();
    }
}
