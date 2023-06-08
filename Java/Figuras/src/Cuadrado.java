public class Cuadrado {
    private final double longitud;
    private final COLOR color;

    public Cuadrado(double longitud, COLOR color) {
        this.longitud = longitud;
        this.color = color;
    }


    public void dibujar() {
        dibujarCuadradoconColores();
    }

    private void dibujarCuadradoconColores() {
        for (int i = 0; i < longitud; i++) {
            for (int j = 0; j < longitud; j++) {
                System.out.print(color.getColor() + "*");
            }
            System.out.println();
        }
        System.out.println();

    }
}
