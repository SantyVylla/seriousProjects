public class Hexadecimal extends Número {
    public Hexadecimal(String notación) {
        super(notación);
    }

    @Override
    protected void transformarADecimal() {
        int decimal = Integer.parseInt(notación, 16);
        valor = (double) decimal;
    }

    @Override
    protected void transformarANotación() {
        int decimal = (int) valor;
        notación = Integer.toHexString(decimal);
    }

    @Override
    public double obtenerDecimal() {
        return valor;
    }

    @Override
    public double obtenerComplejo() {
        return 0;
    }
}
