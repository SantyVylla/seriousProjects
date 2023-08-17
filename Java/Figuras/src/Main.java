public class Main {
    public static void main(String[] args) {
        FiguraGeometrica cuadrado = new Cuadrilatero(4, 4, 4, 4);
        FiguraGeometrica rectangulo = new Cuadrilatero(3, 6, 3, 6);
        FiguraGeometrica triangulo = new Triangulo(4, 3, 5);
        FiguraGeometrica circulo = new Circulo(7);

        circulo.dibujar();
        //System.out.println("Perimetro: " + circulo.calcularPerimetro());

    }
}