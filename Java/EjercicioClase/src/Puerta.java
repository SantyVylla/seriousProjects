public class Puerta {
    private ControlDePuerta control;

    public Puerta(String aula) {
        this.control = new ControlDePuerta(aula);
    }

    public void acceder(String nombre) {
        if (control.intentarAcceso(nombre)) {
            permitirAcceso();
        } else {
            bloquearAcceso();
        }
    }

    protected void bloquearAcceso() {
        System.out.println("Acceso denegado");
    }

    protected void permitirAcceso() {
        System.out.println("Hola, bienvenido al aula");
    }

    public void obtenerRegistro() {
        control.obtenerRegistroAutorizados();
        control.obtenerRegistroNoAutorizados();
    }
}

