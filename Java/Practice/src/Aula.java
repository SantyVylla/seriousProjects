public enum Aula {
    AULA_101("Aula 101"), //Representa el nombre del aula
    AULA_102("Aula 102"),
    AULA_103("Aula 103");

    private final String nombre;


    Aula(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    /**
     * Obtener todas las aulas
     * @return arreglo de aulas
     */
    //public static Aula[] allAulas() {
    //     return values();
    //}

    // U obtenerla por su nombre:
    //public static Aula fromNombre(String nombre) {
    //     return valueOf(nombre);
    //}
}

