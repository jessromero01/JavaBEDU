import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AnalizadorLogs{
    public static void main(String[] args) {

        Path ruta = Paths.get("errores.log");
        Path rerror = Paths.get("registro_fallos.txt");

        //contadores para lineas, error y warning
        int CLin = 0;
        int CError=0;
        int CWarn = 0;

        // abrir el archivo errores.log con BufferedReader
        try (BufferedReader lector = Files.newBufferedReader(ruta)) {
            String linea;

            while ((linea = lector.readLine()) !=null){
                CLin++;
                if (linea.contains("ERROR")){
                    CError++;
                }
                if (linea.contains("WARNING")){
                    CWarn++;
                }
            }

            // Porcentaje de líneas con errores y advertencias
            double PEW = ((double)(CError + CWarn) / CLin) * 100;

            System.out.println("\n\uD83D\uDD0E Total de líneas leídas: " + CLin);
            System.out.println("\uD83D\uDEA8 Cantidad de errores detectados: " + CError);
            System.out.println("\uD83D\uDCE2 Cantidad de advertencias detectadas: " + CWarn);
            System.out.println("\uD83D\uDCCA Porcentaje de líneas con errores y adevertencias: " + PEW + "%");

        } catch (IOException e){
            String error = "Error al procesar el archivo: " + e.getMessage();

            try{
                // guarda el mensaje de error en un archivo
                Files.write(rerror, error.getBytes());
                System.out.println("\n Error registrado.");
            } catch (IOException eE){
                System.out.println("\n \uD83D\uDEA8 Problemas al registrar el error en el archivo: "+ eE.getMessage());
            }
        }
    }
}