/* EJERCICIO 5:
Dados 2 ArrayList que contienen horas-trabajadas (array1) y
valor-por-hora(array2) del resumen de carga de horas semanal de un
empleado. Se debe generar otra lista que contenga los totales y luego
imprimir el total final a cobrar.
*/

package Complementarios.Level2;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio5 {
    
    public static void main(String[] args) {
        
        List<Integer> horas = new ArrayList <Integer> ();
        horas.add(6);
        horas.add(7);
        horas.add(8);
        horas.add(4);
        horas.add(5);
        
        List<Integer> valor_hora = new ArrayList <Integer> ();
        valor_hora.add(350);
        valor_hora.add(345);
        valor_hora.add(550);
        valor_hora.add(600);
        valor_hora.add(320);

        List<Integer> semanal = new ArrayList <Integer> ();

        int total = 0;
        for (int i = 0; i < 5; i++) {
            semanal.add(valor_hora.get(i)*horas.get(i));
            total += semanal.get(i);
        }

        System.out.println("Subtotales: " + semanal);
        System.out.println("Total: $" + total);
    }
}
