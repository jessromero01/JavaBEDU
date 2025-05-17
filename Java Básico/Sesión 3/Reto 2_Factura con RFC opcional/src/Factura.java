import java.util.Optional;

public class Factura {
    // Atributos privados
    private double Monto;
    private String Descripcion;
    private Optional<String> rfc;

    public Factura(double Monto, String Descripcion, String rfc){
        this.Monto = Monto;
        this.Descripcion = Descripcion;
        this.rfc = Optional.ofNullable(rfc);
    }

    public String getResumen(){
        String info = " \uD83D\uDCD1 Factura generada: \n";
        info += "Monto: $" + Monto + "\n";
        info += "Descripción: " + Descripcion + "\n";
        info += "RFC: " + rfc.orElse("No proporcionado") + "\n";

        return  info;
    }
}