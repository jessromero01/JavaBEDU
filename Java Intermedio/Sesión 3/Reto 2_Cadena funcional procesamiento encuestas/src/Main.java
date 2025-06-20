import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Sucursal> sucursales = List.of(
                new Sucursal("Centro", List.of(
                        new Encuesta("Emilia Goméz", null, 5),
                        new Encuesta("Fernando Mendoza", "Pésimo servicio", 1)
                )),
                new Sucursal("Norte", List.of(
                        new Encuesta("Hugo García", "Mala atención", 2),
                        new Encuesta("Verenice Ruiz", "Buen servicio", 5)
                )),
                new Sucursal("Sur", List.of(
                        new Encuesta("Arturo Ponce", null, 3),
                        new Encuesta("Paco Ortíz", "Excelente atención", 5),
                        new Encuesta("Lily España", "Demasiado tiempo de espera", 2)
                ))
        );
        System.out.println("📄 Analizando las encuestas de servicio al cliente... \n");

        // iniciamos el stream de las encuestas
        sucursales.stream()
                .flatMap(sucursal -> sucursal.getEncuestas().stream()
                        .filter(p -> p.getCalificacion() <=3) // filtra calificacion menor o igual a 3
                        .flatMap(encuesta -> encuesta.getComentario()
                                .map(comentario -> Stream.of(
                                        "🏥 Sucursal " + sucursal.getSucursal() + ": Seguimiento al paciente con comentario de " + comentario))
                                .orElseGet(Stream::empty)
                        )
                )
                        .forEach(System.out::println);
    }
}