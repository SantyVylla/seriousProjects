public class SuperCalculadora {
    public static Decimal sumar(Número sumando, Número sumando2) {
        Decimal resultado = new Decimal(
                sumando.obtenerDecimal() + sumando2.obtenerDecimal());
        return resultado;
    }

    public static Decimal multiplicar(Número multiplicando, Número multiplicado) {
        Decimal resultado = new Decimal(
                multiplicando.obtenerDecimal() * multiplicado.obtenerDecimal());
        return resultado;
    }

    public static Decimal dividir(Número dividendo, Número divisor) {
        Decimal resultado = new Decimal(
                dividendo.obtenerDecimal() / divisor.obtenerDecimal());
        return resultado;
    }

    public static Decimal restar(Número minuendo, Número sustraendo) {
        Decimal resultado = new Decimal(
                minuendo.obtenerDecimal() - sustraendo.obtenerDecimal());
        return resultado;
    }

    public static Decimal transformarADecimal(Número notación) {
        return new Decimal(notación.obtenerDecimal());
    }

}

