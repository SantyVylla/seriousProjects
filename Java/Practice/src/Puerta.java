public class Puerta {
    private ControlAcceso control;

    public Puerta(ControlAcceso control) {
        this.control = control;
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
        System.out.println(String.format("Acceso denegado para %s", nombre));
    }

    protected void permitirAcceso(String nombre) {
        System.out.println(String.format("Hola, bienvenido al aula %s", nombre));
    }

}

