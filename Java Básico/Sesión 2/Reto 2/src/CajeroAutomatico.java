import java.util.Scanner;
public class CajeroAutomatico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 1000.0;
        int acc;

        do {
            System.out.println("\uD83D\uDCB5 Bienvenido al cajero automático \n");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Depositar dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.println("¿Qué te gustaría realizar?");
            acc = scanner.nextInt();

            switch (acc){
                case 1: {
                    System.out.println("Saldo actual: $" + saldo);
                    break;
                }
                case 2: {
                    System.out.println("Ingresa la cantidad que quieres depositar:");
                    double dep = scanner.nextDouble();
                    saldo = saldo + dep;
                    System.out.println("Déposito realizado con éxito, tu saldo actual es: $" + saldo);
                    break;
                }
                case 3: {
                    System.out.println("Ingresa la cantidad que quieres retirar:");
                    double ret = scanner.nextDouble();
                    saldo = saldo - ret;
                    System.out.println("Retiro realizado con éxito, tu saldo actual es: $" + saldo);
                    break;
                }
                case 4: {
                    System.out.println("¡Gracias por usar este cajero! \uD83E\uDD17");
                    break;
                }
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
     } while (acc != 4); // Repite hasta que se elija la opción de salir

        scanner.close();

    }
}