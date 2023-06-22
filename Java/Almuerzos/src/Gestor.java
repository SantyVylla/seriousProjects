public class Gestor {
    PoliComedor poliComedor;
    Almuerzo almuerzo;
    TipoDeAlmuerzo tipoDeAlmuerzo;

    public Gestor() {
        poliComedor = new PoliComedor();
        almuerzo = new Almuerzo("Sopa de Fideos", "Seco de Pollo", "Helado con Galletas", "Agua");
    }

    public void establecerTipoDeAlmuerzo(TipoDeAlmuerzo tipo) {
        this.tipoDeAlmuerzo = tipo;
    }

}
