import java.time.LocalDateTime;

public class AccesoRegistro {
    private final String aula;
    private final boolean autorizado;
    private final LocalDateTime hora;

    /**
     * Crea un nuevo registro de acceso.
     *
     * @param aula       El nombre del aula.
     * @param autorizado Indica si el acceso fue autorizado o no.
     * @param hora       La hora en que se registró el acceso.
     */
    public AccesoRegistro(String aula, boolean autorizado, LocalDateTime hora) {
        this.aula = aula;
        this.autorizado = autorizado;
        this.hora = hora;
    }

    /**
     * Obtiene el nombre del aula del registro de acceso.
     *
     * @return El nombre del aula.
     */
    public String getAula() {
        return aula;
    }

    /**
     * Verifica si el acceso fue autorizado.
     *
     * @return True si el acceso fue autorizado, False si no.
     */
    public boolean esAutorizado() {
        return autorizado;
    }

    /**
     * Obtiene la hora del registro de acceso.
     *
     * @return La hora del acceso.
     */
    public LocalDateTime getHora() {
        return hora;
    }
}

