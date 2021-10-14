/* EJERCICIO 4:
Realizar un programa que calcule el factorial de un número:
n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n.

Sin hacer uso de librerías.
*/

package Complementarios.Level1;
import java.util.Scanner;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        int num = scan.nextInt();
        int resultado = factorial(num);
        System.out.print("El factorial de " + num + " es " + resultado);
        scan.close();
    }

    public static int factorial(int num) {

        int res = 1;
        for (int i = num; i >= 1; i--){
            res = res*i;
        }
        return res;
    }
}
