import java.time.LocalDateTime;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ControlDePuerta implements ControlAcceso {
    private final String aula;
    private final Map<String, List<AccesoRegistro>> accesosAutorizados;
    private final Map<String, List<AccesoRegistro>> accesosNoAutorizados;

    public ControlDePuerta(String aula) {
        this.aula = aula;
        this.accesosAutorizados = new ConcurrentHashMap<>();
        this.accesosNoAutorizados = new ConcurrentHashMap<>();
        inicializarAccesos();
    }

    private void inicializarAccesos() {
        accesosAutorizados.put(Profesor.CARLOS.getNombre(), new ArrayList<>());
        accesosNoAutorizados.put(Profesor.ERICK.getNombre(), new ArrayList<>());
        accesosNoAutorizados.put(Profesor.PEPITO.getNombre(), new ArrayList<>());
    }

    public boolean intentarAcceso(String nombre) {
        try {
            LocalDateTime horaIntento = LocalDateTime.now();
            Map<String, List<AccesoRegistro>> autorizados = obtenerAccesosAutorizados();
            Map<String, List<AccesoRegistro>> noAutorizados = obtenerAccesosNoAutorizados();

            boolean accesoPermitido = accesoPermitido(autorizados, noAutorizados, nombre);
            registrarAcceso(nombre, aula, accesoPermitido, horaIntento);
            return accesoPermitido;
        } catch (Exception e) {
            System.err.println("Error al intentar acceso: " + e.getMessage());
            return false;
        }
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

    protected void imprimirRegistro(Map<String, List<AccesoRegistro>> registros) {
        registros.forEach((nombre, accesoRegistros) ->
                accesoRegistros.forEach(accesoRegistro -> {
                    String acceso = accesoRegistro.esAutorizado() ? "Autorizado" : "No autorizado";
                    System.out.println("Nombre: " + nombre + ", " + accesoRegistro.getAula() + ", Hora: " + accesoRegistro.getHora());
                })
        );
    }

    public void obtenerRegistroAutorizados() {
        imprimirRegistro(accesosAutorizados);
    }

    public void obtenerRegistroNoAutorizados() {
        imprimirRegistro(accesosNoAutorizados);
    }

    private boolean accesoPermitido(Map<String, List<AccesoRegistro>> autorizados, Map<String, List<AccesoRegistro>> noAutorizados, String nombre) {
        return autorizados.containsKey(nombre) && !noAutorizados.containsKey(nombre);
    }
}
