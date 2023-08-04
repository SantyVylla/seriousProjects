import java.time.LocalDateTime;

public class AccesoRegistro {
    private String aula;
    private boolean autorizado;
    private LocalDateTime hora;

    public AccesoRegistro(String aula, boolean autorizado, LocalDateTime hora) {
        this.aula = aula;
        this.autorizado = autorizado;
        this.hora = hora;
    }

    public String getAula() {
        return aula;
    }

    public boolean esAutorizado() {
        return autorizado;
    }

    public LocalDateTime getHora() {
        return hora;
    }
}