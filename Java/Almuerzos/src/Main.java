public class Main {
    public static void main(String[] args) {
        PoliComedor poliComedor = new PoliComedor();
        Almuerzo almuerzoPobre = new Almuerzo("Sopa de Fideos", "Seco de Pollo", "Helado con Galletas", "Agua");
        Almuerzo almuerzoPobre2 = new Almuerzo("Sopa de Letras", "Estofado de Carne", "Una Mandarina", "Quaker");
        Almuerzo almuerzoBurgues = new Almuerzo("Rollitos primavera", "Pasta Italiana", "Crème brûlée", "Vino");
        Almuerzo almuerzoBurgues2 = new Almuerzo("Bruschetta", "Moussaka griega", "Tiramisú", "Mojito");

        poliComedor.elegirAlmuerzo(almuerzoPobre2, TipoDeAlmuerzo.POLI);

    }

}


