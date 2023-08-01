public class Tienda {
    private Producto[] productos;
    private Carrito carrito;

    public Tienda() {
        this.productos = new Producto[0];
    }

    public void abastecer(Producto... productos) {
        Producto[] nuevosProductos = new Producto[this.productos.length + productos.length];

        for (int i = 0; i < this.productos.length; i++) {
            nuevosProductos[i] = this.productos[i];
        }

        for (int i = 0; i < productos.length; i++) {
            nuevosProductos[this.productos.length + i] = productos[i];
        }

        this.productos = nuevosProductos;
    }

    public Producto buscarProducto(String nombre) {
        for (int i = 0; i < this.productos.length; i++) {
            if (this.productos[i].getNombre().equals(nombre)) {
                return this.productos[i];
            }
        }
        return null;
    }

}
