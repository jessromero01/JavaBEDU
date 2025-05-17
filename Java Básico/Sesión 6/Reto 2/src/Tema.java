import java.util.*;

// Clase que representa una orden por titulo

public class Tema implements Comparable<Tema>{
    String titulo;
    int prioridad;

    public Tema(String titulo, int prioridad){
        this.titulo = titulo;
        this.prioridad = prioridad;
    }

    // Orden natural: por nombre del titulo (alfabético)
    @Override
    public int compareTo(Tema otro){
        return this.titulo.compareTo(otro.titulo);// orden alfabético natural
    }

    @Override
    public String toString(){
        return "\uD83D\uDCD6 Título: " + titulo + " | \uD83D\uDCCC Prioridad: " + prioridad;
    }
}
