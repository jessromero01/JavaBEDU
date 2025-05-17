public class Vuelo{
    final String CodVue;
    String Destino;
    String HoraSalida;
    Pasajero AsientoReservado;

    // Constructor del vuelo para inicializar los atributos
    public Vuelo(String CodVue, String Destino, String HoraSalida){
        this.CodVue = CodVue;
        this.Destino = Destino;
        this.HoraSalida = HoraSalida;
        this.AsientoReservado = null;
    }

    // Asignar al pasajero si no hay reserva previa
    public boolean ReservarAsiento(Pasajero p){
        if (AsientoReservado == null){
            AsientoReservado = p;
            return true;
        } else{
            return false;
        }
    }

    //  Metodo sobrecargado
    public boolean ReservarAsiento(String Nombre, String Pasaporte){
        Pasajero NuevoPasajero = new Pasajero(Nombre, Pasaporte);
        return ReservarAsiento(NuevoPasajero);
    }

    // Elimina al pasajero asignado
    public void Cancelacion(){
        AsientoReservado = null;
    }

    public String obtenerItinerario() {
        String info = "✈️ Itinerario del vuelo:\n";
        info += "Código: " + CodVue + "\n";
        info += "Destino: " + Destino + "\n";
        info += "Hora de salida: " + HoraSalida + "\n";

        if (AsientoReservado == null) {
            info += "Pasajero: [Sin reserva]\n";
        } else {
            info += "Pasajero: " + AsientoReservado.Nombre + "\n";
        }

        return info;
    }
}