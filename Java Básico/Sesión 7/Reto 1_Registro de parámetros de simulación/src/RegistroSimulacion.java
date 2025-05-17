import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RegistroSimulacion {
    public static void main(String[] args) {
        // Definir la ruta del archivo
        Path ruta = Paths.get("src/config/parametros.txt");

        //Contenido a escribir en el archivo
        String contenido = "- \uD83D\uDD5A Tiempo de ciclo: 55.8 segungos \n- \uD83D\uDE97 Velocidad de línea: 1.2 m/s \n- \uD83C\uDFC1 Número de estaciones: 8";

        try {
            // Escribir contenido en el archivo (crea o sobrescribe)
            Files.write(ruta, contenido.getBytes());
            System.out.println("\n ✅ Archivo escrito exitosamente.");

            //Validar que el archivo fue creado correctamente
            if (Files.exists(ruta)) {
                System.out.println("\n \uD83D\uDDC2\uFE0F El archivo existe");

                //Leer y mostrar el contenido
                String textoLeido = Files.readString(ruta);
                System.out.println("\n \uD83D\uDCC4 Contenido leído:");
                System.out.println(textoLeido);

            } else {
                System.out.println("\n ❌ El archivo NO existe.");
            }

        } catch (IOException e){
            System.out.println("\n \uD83D\uDEA8 Error al trabajar con el archivo: "+ e.getMessage());
        }
    }
}
