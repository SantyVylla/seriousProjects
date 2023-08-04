public class PlanDeEjercicios {
    private Rutina rutina;
    private Horario horario;

    public PlanDeEjercicios(Rutina rutina, Horario horario) {
        this.rutina = rutina;
        this.horario = horario;
    }

    // Getters y setters
    public Rutina getRutina() {
        return rutina;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
}
