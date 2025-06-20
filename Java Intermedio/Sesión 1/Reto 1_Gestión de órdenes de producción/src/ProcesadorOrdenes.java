import java.util.List;
public class ProcesadorOrdenes {

    public static void imprimirOrdenes(List<? extends OrdenProduccion> ordenes){
        for (OrdenProduccion orden : ordenes){
            orden.mostrarResumen();
        }
    }

    public static void procesarPersonalizadas(List<? super OrdenPersonalizada> ordenes, int costoAdicional){
        for (Object obj : ordenes){
            OrdenPersonalizada personalizada = (OrdenPersonalizada) obj;
            personalizada.CostoAdicional(costoAdicional);
        }
    }
}
