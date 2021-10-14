package Complementarios.Level2.Ejercicio6;

public class Empleado {
    String nombre;
    String dni;
    int horasTrabajadas;
    int valorPorHora;

    public Empleado(String nombre, String dni, int horasTrabajadas, int valorPorHora) {

        this.nombre = nombre;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return   "Nombre: " + this.nombre + " - " + "DNI: " + this.dni + " - " + "Horas Trabajadas: " + String.valueOf(this.horasTrabajadas + "hs - " + "Valor por Hora: $" + this.valorPorHora);
    }

    public String sueldo(){
        return "Sueldo: $" + this.horasTrabajadas * this.valorPorHora;
    }

    public String obtDni(){
        return "DNI: " + this.dni;
    }
}
