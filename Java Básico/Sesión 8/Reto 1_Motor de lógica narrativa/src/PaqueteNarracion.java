public class PaqueteNarracion {
    private String EscenaActual;

    public PaqueteNarracion(String EscenaActual){
        this.EscenaActual = EscenaActual;
    }

    public String getEscenaActual(){
        return EscenaActual;
    }

    public void setEscenaActual(String NuevaEscena){
        this.EscenaActual = NuevaEscena;
    }
}
