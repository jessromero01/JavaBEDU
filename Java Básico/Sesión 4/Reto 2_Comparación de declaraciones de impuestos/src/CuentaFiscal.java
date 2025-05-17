public class CuentaFiscal {

    //Atributos
    private String rfc;
    private double saldoDisponible;

    // Constructor con validación para que el saldo no sea negativo
    public CuentaFiscal(String rfc, double saldoDisponible){
        if(saldoDisponible < 0){
            System.out.println("El saldo disponible no puede ser negativo, se le asignará el valor de 0.");
            this.saldoDisponible = 0;
        } else{
            this.saldoDisponible = saldoDisponible;
        }
        this.rfc = rfc;
    }

    // Getters para ambos atributos
    public String getRfc() {
        return rfc;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // metodo que compare el RFC de la cuenta con el de la declaración
    public boolean validarRFC(DeclaracionImpuestos d){
        // Usamos Objects.equals() para comparar
        return this.rfc.equals(d.rfcContribuyentes());
    }

    public void mostrarCuenta(){
        System.out.println("Cuenta fiscal registrada con RFC: " + rfc + " y saldo disponible de: $" + saldoDisponible);
    }
}
