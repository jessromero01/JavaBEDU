public class Operador {
    String nombre;

    public Operador(String nombre){
        this.nombre = nombre;
    }

    public void reportarse(){
        System.out.println("\uD83D\uDC77 Operador " + nombre + " reportándose.");
    }
}
