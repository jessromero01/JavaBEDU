import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Random;

public class SignosVitales {

    static Random random = new Random();

    public static void main(String[] args) throws InterruptedException{

        // Pacientes
        Flux<String> paciente1 = genPaciente(1);
        Flux<String> paciente2 = genPaciente(2);
        Flux<String> paciente3 = genPaciente(3);

        // unimos los flujos
        Flux.merge(paciente1, paciente2, paciente3)
                .delayElements(Duration.ofSeconds(2)) // backpressure simulado
                .subscribe(System.out::println);

        Thread.sleep(20000);
    }

    static Flux<String> genPaciente(int id){
        return Flux.interval(Duration.ofMillis(300))
                .map(i -> generarSV(id))
                .flatMapIterable(alertas -> alertas); // emitir alertas por evento si hay mas de un sv fuera de rango
    }

    static java.util.List<String> generarSV(int PacienteID){
        int FC = random.nextInt(71) + 40;  // 40 - 100 bpm
        int PAsis = random.nextInt(101) + 80; // 80 - 180 mmHg
        int PAdias = random.nextInt(61) + 50; //
        int spo2 = random.nextInt(21) + 80; // 80-100%

        java.util.List<String> alertas = new java.util.ArrayList<>();

        //FC critica
        if (FC < 50 || FC > 120) {
            alertas.add("⚠️ Paciente " + PacienteID + " - Frecuencia cardíaca crítica: " + FC + " bpm.");
        }

        // PA critica
        if (PAsis < 90 || PAdias < 60 || PAsis > 140 || PAdias > 90){
            alertas.add("⚠️ Paciente " + PacienteID + " - Presión arterial crítica: " + PAsis + "/" + PAdias + " mmHg.");
        }

        // Spo2 critica
        if (spo2 < 90){
            alertas.add("⚠️ Paciente " + PacienteID + " - Oxigenación baja: " + spo2 + "%.");
        }

        return alertas;
    }
}
