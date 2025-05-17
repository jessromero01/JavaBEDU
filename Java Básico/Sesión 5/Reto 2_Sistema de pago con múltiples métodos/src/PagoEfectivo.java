public class PagoEfectivo extends MetodoPago implements Autenticable {

    public PagoEfectivo(double Monto){
        super(Monto);
    }

    @Override
    //siempre retorna true (no requiere validación)
    public boolean autenticar(){
        return true;
    }

    @Override
    public void procesarPago(){
        System.out.println("\uD83D\uDCB5 Procesando pago en efectivo por: $" + Monto + ".");
    }
}
