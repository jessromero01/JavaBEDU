import java.util.Scanner;
public class SimuladorFarmacia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String medicamento;
        double precio;
        int piezas;

        System.out.println("Ingresa el nombre del medicamento");
        medicamento = scanner.nextLine();

        System.out.println("Ingresa el precio del medicamento");
        precio = scanner.nextDouble();

        System.out.println("Ingresa el número de piezas");
        piezas = scanner.nextInt();

        // Cuenta total
        double CT =  (piezas * precio);
        // Aplica descuento
        var AD = CT > 500;
        double descuento = AD ? CT * 0.15 : 0;
        // Recibo final
        double RF = CT - descuento;

        System.out.println("\n \uD83D\uDCDD Resumen del pedido:\n");
        System.out.println("Medicamento:" + medicamento);
        System.out.println("Piezas:" + piezas);
        System.out.println("Precio unitario: $" + precio);
        System.out.println("¿Aplica descuento?: " + AD);
        System.out.println("Descuento: $" + descuento);
        System.out.println("Total a pagar: $" + RF);

    }
}