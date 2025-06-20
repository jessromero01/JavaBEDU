import java.util.concurrent.*;

public class AeropuertoControl {
    public static void main(String[] args) {
        CompletableFuture<Boolean> pistaFuture = verificarPista();
        CompletableFuture<Boolean> climaFuture = verificarClima();
        CompletableFuture<Boolean> traficoFuture = verificarTraficoAereo();
        CompletableFuture<Boolean> personalFuture = verificarPersonalTierra();

        System.out.println("🛬 Verificando condiciones para aterrizaje...\n");

        // combinamos los resultados
        CompletableFuture<Void> reporteFinal = CompletableFuture.allOf(pistaFuture, climaFuture, traficoFuture, personalFuture
        ).exceptionally(ex -> { // manejo de errores
            System.out.println("Error al generar el reporte: " + ex.getMessage());
            return null;
        });

        reporteFinal.thenRun(() -> {
            boolean pista = pistaFuture.join();
            boolean clima = climaFuture.join();
            boolean trafico = traficoFuture.join();
            boolean personal = personalFuture.join();

            // imprimimos los resultados
            System.out.println("🛣️ Pista disponible: " + pista + "\n🌤️ Clima favorable: " + clima +
            "\n🚦Tráfico aéreo despejado: " + trafico + "\n👨‍✈️ Personal disponible: " + personal);

            // verificamos si es posible hacer el aterrizaje
            if (pista && clima && trafico && personal){
                System.out.println("\n✅ Aterrizaje autorizado. Todas las condiciones están óptimas.");
            } else {
                System.out.println("\n⛔ Aterrizaje denegado. No se cumplen con todas las condiciones.");
            }
            // esperar a que todo termine
        }).join();
    }

    // metodo para verificar la pista
    public static CompletableFuture<Boolean> verificarPista (){
        return CompletableFuture.supplyAsync(() -> {
            lat(3); // latencia simulada
            return true;
        });
    }

    // metodo para verificar el clima favorable
    public static CompletableFuture<Boolean> verificarClima (){
        return CompletableFuture.supplyAsync(() -> {
            lat(2); // latencia simulada
            return true;
        });
    }

    // metodo para verificar el trafico aereo
    public static CompletableFuture<Boolean> verificarTraficoAereo (){
        return CompletableFuture.supplyAsync(() -> {
            lat(3); // latencia simulada
            return true;
        });
    }

    // metodo para verificar el personal
    public static CompletableFuture<Boolean> verificarPersonalTierra (){
        return CompletableFuture.supplyAsync(() -> {
            lat(2);
            return true;
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
