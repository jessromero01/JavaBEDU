public class PagoTarjeta extends MetodoPago implements Autenticable{
    private double FondosDisponibles;

    public PagoTarjeta(double Monto, double FondosDisponibles){
        super(Monto);
        this.FondosDisponibles = FondosDisponibles;
    }

    @Override
    public boolean autenticar(){
        return FondosDisponibles>=Monto;
    }

    @Override
    public void procesarPago(){
        System.out.println("\uD83D\uDCB3 Procesando pago con tarjeta procesado por: $" + Monto + ".");
    }
}
