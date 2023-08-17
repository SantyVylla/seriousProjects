package main;

import java.util.ArrayList;
import java.util.Collections;

public class Materia {
    ArrayList<Estudiante> lista;

    public Materia() {
        lista = new ArrayList<>();
    }

    public void addStudent(Estudiante estudiante) {
        lista.add(estudiante);
    }

    public ArrayList imprimirListaCompleta() {
        Collections.sort(lista);
        return lista;
    }
}
