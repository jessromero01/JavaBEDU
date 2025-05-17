public class Principal {
    public static void main(String[] args){
        // Pasajero
         Pasajero pasajero = new Pasajero("Jessica Romero", "RORJ01082");

        // Vuelo
        Vuelo vuelo = new Vuelo("LP159", "TOKYO", "17:00");

        //Reservar asiento
        boolean Reservado = vuelo.ReservarAsiento(pasajero);
        if (Reservado){
            System.out.println("Reserva realizada con éxito \n");
        } else {
            System.out.println("No se pudo realizar la reserva\n");
        }

        // Itinerario
        System.out.println(vuelo.obtenerItinerario());

        // Cancelar reservacion
        System.out.println("Cancelación en proceso\n");
        vuelo.Cancelacion();

        // Itinerario actualizado
        System.out.println(vuelo.obtenerItinerario());

        // Nueva reserva
        vuelo.ReservarAsiento("Ana Ruiz", "RUSA6907");
        System.out.println(vuelo.obtenerItinerario());
    }
}
