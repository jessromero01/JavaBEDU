public class CentralEmergencia {
    public static void main(String[] args){
        Ambulancia ambulancia = new Ambulancia("Ambulancia", "Juan Pérez");
        Patrulla patrulla = new Patrulla("Patrulla", "Ximena Ruiz");
        UnidadBomberos unidadBomberos = new UnidadBomberos("Unidad de Bomberos", "Verenice Pantoja");

        ambulancia.iniciarOperador();
        System.out.println();

        patrulla.iniciarOperador();
        System.out.println();

        unidadBomberos.iniciarOperador();
        System.out.println();
    }
}
