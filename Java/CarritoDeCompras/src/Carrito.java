public class Carrito {
    protected Producto[] productos;

    public Carrito() {
        this.productos = new Producto[0];
    }

    public void agregarProducto(Producto producto, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            Producto[] nuevoCarrito = new Producto[productos.length + 1];
            System.arraycopy(productos, 0, nuevoCarrito, 0, productos.length);
            nuevoCarrito[productos.length] = producto;
            productos = nuevoCarrito;
        }
        System.out.println(cantidad + " " + producto.getNombre() + "(s) agregados al carrito.");
    }

    public void mostrarCarrito() {
        System.out.println("Productos en el carrito:");
        for (Producto producto : productos) {
            System.out.println(producto.getNombre());
        }
    }

    public void pagar() {
        double total = 0;
        for (int i = 0; i < productos.length; i++) {
            total += productos[i].getPrecio();
        }
        System.out.println("Total a pagar: " + total);
    }
}

