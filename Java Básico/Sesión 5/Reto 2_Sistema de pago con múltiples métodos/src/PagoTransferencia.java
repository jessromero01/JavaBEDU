public class PagoTransferencia extends MetodoPago implements Autenticable{

    private boolean ValidadoE;

    public PagoTransferencia(double Monto, boolean ValidadoE){
        super(Monto);
        this.ValidadoE = ValidadoE;
    }

    @Override
    public boolean autenticar(){
        return ValidadoE;
    }

    @Override
    public void procesarPago(){
        System.out.println("\uD83D\uDCF1 Procesando pago por transferencia bancaria por: $" + Monto + ".");
    }
}
