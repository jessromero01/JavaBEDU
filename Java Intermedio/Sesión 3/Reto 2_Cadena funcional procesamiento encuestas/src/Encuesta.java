import java.util.Optional;

public class Encuesta {

    // atributos
    private String paciente;
    private String comentario;
    private int calificacion;

    // constructor
    public Encuesta(String paciente, String comentario, int calificacion){
        this.paciente = paciente;
        this.comentario = comentario;
        this.calificacion = calificacion;
    }

    // metodo get
    public String getPaciente(){return paciente; }
    public Optional<String> getComentario(){return Optional.ofNullable(comentario); }
    public int getCalificacion(){return calificacion; }
}
