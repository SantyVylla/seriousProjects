public class Binario extends Número {
    public Binario(String notación) {
        super(notación);
    }

    @Override
    protected void transformarADecimal() {
        int decimal = Integer.parseInt(notación, 2);
        valor = (double) decimal;
    }

    @Override
    protected void transformarANotación() {
        int decimal = (int) valor;
        notación = Integer.toBinaryString(decimal);
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
