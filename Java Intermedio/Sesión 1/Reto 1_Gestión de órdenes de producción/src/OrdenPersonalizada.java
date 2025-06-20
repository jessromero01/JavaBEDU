public class OrdenPersonalizada extends OrdenProduccion{
    private String cliente;

    public OrdenPersonalizada(String codigo, int cantidad, String cliente){
        super(codigo, cantidad);
        this.cliente = cliente;
    }

    @Override
    public void mostrarResumen(){
        System.out.println("📑 Orden personalizada - Código: " + codigo + " - Cantidad: " + cantidad + " - Cliente: " + cliente);
    }

    public void CostoAdicional(int costo){
        System.out.println("A la orden" + codigo + "se le ha agregado un costo adicional de $" + costo + " para el cliente.");
    }
}
