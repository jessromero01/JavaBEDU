public class Entrada {
    String evento;
    int precio;

    // Constructor con parametros
    public Entrada(String evento, int precio){
        this.evento = evento;
        this.precio = precio;
    }

    public void mostrarInformacion(){
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }
}


