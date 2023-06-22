public class Romano extends Número {
    private static final int[] valoresRomanos = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] simbolosRomanos = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
            "IX", "V", "IV", "I"};

    public Romano(String notación) {
        super(notación);
    }

    @Override
    protected void transformarADecimal() {
        int decimal = 0;
        int anterior = 0;

        for (int i = notación.length() - 1; i >= 0; i--) {
            char letra = notación.charAt(i);
            int valor = obtenerValorRomano(letra);

            if (valor < anterior) {
                decimal -= valor;
            } else {
                decimal += valor;
                anterior = valor;
            }
        }

        valor = decimal;
    }

    private int obtenerValorRomano(char letra) {
        switch (letra) {
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
                return 0;
        }
    }

    @Override
    protected void transformarANotación() {
        StringBuilder builder = new StringBuilder();
        int numero = (int) valor;

        for (int i = 0; i < valoresRomanos.length; i++) {
            while (numero >= valoresRomanos[i]) {
                builder.append(simbolosRomanos[i]);
                numero -= valoresRomanos[i];
            }
        }

        notación = builder.toString();
    }

    @Override
    public double obtenerDecimal() {
        return valor;
    }

}
