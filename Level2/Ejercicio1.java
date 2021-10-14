/* EJERCICIO 1:
Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego
imprimir por pantalla el ranking
*/

package Complementarios.Level2;

public class Ejercicio1 {
    
    public static void main(String[] args) {
        String [] ciudades = {"Resistencia", "Corrientes", "Córdoba", "La Plata"};

        for (int i = 1; i < ciudades.length + 1; i++) {
            System.out.println("#" + i + " - " + ciudades[i-1]);
        }
    }
}
