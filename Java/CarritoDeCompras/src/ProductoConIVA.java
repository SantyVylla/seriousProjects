public class ProductoConIVA extends Producto {
    public ProductoConIVA(String producto, int existencia, double precio) {
        super(producto, existencia, precio);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * 0.12;
    }

}
