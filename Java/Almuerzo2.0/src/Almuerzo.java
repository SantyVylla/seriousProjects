public class Almuerzo {

    private final String nombre;
    private String entrada;
    private String platoFuerte;
    private String postre;
    private String bebida;
    private final double precio = 2.75;

    public Almuerzo(String nombre, String entrada, String platoFuerte, String postre, String bebida) {
        this.nombre = nombre;
        this.entrada = entrada;
        this.platoFuerte = platoFuerte;
        this.postre = postre;
        this.bebida = bebida;
        double precio;
    }
    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return nombre + "Entrada: " + entrada + "\n" + "Plato Fuerte: " + platoFuerte +"\n" + "Postre: " + postre + "\n" + "Acompañado de " + bebida;
    }
}
