import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Paciente Pac1 = new Paciente();
        Scanner Pac = new Scanner(System.in);

        System.out.println("Ingresa el nombre del paciente:");
        Pac1.nombre = Pac.nextLine();

        System.out.println("Ingresa la edad del paciente:");
        Pac1.edad = Pac.nextInt();
        Pac.nextLine();

        System.out.println("Ingresa el expediente del paciente:");
        Pac1.expediente = Pac.nextLine();

        Pac1.datos();
    }
}
