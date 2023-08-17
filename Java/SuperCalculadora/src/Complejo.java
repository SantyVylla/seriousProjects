public class Complejo extends Número {

    private double parteImaginaria;
    private String parteImaginariaEnString;

    public Complejo(String notación) {
        super(notación);
    }

    /*public Complejo(double parteRealDecimal, double parteImaginariaDecimal) {
        super(parteRealDecimal);
        this.parteImaginaria = parteImaginariaDecimal;
    }*/

    @Override
    protected void transformarADecimal() {
        String partesNumerosComplejos[] = notación.split("\\+");

        if (partesNumerosComplejos.length >= 2) {
            valor = Double.parseDouble(partesNumerosComplejos[0].trim());
            parteImaginaria = Double.parseDouble(partesNumerosComplejos[1].replace("i", "").trim());
            notación = valor + " + " + parteImaginaria + "i";
        } else {
            System.out.println("ERROR: La notación del complejo es incorrecta");
        }
    }

    @Override
    protected void transformarANotación() {
        notación = valor + " + " + parteImaginaria + "i";
    }

    @Override
    public double obtenerDecimal() {
        return valor;
    }

    public double obtenerComplejo() {
        return parteImaginaria;
    }

    @Override
    public String toString() {
        return notación;
    }
}
