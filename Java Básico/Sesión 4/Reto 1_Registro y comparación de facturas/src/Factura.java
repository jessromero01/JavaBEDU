public class Factura {

    //Atributos
    String folio;
    String cliente;
    double total;

    //Inicializador
    public Factura(String folio, String cliente, double total){
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // mostrar factura
    @Override
    public String toString() {
        return "\uD83D\uDCD1 Factura: [folio = " + folio + "cliente = " + cliente + "total = $" + total + "]";
    }

    // para que dos facturas se consideren iguales si tienen el mismo folio
    public boolean equals(Object fol){
        if (this == fol) return true; // verifica si las dos referencias apuntan al mismo objeto
        if (fol == null || getClass() != fol.getClass()); // Si fol es null, no puede ser igual a this. Si las clases de this y fol no son del mismo tipo, tampoco son iguales.

        Factura otraFactura = (Factura) fol; // conversión de tipo de Object a Folio
        return this.folio.equals(otraFactura.folio); //  comparar sus atributos
    }

    // para garantizar que objetos iguales tengan el mismo código.
    @Override
    public int hashCode(){
        return folio.hashCode();
    }
}