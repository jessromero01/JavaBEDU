public class Video extends MaterialCurso{
    int Duracion;

    public Video(String Titulo, String Autor, int Duracion){
        super(Titulo, Autor);
        this.Duracion = Duracion;
    }

    public int getDuracion() {
        return Duracion;
    }

    @Override
    public void mostrarDetalle(){
        System.out.println("🎥 Video: " + Titulo + " - Autor: " + Autor + " - Duración: " + Duracion);
    }

}
