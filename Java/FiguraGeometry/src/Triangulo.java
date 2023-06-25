public class Triangulo extends FiguraGeometrica {
    private final double lado;
    private final double lado2;
    private final double lado3;

    public Triangulo(double lado, double lado2, double lado3) {
        this.lado = lado;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void dibujar() {
        System.out.println("Triangulo");
    }

    @Override
    public double calcularPerimetro() {
        perimetro = lado + lado2 + lado3;
        return perimetro;
    }
}
