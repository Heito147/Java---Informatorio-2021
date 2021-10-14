/* EJERCICIO 7:
Crear una función que dado 2 argumentos (int, siendo el primero menor al
segundo), nos devuelva un array de Strings. Con la secuencia de números
enteros de principio a final. Pero si el número es multiplo de 2 colocara el valor
“Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara
“FizzBuzz”.
Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el
segundo con qué valor debe frenar (no se incluye en el cálculo)
Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
*/

package Complementarios.Level2;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio7 {
    
    public static void main(String[] args) {
        System.out.println(numMulti(1,8));
    }

    private static List<String> numMulti(int n1, int n2) {
        List<String> listaNum = new ArrayList<>();

        for (int i = n1; i < n2 ; ++i) {
            String l = String.valueOf(i);

            if (i % 2 == 0 && i % 3 == 0 ) {
                l = "FizzBazz";
            }

            else if (i % 2 == 0) {
                l = "Fizz";
            }

            else if ( i % 3 == 0) {
                l = "Buzz";
            }

            listaNum.add(l);
        }

        return listaNum;
    }
}
