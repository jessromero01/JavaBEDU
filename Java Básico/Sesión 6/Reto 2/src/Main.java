import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;

public class Main{
    public static void main(String[] args) {
        // Lista concurrente de temas activos
        List<Tema> TemasActivos = new CopyOnWriteArrayList<>();
        TemasActivos.add(new Tema("Biología Molecular", 1));
        TemasActivos.add(new Tema("Matemáticas y cálculo", 1));
        TemasActivos.add(new Tema("Historia", 2));
        TemasActivos.add(new Tema("Geografía", 3));

        //Lista por orden alfabetico
        Collections.sort(TemasActivos);
        System.out.println("\uD83D\uDCD8 Temas activos por orden alfabético");
        for (Tema t : TemasActivos){
            System.out.println(t);
        }

        //Lista por prioridad [Comparator]
        TemasActivos.sort(new Comparator<Tema>() {
            @Override
            public int compare(Tema o1, Tema o2) {
                return Integer.compare(o1.prioridad, o2.prioridad);
            }
        });

        System.out.println("\n Temas activos ordenados por prioridad (1 = alta):");
        for (Tema t : TemasActivos){
            System.out.println(t);
        }

        // Repositorio concurrente de recursos asociados a los temas
        ConcurrentHashMap<String, String> enlaces = new ConcurrentHashMap<>();
        enlaces.put("Biología Molecular", "https://enlace.com/biologia");
        enlaces.put("Ética y valores", "https://enlace.com/mates");
        enlaces.put("Historia", "https://enlace.com/historia");

        //Recursos
        System.out.println("\n \uD83D\uDCDA Repositorio de materiales:");
        for(var entry : enlaces.entrySet()){
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }
    }
}
