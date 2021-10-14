/* EJERCICIO 4:
Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
en 3 cursos (3 arrayList) e imprimir dichos cursos.
*/

package Complementarios.Level2;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    
    public static void main(String[] args) {
        ArrayList<String> alumnos = new ArrayList <String>();
        String [] nombres = {"Roberto","Emanuel","Mabel","Julio","Pablo","Sofia","Soledad","Micaela","Federico","Liliana","Julio","Lucas"};
        
        for(int i = 0; i < nombres.length; i++) {
            alumnos.add(i, nombres[i]);
        }
        
        List<String> curso_1 = alumnos.subList(0, 4);
        List<String> curso_2 = alumnos.subList(4, 8);
        List<String> curso_3 = alumnos.subList(8, 12);

        System.out.println("Alumnos: " + alumnos);
        System.out.println("Curso 1: " + curso_1);
        System.out.println("Curso 2: " + curso_2);
        System.out.println("Curso 3: " + curso_3);
    }
}
