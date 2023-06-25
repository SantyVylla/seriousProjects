import java.util.List;
import java.util.ArrayList;

class Biblioteca {
    private List<Libro> coleccion;

    public Biblioteca() {
        coleccion = new ArrayList<>();
    }

    public void mostrarColeccion() {
        for (Libro libro : coleccion) {
            System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getIsbn());
        }
        System.out.println();
    }

    public void agregarLibro(String titulo, String autor, String isbn) {
        Libro libro = new Libro(titulo, autor, isbn, ESTADO.DISPONIBLE);
        coleccion.add(libro);
    }

    public void prestarLibro(String nombre, String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro != null) {
            libro.setEstado(ESTADO.PRESTADO);
            libro.setPrestadoA(nombre);
        } else {
            System.out.println("El libro " + titulo + " no está disponible en la biblioteca.");
        }
    }

    public void devolver(String titulo) {
        Libro libro = buscarLibro(titulo);
        if (libro != null) {
            libro.setEstado(ESTADO.DISPONIBLE);
            libro.setPrestadoA(null);
        }
    }

    private Libro buscarLibro(String isbn) {
        for (Libro libro : coleccion) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
}
