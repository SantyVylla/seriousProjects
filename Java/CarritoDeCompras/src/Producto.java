public class Producto {
    private String nombre;
    private int existencia;
    private double precio;

    public Producto(String nombre, int existencia, double precio) {
        this.nombre = nombre;
        this.existencia = existencia;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getExistencia() {
        return existencia;
    }

    public double getPrecio() {
        return precio;
    }

}
