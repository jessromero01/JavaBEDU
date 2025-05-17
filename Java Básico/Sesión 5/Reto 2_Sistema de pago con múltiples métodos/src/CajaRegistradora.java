public class CajaRegistradora {
    public static void main (String[] args){
        MetodoPago[] pagos = {
                new PagoEfectivo(1500.00),
                new PagoTarjeta(310.50, 400.75),
                new PagoTarjeta(600, 15.01),
                new PagoTransferencia(20.90, false), //fallar en autenticar
                new PagoTransferencia(20.90, true) //pasar en autenticar
        };


        // Poliformismo, ojo con instance of
        for (MetodoPago pago : pagos){
            if (pago instanceof Autenticable){
                Autenticable metodo = (Autenticable) pago;
                if(metodo.autenticar()) {
                    System.out.println("✅ Autenticación exitosa.");
                    pago.procesarPago();
                    pago.mostrarResumen();
                } else {
                    System.out.println("❌ Autenticación fallada. " + pago.getClass().getSimpleName() + " no válido.");
                }
                System.out.println();
            }
        }
    }
}
