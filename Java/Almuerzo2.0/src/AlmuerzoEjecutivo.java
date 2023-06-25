public class AlmuerzoEjecutivo extends Almuerzo {
    private double precio = 3.75;
    public AlmuerzoEjecutivo(String entrada, String platoFuerte, String postre, String bebida) {
        super(entrada, platoFuerte, postre, bebida);
        double precio;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
