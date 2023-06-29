public class Romano extends Número {
    private int decimal;
    private int anterior;
    private int repeticiones = 1;

    public Romano(String notación) {
        super(notación);
    }

    @Override
    protected void transformarADecimal() {
        for (int i = notación.length() - 1; i >= 0; i--) {
            char c = notación.charAt(i);
            int valor = obtenerValorRomano(c);

            if (valor < 0) {
                System.out.println("Número inválido");
                return;
            }

            if (valor == anterior) {
                repeticiones++;
                if (repeticiones > 3) {
                    return;
                }
            } else {
                repeticiones = 1;
            }

            if (valor < anterior) {
                decimal -= valor;
            } else {
                decimal += valor;
                anterior = valor;
            }
        }

        valor = (double) decimal;

    }

    private int obtenerValorRomano(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                System.out.println("Calculo no realizado");
                return -1;
        }

    }

    @Override
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
}