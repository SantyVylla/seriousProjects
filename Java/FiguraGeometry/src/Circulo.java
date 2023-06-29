public class Circulo extends FiguraGeometrica {
    private final double radio;
    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public void dibujar() {
        for (int y = (int) -radio; y <= radio; y++) {
            for (int x = (int) -radio; x <= radio; x++) {
                if (x * x + y * y <= radio * radio) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
    }
}

    @Override
    public double calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
