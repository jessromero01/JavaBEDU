public class Principal {
    public static void main(String[] args){
        // Crea una declaración de impuestos.
        DeclaracionImpuestos dec = new DeclaracionImpuestos("RORJ010828654,", 10569.50);
        //Crea una cuenta fiscal.
        CuentaFiscal cf = new CuentaFiscal("RORJ010828654,", 549.20);

        //Mostrar informacion
        System.out.println("Declaración enviada por RFC: " + dec.rfcContribuyentes() + " por: $" + dec.MontoDeclarado());
        cf.mostrarCuenta();

        //Valida si el RFC coincide y muestra el resultado.
        boolean rfcc = cf.validarRFC(dec);
        System.out.println("¿RFC válido para esta cuenta? " + rfcc);
    }
}
