public class Cuadrilatero extends FiguraGeometrica {
    private final double lado;
    private final double lado2;
    private final double lado3;
    private final double lado4;

    public Cuadrilatero(double lado, double lado2, double lado3, double lado4) {
        this.lado = lado;
        this.lado2 = lado2;
        this.lado3 = lado3;
        this.lado4 = lado4;
    }

    @Override
    public void dibujar() {
        System.out.println("Cuadrilatero: ");
        for (int i = 0; i < lado2; i++) {
            for (int j = 0; j < lado; j++) {
                System.out.print("#"); // Imprimir un carácter para representar el cuadrilátero
            }
            System.out.println(); // Saltar a la siguiente línea después de imprimir una fila completa
        }
    }

    @Override
    public double calcularPerimetro() {
        perimetro = lado + lado2 + lado3 + lado4;
        return perimetro;
    }
}
