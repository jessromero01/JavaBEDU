import java.util.concurrent.*;
import java.util.concurrent.Callable;

class SistemaNavegacion implements Callable<String> {
    // definimos la tarea con call
    public String call() throws Exception{
        // Espera y  devuelve un mensaje representando el estado del sistema.
        Thread.sleep(2000);
        return "🛰️ Navegación: trayectoria corregida con éxito.";
    }
}

class SistemaSV implements Callable<String> {
    // definimos la tarea con call
    public String call() throws Exception{
        // Espera y  devuelve un mensaje representando el estado del sistema.
        Thread.sleep(5000);
        return "🧪️ Soporte vital: los niveles de presión y oxígeno se encuentran en óptimo estado.";
    }
}

class SistemaCT implements Callable<String> {
    // definimos la tarea con call
    public String call() throws Exception{
        // Espera y  devuelve un mensaje representando el estado del sistema.
        Thread.sleep(1500);
        return "🔥 Control térmico: Las temperaturas externas e internas son estables.";
    }
}

class SistemaComunicaciones implements Callable<String> {
    // definimos la tarea con call
    public String call() throws Exception{
        // Espera y  devuelve un mensaje representando el estado del sistema.
        Thread.sleep(3000);
        return "📶 Comunicación: Enlace con la estación terrestre estable.";
    }

}

public class Main{
    public static void main(String[] args) {
        System.out.println("🚀 Simulación de misión espacial iniciada...");

        // Crear un executor con los 4 hilos
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Enviar una tarea
        Future<String> nav = executor.submit(new SistemaNavegacion());
        Future<String> vit = executor.submit(new SistemaSV());
        Future<String> tem = executor.submit(new SistemaCT());
        Future<String> com = executor.submit(new SistemaComunicaciones());

        try{
            // Imprimir resultados
            System.out.println(nav.get());
            System.out.println(vit.get());
            System.out.println(tem.get());
            System.out.println(com.get());
            System.out.println("✅ Todos los sistemas reportan estado operativo");
        } catch (InterruptedException | ExecutionException e){
            System.out.println("⛔ Error en la ejecución de los subsistemas: " + e.getMessage());
        } finally {
            //Apagar el executor
            executor.shutdown();
        }
    }
}