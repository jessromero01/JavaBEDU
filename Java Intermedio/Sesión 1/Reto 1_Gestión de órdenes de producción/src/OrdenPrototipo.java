public class OrdenPrototipo extends OrdenProduccion{
    String faseDesarrollo;

    public  OrdenPrototipo(String codigo, int cantidad, String faseDesarrollo){
        super(codigo, cantidad);
        this.faseDesarrollo = faseDesarrollo;
    }

    @Override
    public void mostrarResumen(){
        System.out.println("📇 Orden prototipo - Código: " + codigo + " - Cantidad: " + cantidad + " - Fase: " + faseDesarrollo );
    }
}
