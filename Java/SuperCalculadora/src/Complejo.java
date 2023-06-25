public class Complejo extends Número {
    private double real;
    private double imaginaria;

    public Complejo(String notación) {
        super(notación);
    }

    @Override
    protected void transformarADecimal() {
        notación = notación.replaceAll("\\s+","").replaceAll("[^0-9+-i]","");

        // Separa la parte real e imaginaria
        String[] partes = notación.split("\\+");

        if (realValido(partes)) {
            // Convierte la parte real a double
            real = Double.parseDouble(partes[0]);
        }

        if (imaginarioValido(partes)) {
            // Convierte la parte imaginaria a double
            imaginaria = Double.parseDouble(partes[1].replace("i", ""));
        }

        // Crea el número complejo
        valor = real + imaginaria * Math.sqrt(-1);
        
    }

    private static boolean imaginarioValido(String[] partes) {
        return partes.length > 1;
    }

    private static boolean realValido(String[] partes) {
        return partes.length > 0;
    }

    @Override
    protected void transformarANotación() {
        notación = String.valueOf(valor);
    }

    @Override
    public double obtenerDecimal() {
        return valor;
    }

}
