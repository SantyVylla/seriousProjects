public class Main {
    public static void main(String[] args) {
        FiguraGeometrica cuadrado = new Cuadrilatero(4, 4, 4, 4);
        FiguraGeometrica rectangulo = new Cuadrilatero(3, 1 , 3, 1);
        FiguraGeometrica triangulo = new Triangulo(4, 3, 5);
        //FiguraGeometrica circulo = new Circulo(7);

        //cuadrado.dibujar();
        System.out.println(cuadrado.calcularPerimetro());
        //rectangulo.dibujar();
        System.out.println(rectangulo.calcularPerimetro());
        System.out.println(triangulo.calcularPerimetro());
        //triangulo.dibujar();
        //circulo.dibujar();

    }
}