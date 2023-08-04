import java.time.LocalDateTime;
import java.util.*;

public class ControlDePuerta {
    private String aula;
    private Map<String, List<AccesoRegistro>> accesosAutorizados;
    private Map<String, List<AccesoRegistro>> accesosNoAutorizados;

    public ControlDePuerta(String aula) {
        this.aula = aula;
        accesosAutorizados = new HashMap<>();
        accesosNoAutorizados = new TreeMap<>();
        inicializarAccesos();
    }

    private void inicializarAccesos() {
        accesosAutorizados.put("Carlos", new ArrayList<>());
        accesosNoAutorizados.put("Erick", new ArrayList<>());
        accesosAutorizados.put("Cruihsf", new ArrayList<>());

    }

    protected boolean intentarAcceso(String nombre) {
        LocalDateTime horaIntento = LocalDateTime.now();
        boolean accesoPermitido = obtenerAccesosAutorizados().containsKey(nombre) &&
                !obtenerAccesosNoAutorizados().containsKey(nombre);

        registrarAcceso(nombre, aula, accesoPermitido, horaIntento);
        return accesoPermitido;
    }

    public void registrarAcceso(String nombre, String aula, boolean autorizado, LocalDateTime horaIntento) {
        Map<String, List<AccesoRegistro>> registros = autorizado ? accesosAutorizados : accesosNoAutorizados;
        List<AccesoRegistro> registroActual = registros.getOrDefault(nombre, new ArrayList<>());
        registroActual.add(new AccesoRegistro(aula, autorizado, horaIntento));
        registros.put(nombre, registroActual);
    }

    public Map<String, List<AccesoRegistro>> obtenerAccesosAutorizados() {
        return new HashMap<>(accesosAutorizados);
    }

    public Map<String, List<AccesoRegistro>> obtenerAccesosNoAutorizados() {
        return accesosNoAutorizados;
    }

    protected void imprimirRegistro(Map<String, List<AccesoRegistro>> registros, String titulo) {
        System.out.println("Registros de " + titulo + ":");
        for (Map.Entry<String, List<AccesoRegistro>> entry : registros.entrySet()) {
            String nombre = entry.getKey();
            List<AccesoRegistro> accesoRegistros = entry.getValue();

            for (AccesoRegistro accesoRegistro : accesoRegistros) {
                String acceso = accesoRegistro.esAutorizado() ? "Autorizado" : "No autorizado";
                System.out.println("Nombre: " + nombre + " , " + accesoRegistro.getAula() + ", Hora: " + accesoRegistro.getHora());
            }
        }
    }

    public void obtenerRegistroAutorizados() {
        imprimirRegistro(accesosAutorizados, "accesos autorizados");
    }

    public void obtenerRegistroNoAutorizados() {
        imprimirRegistro(accesosNoAutorizados, "accesos no autorizados");
    }
}


