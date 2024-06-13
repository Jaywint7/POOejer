public class CuentaCorriente extends CuentaBancaria {
    private double limiteDescubierto;

    public CuentaCorriente(int numeroCuenta, double limiteDescubierto) {
        super(numeroCuenta);
        this.limiteDescubierto = limiteDescubierto;
    }

    @Override
    public void retirar(double monto) {
        if (monto > 0 && (getSaldo() + limiteDescubierto) >= monto) {
            monto -= getSaldo();
            if (getSaldo() < 0) {
                System.out.println("Se ha utilizado " + (getSaldo() + limiteDescubierto) + " del límite de descubierto. Saldo actual: " + getSaldo());
            } else {
                System.out.println("Se ha retirado " + monto + " de la cuenta " + getNumeroCuenta() + ". Saldo actual: " + getSaldo());
            }
        } else {
            System.out.println("Saldo insuficiente y/o límite de descubierto excedido.");
        }
    }
}
