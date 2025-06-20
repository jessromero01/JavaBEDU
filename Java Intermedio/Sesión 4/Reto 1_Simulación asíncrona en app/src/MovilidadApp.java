import java.util.concurrent.*;

public class MovilidadApp {
    public static void main(String[] args) {
        CompletableFuture<String> rutaFuture = CalcularRuta();
        CompletableFuture<Double> tarifaFuture = EstimarTarifa();

        // combinar la ruta y tarifa en un solo reporte
        CompletableFuture<Void> reporteFinal = rutaFuture.thenCombine(tarifaFuture, (ruta, tarifa) ->{
            return "🚗 Ruta calculada: " + ruta + "| 💵 Tarifa estimada: " + tarifa;
        })
                .thenAccept(System.out::println) // imprimir reporte
                .exceptionally(ex -> { // manejo de errores
                    System.out.println("Error al generar el reporte: " + ex.getMessage());
                    return null;
                });

        // esperar a que todo termine
        reporteFinal.join();
    }

    // metodo para simular el calculo de la ruta
    public static CompletableFuture<String> CalcularRuta () {
        return CompletableFuture.supplyAsync(() -> {
            System.out.println("🎯 Calculando ruta óptima...");
            lat(3); // latencia simulada
            return "Ruta -> Centro";
        });
    }

    //metodo para estimar la tarifa
    public static CompletableFuture<Double> EstimarTarifa (){
        return CompletableFuture.supplyAsync(() ->{
            System.out.println("💰 Estimando tarifa...");
            lat(2);
            return 85.36;
        });
    }

    // metodo auxiliar para la latencia
    public static void lat(int segundos){
        try{
            TimeUnit.SECONDS.sleep(segundos);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
    }
}
