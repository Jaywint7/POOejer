import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria1 = new CuentaBancaria(123456);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(789012, 1000.0);
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro(345678, 17.80);

        int opcion;
        do {
            mostrarMenu();
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    cuentaBancaria1.depositar(500.0);
                    cuentaBancaria1.retirar(200.0);
                    break;
                case 2:
                    cuentaCorriente1.depositar(800.0);
                    cuentaCorriente1.retirar(1200.0); // Se utiliza el límite de descubierto
                    break;
                case 3:
                    cuentaAhorro1.depositar(1000.0);
                    cuentaAhorro1.calcularInteres();
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 4);
    }
    public static void mostrarMenu(){
        System.out.println("\n\n**Menú de Cuentas Bancarias**");
        System.out.println("1. Cuenta Bancaria -> Desposito/Retiro");
        System.out.println("2. Cuenta Corriente -> Desposito/Retiro -> Limite descubierto");
        System.out.println("3. Cuenta Ahorro -> Desposito/Retiro -> Interes");
        System.out.println("4. Salir");
        System.out.print("Ingrese la opción deseada: ");
    }
}