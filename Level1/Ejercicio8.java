/* EJERCICIO 8:
Crear una aplicación que solicite de entrada los datos de una persona en este orden:
Nombre y Apellido
Edad
Dirección
Ciudad
Luego imprimirá el siguiente mensaje:
{Ciudad} - {Dirección} - {Edad} - {Nombre y Apellido}
*/

package Complementarios.Level1;
import java.util.Scanner;

public class Ejercicio8 {
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Nombre y Apellido: ");
        String nomApell = scan.nextLine();

        System.out.print("Edad: ");
        String edad = scan.nextLine();

        System.out.print("Dirección: ");
        String direccion = scan.nextLine();
        
        System.out.print("Ciudad: ");
        String ciudad = scan.nextLine();

        System.out.print(ciudad + " - " + direccion + " - "+ edad + " - " + nomApell);

        scan.close();
    }
}
