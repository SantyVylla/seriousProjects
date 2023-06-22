public class Almuerzo {

    private String entrada;
    private String platoFuerte;
    private String postre;
    private String bebida;
    private double precio = 2.75;

    public Almuerzo(String entrada, String platoFuerte, String postre, String bebida) {
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
        return "Entrada: " + entrada + "\n" + "Plato Fuerte: " + platoFuerte +"\n" + "Postre: " + postre + "\n" + "Acompañado de " + bebida;
    }
}
