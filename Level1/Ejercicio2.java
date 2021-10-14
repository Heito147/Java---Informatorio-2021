/* EJERCICIO 2:
Realizar un programa que solicite por consola 2 números enteros. Para luego imprimir el resultado de la suma, resta, multiplicación, división y módulo (resto de la división) de ambos números.
*/

package Complementarios.Level1;
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int n1 = scan.nextInt();

        System.out.println("Ingrese el segundo número:");
        int n2 = scan.nextInt();

        int sum = n1 + n2;
        int res = n1 - n2;
        int mult = n1 * n2;
        int div = n1 / n2;
        int mod = n1 % n2;

        System.out.println(n1 + " + " + n2 + " = " + sum);
        System.out.println(n1 + " - " + n2 + " = " + res);
        System.out.println(n1 + " * " + n2 + " = " + mult);
        System.out.println(n1 + " / " + n2 + " = " + div);
        System.out.println(n1 + " % " + n2 + " = " + mod);
        scan.close();
    }

}
