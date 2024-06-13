public class CuentaBancaria {
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0.0;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Se ha depositado " + monto + " a la cuenta " + numeroCuenta + ". Saldo actual: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor que 0.");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && saldo >= monto) {
            saldo -= monto;
            System.out.println("Se ha retirado " + monto + " de la cuenta " + numeroCuenta + ". Saldo actual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        }
    }
}
