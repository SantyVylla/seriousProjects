public enum TipoDeAlmuerzo {
    POLI(2.25), EJECUTIVO(3.75);

    private double precio;

    TipoDeAlmuerzo(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }
}
