public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaCorriente = new CuentaBancaria(1, "pepe", 0.0);
        cuentaCorriente.nuevoDia(0);
        cuentaCorriente.depositarDinero(500.50);
        cuentaCorriente.retirarDinero(20.75);
        cuentaCorriente.depositarDinero(20);
        cuentaCorriente.retirarDinero(20.75);
        cuentaCorriente.retirarDinero(20.75);
        cuentaCorriente.retirarDinero(100);
        System.out.println(cuentaCorriente.retirarDinero(1230));
        System.out.println(cuentaCorriente);


    }
}