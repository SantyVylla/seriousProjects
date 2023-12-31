/**
 * Enumeración de los profesores que pueden acceder al sistema.
 * Cada profesor tiene un nombre y un acceso.
 * El acceso puede ser autorizado o no autorizado.
 *
 */
public enum Profesor {

    CARLOS("Carlos", Acceso.AUTORIZADO),
    ERICK("Erick", Acceso.NO_AUTORIZADO),
    PEPITO("Pepito", Acceso.NO_AUTORIZADO),
    ALFREDO("Alfredo", Acceso.AUTORIZADO);

    private final String nombre;
    private final Acceso acceso;

    Profesor(String nombre, Acceso acceso) {
        this.nombre = nombre;
        this.acceso = acceso;
    }

    public String getNombre() {
        return nombre;
    }

    public Acceso getAcceso() {
        return acceso;
    }

}

