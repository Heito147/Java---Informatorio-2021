/* EJERCICIO 7:
Realizar un programa que dado un String de entrada en minúsculas lo convierta por completo a mayúsculas. Sin uso de métodos o librerías que realicen toUppercase().
*/

package Complementarios.Level1;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String entrada = scan.nextLine();
        char[] caracteres = entrada.toCharArray();
        
        for (int i = 0; i < caracteres.length; i++){
            if (caracteres[i] >= 'a' && caracteres[i] <= 'z') {
                caracteres[i] = (char)(caracteres[i] - (int) 'a' + (int) 'A');
            }
            System.out.print(caracteres[i]);
        }
        System.out.println();
        scan.close();
    }
}
