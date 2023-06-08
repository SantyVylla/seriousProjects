public class AnotherDrawingTest {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(5, COLOR.CYAN);
        Cuadrado cuadrado01 = new Cuadrado(8, COLOR.MAGENTA);
        Cuadrado cuadrado02 = new Cuadrado(2, COLOR.BLUE);
        Cuadrado cuadrado03 = new Cuadrado(10, COLOR.PINK);
        cuadrado.dibujar();
        cuadrado01.dibujar();
        cuadrado02.dibujar();
        cuadrado03.dibujar();

    }
}
