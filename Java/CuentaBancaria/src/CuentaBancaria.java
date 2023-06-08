public class CuentaBancaria {
    private int numerodeCuenta;
    private String titular;
    private double saldo;
    private int numeroTransacciones;

    public CuentaBancaria(int numerodeCuenta, String titular, double saldo) {
        this.numerodeCuenta = numerodeCuenta;
        this.titular = titular;
        this.saldo = 0.0;
        numeroTransacciones = 0;
    }

    public int getNumerodeCuenta() {
        return numerodeCuenta;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }


    public void depositarDinero(double deposito) {
        saldo += deposito;
        numeroTransacciones++;
    }

    public double retirarDinero(double retiro) {
        if (!haySuficienteDinero(retiro)) {
            System.out.println("Esta operación no se pudo completar");
            System.out.print("En cambio puedes sacar esto ");
            return saldo;
        }
        saldo -= retiro;
        numeroTransacciones++;
        return retiro;
    }

    public void nuevoDia(int numeroTransacciones) {
        this.numeroTransacciones = 0;
    }

    private boolean haySuficienteDinero(double retiro) {
        return saldo >= retiro;
    }

    @Override
    public String toString() {
        return "\n\tDATOS DE LA CUENTA: " +
                numerodeCuenta +
                "\n\tTitular: " + titular +
                "\n\tSaldo: " + saldo + "\nOperaciones realizadas hoy: " + numeroTransacciones;
    }

}
