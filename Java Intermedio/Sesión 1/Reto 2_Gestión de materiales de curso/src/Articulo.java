public class Articulo extends MaterialCurso{
    int Palabras;

    public Articulo(String Titulo, String Autor, int Palabras){
        super(Titulo, Autor);
        this.Palabras = Palabras;
    }


    @Override
    public void mostrarDetalle(){
        System.out.println("📃 Articulo: " + Titulo + " - Autor: " + Autor + " - Palabras: " + Palabras);
    }

}
