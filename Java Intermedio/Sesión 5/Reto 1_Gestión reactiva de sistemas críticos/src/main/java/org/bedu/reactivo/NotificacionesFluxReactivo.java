import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;

public class NotificacionesFluxReactivo {
    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();

        // sensor de trafico
        Flux<String> trafico = Flux.interval(Duration.ofMillis(500))
                .onBackpressureBuffer() // evitar overflow
                .map(i -> random.nextInt(101)) // valor random de 0 a 100
                .filter(congestion -> congestion > 70)
                .map(congestion -> "🚗 Alerta: congestión del " + congestion + "%.");


        // sensor de contaminacion del aire
        Flux<String> contam = Flux.interval(Duration.ofMillis(600))
                .onBackpressureBuffer() // evitar overflow
                .map(i -> random.nextInt(101)) // valor de 0 a 100
                .filter(pm -> pm > 50)
                .map(pm -> "☁️ Alerta: contaminación alta (PM2.5: " + pm + "ug/m3.");

        // sensor de accidentes viales
        String[] prioridades = {"Baja", "Media", "Alta"};
        Flux<String> accidentes =  Flux.interval(Duration.ofMillis(800))
                .map(i -> prioridades[random.nextInt(3)])
                .filter(prioridad -> prioridad.equals("Alta"))
                .map(prioridad -> "💥 Emergencia vial: Accidente con prioridad Alta");

        // sensor de trenes
        Flux<String> trenes = Flux.interval(Duration.ofMillis(700))
                .onBackpressureBuffer() // evitar overflow
                .map(i -> random.nextInt(11)) // 0 a 10 minutos
                .filter(retraso -> retraso > 5)
                .map(retraso -> "🚅 Tren maglev con retraso crítico: " + retraso + " minuto");

        // sensor de semaforos
        String[] estados = {"Verde", "Amarillo", "Rojo"};
        Flux<String> semaforos =  Flux.interval(Duration.ofMillis(400))
                .map(i -> estados[random.nextInt(3)])
                .buffer(3,1)
                .filter(lista -> lista.stream().allMatch(color -> color.equals("Rojo")))
                .map(lista -> "🚦 Semáforo en Rojo detectado 3 veces seguidas.");


        // suscripciones independientes de cada sensor
        trafico.subscribe(System.out::println);
        contam.subscribe(System.out::println);
        accidentes.subscribe(System.out::println);
        trenes.subscribe(System.out::println);
        semaforos.subscribe(System.out::println);

        // app viva
        Thread.sleep(20000); // 20 s de simulacion
    }
}