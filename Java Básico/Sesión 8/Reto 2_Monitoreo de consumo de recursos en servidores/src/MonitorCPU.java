import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class MonitorCPU {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> consumosCPU = new HashSet<>();

        try {
            System.out.println("Ingrese el consumo de CPU de los servidores (enteros). \nPara salir ingresa -1.");

            while (true) {
                int valor = scanner.nextInt();

                if (valor == -1) {
                    break;
                }

                if (valor < 0 || valor > 100) {
                    System.out.println("❌ El valor no puede ser negativo o superior a 100%");
                    continue;
                }

                if (!consumosCPU.add(valor)) {
                    System.out.println("❌ Valor duplicado, no se puede registrar.");
                    continue;
                }

                if (valor > 95) {
                    throw new ConsumoCriticoException("⚠\uFE0F Consumo crítico detectado: " + valor + "%");
                }
                System.out.println("✅ Registro exitoso: " + valor + "%");
            }
            System.out.println("\n Todos los consumos fueron registrados correctamente.");
        } catch (InputMismatchException e) {
            System.out.println("❌ El valor ingresado debe ser un entero.");
        } catch (ConsumoCriticoException e){
            System.out.println("⚠\uFE0F Excepción encontrada: " + e.getMessage());
        } catch (Exception e){
            System.out.println("❌ Error inesperado." + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("🔒 Monitoreo finalizado.");
        }
    }
}