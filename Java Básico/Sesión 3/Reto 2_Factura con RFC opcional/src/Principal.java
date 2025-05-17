public class Principal {
    public static void main(String[] args){
        // Factura con rfc
        Factura factura1 = new Factura(15693, "Gastos en general", "RORJ010828");
        // Factura sin rfc
        Factura factura2 = new Factura(14852, "Servicio médico", null);

        System.out.println(factura1.getResumen());
        System.out.println(factura2.getResumen());
    }
}
