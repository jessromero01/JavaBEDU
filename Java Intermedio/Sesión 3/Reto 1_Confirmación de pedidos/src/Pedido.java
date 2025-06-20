import java.util.Optional;

public class Pedido {

    //atributos
    private String cliente;
    private String tipoEntrega;
    private String telefono;

    //constructor
    public Pedido(String cliente, String tipoEntrega, String telefono){
        this.cliente = cliente;
        this.telefono = telefono;
        this.tipoEntrega = tipoEntrega;
    }

    // metodo get
    public String getCliente() {return cliente; }
    public String getTipoEntrega() {return tipoEntrega; }
    public Optional<String> getTelefono() {return Optional.ofNullable(telefono); }
}
