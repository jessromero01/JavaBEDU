public class Principal {
    public static void main(String[] args) {
        // dos facturas con el mismo folio pero diferentes clientes o totales
        Factura fct1 = new Factura("A1945E", "Jesús Romero", 1798.50);
        Factura fct2 = new Factura("A1945E", "Ana Suárez", 6345.90);

        // Muestra ambas con toString()
        System.out.println(fct1);
        System.out.println(fct2);

        // Compara si son iguales con equals()
        System.out.println("\n¿Las facturas son iguales? " + fct1.equals(fct2));
    }
}
