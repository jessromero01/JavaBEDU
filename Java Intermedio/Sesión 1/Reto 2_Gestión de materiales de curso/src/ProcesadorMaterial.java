import java.util.List;
public class ProcesadorMaterial {

    // met. gen. para mostrar el detalle de todos los materiales
    public static void mostrarMateriales(List<? extends MaterialCurso> lista){
        for (MaterialCurso material : lista){
            material.mostrarDetalle();
        }
    }

    // met. gen. para sumar y mostrar la duración total de los videos
    public static void contarDuracionVideos(List<? extends Video> lista){
        int total = 0;
        for (Video vid : lista){
            total += vid.getDuracion();
        }

        System.out.println("⌚ Duración total de vídeos: " + total + " minutos.");
    }

    // met. gen. para actualizar el estado de los ejercicios a revisado = true y muestra un mensaje por cada uno
    public static void marcarEjerciciosRevisados(List<? extends Ejercicio> lista){
        for (Ejercicio eje : lista){
            eje.setRevisado(true);
            System.out.println("✅ Ejercicio '" + eje.getTitulo() + "' marcado como revisado.");
        }
    }

}
