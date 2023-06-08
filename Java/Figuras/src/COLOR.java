public enum COLOR {
    PINK("\u001B[38;5;207m"), BLUE("\u001B[34m"), MAGENTA("\u001B[35m"), CYAN("\u001B[36m");

    private final String codigo;

    COLOR (String codigo) {

        this.codigo = codigo;
    }

    public String getColor() {
        return codigo;
    }
}
