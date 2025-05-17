import java.util.Scanner;
public class ImpDecision implements LogicaDecision{

    public String TomarDecision(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("\uD83C\uDFE1 Responde sí o no: ¿Deseas quedarte en casa? ");
        String input = scanner.nextLine();
        return input.toUpperCase();
    }
}
