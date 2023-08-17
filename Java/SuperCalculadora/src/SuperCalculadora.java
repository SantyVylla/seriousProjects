public class SuperCalculadora {

    public static Número sumar(Número sumando, Número sumando2) {
        if(sumando instanceof Complejo || sumando2 instanceof Complejo){
            String complejo1 = Double.toString(sumando.obtenerDecimal() + sumando2.obtenerDecimal());
            String complejo2 = Double.toString(sumando.obtenerComplejo() + sumando2.obtenerComplejo());

            complejo2 += "i";

            double comprobarNegativo = sumando.obtenerComplejo() + sumando2.obtenerComplejo();
            String signo = comprobarSigno(comprobarNegativo);

            //realiza una concatenación, se estan en una concatenación gurdando los dos numeros

            Complejo respuestaComplejo = new Complejo(
                    complejo1 + signo +complejo2
            );

            return respuestaComplejo;
        }
        Decimal resultado = new Decimal(
                sumando.obtenerDecimal() + sumando2.obtenerDecimal());
        return resultado;

    }

    private static String comprobarSigno(double comprobarNegativo) {
        String signo = "";
        if(comprobarNegativo < 0){
            signo = "";
        }else{
            signo = "+";
        }
        return signo;
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

