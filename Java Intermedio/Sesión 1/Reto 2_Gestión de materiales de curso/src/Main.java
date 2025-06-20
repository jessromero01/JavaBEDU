import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // material
        Video v1 = new Video("Importancia de la Nanotecnología", "Jessica Romero", 60);
        Video v2 = new Video("Introducción a Química Computacional", "Miguel Ruiz", 32);
        Articulo a1 = new Articulo("Caracterización de Materiales", "Carina Rodriguez", 19520);
        Articulo a2 = new Articulo("Mejora de la cinética de fármacos", "Aldo Rivera", 12300);
        Ejercicio e1 = new Ejercicio("Cálculo del módulo de Young", "Delia Gúzman", false);
        Ejercicio e2 = new Ejercicio("Ejercicio de integrales", "José Valencia", false);

        // listas por tipo
        List<Video> videos = new ArrayList<>();
        videos.add(v1);
        videos.add(v2);

        List<Articulo> articulos = new ArrayList<>();
        articulos.add(a1);
        articulos.add(a2);

        List<Ejercicio> ejercicios = List.of(e1, e2);

        // materiales por tipo
        System.out.println("📚 Material del curso:\n");
        ProcesadorMaterial.mostrarMateriales(videos);
        System.out.println();
        ProcesadorMaterial.mostrarMateriales(articulos);
        System.out.println();
        ProcesadorMaterial.mostrarMateriales(ejercicios);
        System.out.println();

        // video conteo
        ProcesadorMaterial.contarDuracionVideos(videos);

        // revision ejercicio
        ProcesadorMaterial.marcarEjerciciosRevisados(ejercicios);

    }
}