import java.util.HashMap;
import java.util.Map;

public class PoliComedor {
    private AlmuerzoEjecutivo almuerzoEjecutivo;
    private AlmuerzoEjecutivo almuerzoEjecutivo2;
    private Almuerzo almuerzoHumilde;
    private Almuerzo almuerzoHumilde2;

    private Map<String, Almuerzo> menu;

    public PoliComedor() {
        almuerzoHumilde = new Almuerzo("Sopa de Fideos", "Seco de Pollo", "Helado con Galletas", "Agua");
        almuerzoHumilde2 = new Almuerzo("Sopa de Letras", "Estofado de Carne", "Una Mandarina", "Quaker");
        almuerzoEjecutivo = new AlmuerzoEjecutivo("Rollitos primavera", "Pasta Italiana", "Crème brûlée", "Vino");
        almuerzoEjecutivo2 = new AlmuerzoEjecutivo("Bruschetta", "Moussaka griega", "Tiramisú", "Mojito");

        menu = new HashMap<>();
        menu.put("almuerzoHumilde", almuerzoHumilde);
        menu.put("almuerzoHumilde2", almuerzoHumilde2);
        menu.put("almuerzoEjecutivo", almuerzoEjecutivo);
        menu.put("almuerzoEjecutivo2", almuerzoEjecutivo2);
    }


    public void verMenu() {
        System.out.println("\t Almuerzos de hoy: ");
        for (Almuerzo almuerzo : menu.values()) {
            System.out.println(almuerzo + "\n");
        }
    }


    public void elegirAlmuerzo(String almuerzoElegido) {
        Almuerzo almuerzo = menu.get(almuerzoElegido);
        if (existe(almuerzo)) {
            double precio = almuerzo.getPrecio();
            System.out.println("El precio del almuerzo elegido es: $" + precio);
        }
        else {
            System.out.println("El almuerzo elegido no está disponible en el menú.");
        }
    }

    private static boolean existe(Almuerzo almuerzo) {
        return almuerzo != null;
    }
}

