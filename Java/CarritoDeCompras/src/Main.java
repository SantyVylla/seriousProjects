public class Main {
    public static void main(String[] args) {
        Tienda fruteria = new Tienda();

        fruteria.abastecer(
                new Producto("Piña", 5, 1.2),
                new ProductoConIVA("Sandía", 6, 40.0),
                new Producto("Mango", 20, 1.2),
                new ProductoConIVA("Manzana", 7, 0.70),
                new Producto("Pera", 20, 0.2)
        );

        Carrito carrito = new Carrito();

        Producto manzana = fruteria.buscarProducto("Manzana");
        Producto mango = fruteria.buscarProducto("Mango");
        Producto sandía = fruteria.buscarProducto("Sandía");

        carrito.agregarProducto(manzana, 2);
        carrito.agregarProducto(mango, 7);
        carrito.agregarProducto(sandía,4);
        //carrito.mostrarCarrito();
        carrito.pagar();

    }
}