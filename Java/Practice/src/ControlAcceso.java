public interface ControlAcceso {
    boolean intentarAcceso(String nombre);
    void obtenerRegistroAutorizados();
    void obtenerRegistroNoAutorizados();
}
