public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        biblioteca.mostrarColeccion();
        biblioteca.agregarLibro("1984", "George Orwell", "1981281025");
        biblioteca.agregarLibro("Dune", "Frank Herbert", "14545381033");
        biblioteca.agregarLibro("It", "Stephen King", "4543541244");
        biblioteca.agregarLibro("Harry Potter: La coleccion completa", "J.K Rowling", "9788418173196");
        biblioteca.mostrarColeccion();
        biblioteca.prestarLibro("pepe", "1984");
        biblioteca.mostrarColeccion();
        biblioteca.prestarLibro("juan", "La Odisea");
        biblioteca.mostrarColeccion();
        biblioteca.devolver("1984");

    }
}

