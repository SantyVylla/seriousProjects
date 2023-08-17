public class Puerta {
    private ControlDePuerta control;

    public Puerta(String nombreAula) {
        this.control = new ControlDePuerta(nombreAula);
    }

    public void acceder(Profesor profesor) {
        if (control.intentarAcceso(profesor.getNombre())) {
            permitirAcceso(profesor.getNombre());
        } else {
            bloquearAcceso(profesor.getNombre());
        }
    }

    public void obtenerRegistro() {
        System.out.println("\nRegistros de accesos autorizados:");
        control.obtenerRegistroAutorizados();

        System.out.println("\nRegistros de accesos no autorizados:");
        control.obtenerRegistroNoAutorizados();
    }

    protected void bloquearAcceso(String nombre) {
        System.out.printf("Acceso denegado para %s%n", nombre);
    }

    protected void permitirAcceso(String nombre) {
        System.out.printf("Hola, bienvenido al aula %s%n", nombre);
    }
}
