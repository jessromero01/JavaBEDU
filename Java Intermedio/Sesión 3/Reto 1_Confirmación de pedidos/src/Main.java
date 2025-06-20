import java.util.List;
import java.util.Optional;

public class Main{
    public static void main(String[] args) {
        // lista de pedidos simulada
        List<Pedido> pedidos = List.of(
                new Pedido("Juan", "domicilio", "4459634420"),
                new Pedido("Lola", "local", null),
                new Pedido("Rosa", "domicilio", null),
                new Pedido("Lilia", "local", "5563210047"),
                new Pedido("Verenice", "domicilio", null),
                new Pedido("Juan", "domicilio", "4432021085")
        );

        System.out.println("🍕 Pedidos a domicilio con número de teléfono disponible:");

        // iniciamos el stream en los pedidos
        pedidos.stream()
                .filter(p -> p.getTipoEntrega().equalsIgnoreCase("domicilio")) // filtra solo los pedidos con tipo de entrega "domicilio"
                .map(Pedido::getTelefono) // map transforma pedido → Optional<String> (telefono)
                .filter(Optional::isPresent) // filter permite solo los Optionals que tienen valor (no vacíos)
                .map(Optional::get) //map extrae el valor del Optional
                .map(telefono -> "📞 Confirmación enviada al número: " + telefono) // genera el mensaje
                .forEach(System.out::println); // forEach imprime los valores finales
    }
}