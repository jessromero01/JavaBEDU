import java.awt.*;

public class MainNarrativa {
    public static void main(String[] args) {
        PaqueteNarracion paquete = new PaqueteNarracion("Inicio del juego");

        TransicionHistoria transicion = new ImpTransicion();
        GestorDialogo dialogo = new ImpDialogo();
        LogicaDecision desicion = new ImpDecision();

        dialogo.imprimirDialog(paquete);
        String accion = desicion.TomarDecision();
        transicion.transicionar(accion);
    }
}