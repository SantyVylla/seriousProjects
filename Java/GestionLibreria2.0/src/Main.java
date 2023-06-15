public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Libro dune = new Libro("Dune", "Frank Herbert", true);
        Libro eighteen = new Libro("1984", "George Orwell", true);
        biblioteca.agregarLibro(dune);
        biblioteca.agregarLibro(eighteen);
        //biblioteca.buscarLibro("Dune");
        //biblioteca.prestarLibro("La Odisea");
        //biblioteca.devolverLibro("La Odisea");

        biblioteca.mostrarcoleccion();




    }
}