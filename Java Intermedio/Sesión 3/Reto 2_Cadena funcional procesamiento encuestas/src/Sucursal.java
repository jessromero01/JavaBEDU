import java.util.List;

public class Sucursal {

    //atributos
    private final String sucursal;
    private final List<Encuesta> encuestas;

    //constructor
    public Sucursal(String sucursal, List<Encuesta> encuestas){
        this.sucursal = sucursal;
        this.encuestas = encuestas;
    }

    // metodo get
    public String getSucursal(){ return sucursal; }
    public List<Encuesta> getEncuestas(){ return encuestas; }
}
