import java.util.concurrent.locks.ReentrantLock;

public class RecursoMedico{
    // atributos
    private String nombre;
    private final ReentrantLock lock = new ReentrantLock();

    // constructor
    public RecursoMedico(String nombre){
        this.nombre = nombre;
    }

    //metodo
    public void usar(String doctor){
        lock.lock();
        try{
            // entrada de un profesional al recurso
            System.out.println("🥼 " + doctor + " ha ingresado a " + nombre);
            // tiempo de uso
            Thread.sleep(5000);
            // salida del recurso
            System.out.println("✅ " + doctor + " ha salido de " + nombre);
        } catch (InterruptedException e){
            // interrupción del hilo
                Thread.currentThread().interrupt();
            System.out.println("⛔ Error en el ingreso de " + doctor + " a " + nombre);
        } finally {
            // liberar el lock
            lock.unlock();
        }
    }
}