public abstract class Número {
    protected double valor;
    protected String notación;

    public Número(double valor){
        this.valor = valor;
        transformarANotación();
    }

    public Número(String notación) {
        //todo: validar formato: Expresión Regular
        this.notación = notación;
        transformarADecimal();
    }

    protected abstract void transformarADecimal();
    protected abstract void transformarANotación();
    public abstract double obtenerDecimal();

    public abstract double obtenerComplejo();
}

