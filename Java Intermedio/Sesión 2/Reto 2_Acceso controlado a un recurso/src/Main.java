import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

public class Main {
    public static void main(String[] args) {
        System.out.println("🏥 Iniciando acceso acceso a la sala de cirugía...");

        RecursoMedico recurso = new RecursoMedico("sala de cirugía");

        // executor con 4 hilos
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // runnable con los nombres de los doctores
        Runnable tarea1 = () -> recurso.usar("Dra. Aldana");
        Runnable tarea2 = () -> recurso.usar("Dr. Pantoja");
        Runnable tarea3 = () -> recurso.usar("Dra. Romero");
        Runnable tarea4 = () -> recurso.usar("Dr. Esquivel");

        // ejecutamos las tareas
        executor.execute(tarea1);
        executor.execute(tarea2);
        executor.execute(tarea3);
        executor.execute(tarea4);

        executor.shutdown();
    }
}