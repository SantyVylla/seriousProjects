public class Almuerzo {
    private String aperitivo;
    private String platoPrincipal;
    private String postre;
    private String bebida;

    public Almuerzo(String aperitivo, String platoPrincipal, String postre, String bebida) {
        this.aperitivo = aperitivo;
        this.platoPrincipal = platoPrincipal;
        this.postre = postre;
        this.bebida = bebida;
    }

    public String getPlatoPrincipal() {
        return platoPrincipal;
    }

    public String getAperitivo() {
        return aperitivo;
    }

    public String getPostre() {
        return postre;
    }

    public String getBebida() {
        return bebida;
    }
}





