public class CuentaAhorro extends CuentaBancaria{
    private double tasaInteres;

    public CuentaAhorro(int numeroCuenta, double tasaInteres) {
        super(numeroCuenta);
        this.tasaInteres = tasaInteres;
    }


    public void calcularInteres() {
        double interesGenerado = getSaldo() * tasaInteres / 100;
        interesGenerado += getSaldo();
        System.out.println("Se han generado " + interesGenerado + " de intereses en la cuenta " + getNumeroCuenta() + ". Saldo actual: " + getSaldo());
    }
}
