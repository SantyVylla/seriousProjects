public class Decimal extends Número {

    public Decimal(double valor) {
        super(valor);
    }

    public Decimal(String notación) {
        super(notación);
    }

    protected void transformarADecimal() {
        valor = Double.parseDouble(notación);
    }

    protected void transformarANotación() {
        notación = String.valueOf(valor);
    }

    @Override
    public double obtenerDecimal() {
        return valor;
    }

    @Override
    public double obtenerComplejo() {
        return 0;
    }

    @Override
    public String toString() {
        return String.valueOf(valor);
    }
}
