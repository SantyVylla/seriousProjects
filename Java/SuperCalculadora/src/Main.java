public class Main {
    public static void main(String[] args) {

        //SuperCalculadora calculadora = new SuperCalculadora();
        System.out.println(SuperCalculadora.sumar(new Romano("XV"), new Romano("XXVI")));
        System.out.println(SuperCalculadora.multiplicar(new Binario("010011"), new Binario("0101101")));
        System.out.println(SuperCalculadora.sumar(new Decimal("12"), new Binario("10")));
        System.out.println(SuperCalculadora.transformarADecimal(new Hexadecimal("A9")));
        System.out.println(SuperCalculadora.dividir(new Romano("X"), new Romano("II")));

        //nuevoMetodo();

    }

}
