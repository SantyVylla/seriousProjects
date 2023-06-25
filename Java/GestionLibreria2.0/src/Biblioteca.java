import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Libro> libros;

    public Biblioteca() {
        libros = new ArrayList<>();
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }



    public void mostrarcoleccion() {
        for (Libro libro:libros) {
            System.out.println(libro.getTitulo() + libro.getAutor() + libro.estaDisponible());
        }
    }
}
