package main;

public class Main {
    public static void main(String[] args) {
        Materia progra2 = new Materia();

        progra2.addStudent(new Estudiante("Juan", "Perez", 20, 12345));
        progra2.addStudent(new Estudiante("Maria", "Lopez", 21, 12346));
        progra2.addStudent(new Estudiante("Pedro", "Gomez", 22, 12347));
        progra2.addStudent(new Estudiante("Ana", "Garcia", 23, 12348));


        System.out.println(progra2.imprimirListaCompleta());


    }
}