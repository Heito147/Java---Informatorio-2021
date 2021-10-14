/* EJERCICIO 9:
Dado un String de entrada (frase, texto, etc) calcular la cantidad de veces que aparece una letra dada.
*/

package Complementarios.Level1;
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese un texto: ");
        String texto = scan.nextLine();
        System.out.print("Ingrese letra a contar: ");
        char caracter = scan.next().charAt(0);
        
        char[] letras = texto.toCharArray();
        int cantidad = 0;

        for (int i = 0; i < letras.length; i++){
            if (letras[i] == caracter){
                cantidad++;
            }
        }

        System.out.println("Caracteres encontrados: " + cantidad);
        scan.close();
    }
}
