public class PoliComedor {

    public void elegirAlmuerzo(Almuerzo almuerzo, TipoDeAlmuerzo tipoAlmuerzo) {
        double costoAlmuerzo = tipoAlmuerzo.getPrecio();
        System.out.println("Se ha elegido el almuerzo:"+ tipoAlmuerzo);
        System.out.println("Plato principal: " + almuerzo.getPlatoPrincipal());
        System.out.println("Aperitivo: " + almuerzo.getAperitivo());
        System.out.println("Postre: " + almuerzo.getPostre());
        System.out.println("Bebida: " + almuerzo.getBebida());
        System.out.println("Costo total: $" + costoAlmuerzo);
    }


}


