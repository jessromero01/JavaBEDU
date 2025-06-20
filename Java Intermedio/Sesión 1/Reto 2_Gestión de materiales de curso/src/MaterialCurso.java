public abstract class MaterialCurso {
    String Titulo;
    String Autor;

    // Constructor
    public MaterialCurso(String Titulo, String Autor){
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    // met. para el titulo
    public String getTitulo(){
        return Titulo;
    }

    // metodo
    public abstract void mostrarDetalle();
}
