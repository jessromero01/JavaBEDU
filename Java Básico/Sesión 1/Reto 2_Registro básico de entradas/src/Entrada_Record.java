public record Entrada_Record (String evento, int precio){
    public void mostrarInformacion(){
        System.out.println("Evento: " + evento + " | Precio: $" + precio);
    }
}
