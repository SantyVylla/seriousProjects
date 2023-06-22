public class PoliComedor {
    private AlmuerzoEjecutivo almuerzoEjecutivo;
    private AlmuerzoEjecutivo almuerzoEjecutivo2;
    private Almuerzo almuerzoHumilde;
    private Almuerzo almuerzoHumilde2;

    public PoliComedor() {
        almuerzoHumilde = new Almuerzo("Sopa de Fideos", "Seco de Pollo", "Helado con Galletas", "Agua");
        almuerzoHumilde2 = new Almuerzo("Sopa de Letras", "Estofado de Carne", "Una Mandarina", "Quaker");
        almuerzoEjecutivo = new AlmuerzoEjecutivo("Rollitos primavera", "Pasta Italiana", "Crème brûlée", "Vino");
        almuerzoEjecutivo2 = new AlmuerzoEjecutivo("Bruschetta", "Moussaka griega", "Tiramisú", "Mojito");
    }


    public void verMenu() {
        System.out.println("\t Almuerzos de hoy: ");
        System.out.println(almuerzoHumilde + "\n");
        System.out.println(almuerzoHumilde2 + "\n");
        System.out.println(almuerzoEjecutivo + "\n");
        System.out.println(almuerzoEjecutivo2 +"\n");
    }
}
