public class Ejercicio extends MaterialCurso{
    boolean Revisado;

    public Ejercicio(String Titulo, String Autor, boolean Revisado){
        super(Titulo, Autor);
        this.Revisado = Revisado;
    }

    public void setRevisado(boolean Revisado){
        this.Revisado = Revisado;
    }

    public boolean isRevisado(){
        return Revisado;
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("🎥 Ejercicio: " + Titulo + " - Autor: " + Autor + " - Revisado: " + Revisado);
    }

}
