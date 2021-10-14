/* EJERCICIO 3:
Confeccionar un programa que dado un número entero como dato de entrada imprima la secuencia de números (incrementos de 1)
*/

package Complementarios.Level1;
import java.util.Scanner;

public class Ejercicio3 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número:");
        int num = scan.nextInt();
        for (int i = 0; i <= num+1; i++){
            for (int j = 1; j < i; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
        scan.close();
    }
}
