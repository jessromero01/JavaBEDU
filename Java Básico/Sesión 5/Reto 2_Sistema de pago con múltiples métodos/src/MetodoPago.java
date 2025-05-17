public abstract class MetodoPago {

    protected double Monto;

    public MetodoPago(double Monto){
        this.Monto = Monto;
    }

    public abstract void procesarPago();

    public void mostrarResumen(){
        System.out.println("Tipo de pago: " + this.getClass().getSimpleName() + " - Monto: $" + Monto);
    }
}

