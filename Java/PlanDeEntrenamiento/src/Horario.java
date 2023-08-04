public class Horario {
    private Día día;
    private String horaInicio;
    private String horaFin;

    public Horario(Día día, String horaInicio, String horaFin) {
        this.día = día;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
    }

    // Getters y setters
    public Día getDía() {
        return día;
    }

    public void setDía(Día día) {
        this.día = día;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
}
