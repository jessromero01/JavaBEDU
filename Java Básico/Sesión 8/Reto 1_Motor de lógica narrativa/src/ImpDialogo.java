public class ImpDialogo implements GestorDialogo{
    public void imprimirDialog(PaqueteNarracion Paquete){
        System.out.println("\n⭐ Escenario actual: " + Paquete.getEscenaActual());
        System.out.println("✨ Era un día tranquilo...");
    }
}
