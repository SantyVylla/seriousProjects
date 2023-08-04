package main;

public class Estudiante  implements Comparable<Estudiante>{
    private final String nombre;
    private final String apellido;
    private int nota1;
    private int nota2;

    public Estudiante(String nombre, String apellido, int nota1, int nota2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nota1 = nota1;
        this.nota2 = nota2;
        calcularPromedio();
    }

    public double calcularPromedio() {
        double promedio = (nota1 + nota2) / 2;
        return promedio;
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public int compareTo(Estudiante otroEstudiante) {
        return nombre.compareTo(otroEstudiante.nombre);
    }
}
