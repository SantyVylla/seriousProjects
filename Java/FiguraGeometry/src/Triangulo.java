public class Triangulo extends FiguraGeometrica {
    private final double lado;
    private final double lado2;
    private final double lado3;
    private double altura;

    public Triangulo(double lado, double lado2, double lado3) {
        this.lado = lado;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    @Override
    public void dibujar() {
        calcularAltura();
        System.out.println("Triangulo: ");
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void calcularAltura() {
        altura = Math.sqrt(Math.pow(lado, 2) - Math.pow(lado2 / 2, 2));
    }

    @Override
    public double calcularPerimetro() {
        perimetro = lado + lado2 + lado3;
        return perimetro;
    }
}
