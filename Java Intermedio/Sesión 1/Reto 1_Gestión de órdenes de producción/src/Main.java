import java.util.List;
import java.util.ArrayList;
public class Main{
    public static void main(String[] args) {

        // ordenes
        OrdenMasa om1 = new OrdenMasa("B5L6", 650);
        OrdenMasa om2 = new OrdenMasa("A6P9", 131);

        OrdenPersonalizada op1 = new OrdenPersonalizada("C896", 450, "Ana Ruiz");
        OrdenPersonalizada op2 = new OrdenPersonalizada("P155", 25, "Amairani Pantoja");

        OrdenPrototipo pp1 = new OrdenPrototipo("M489", 1000, "Diseño");
        OrdenPrototipo pp2 = new OrdenPrototipo("P452", 450, "Pruebas");

        // Listas por tipo
        List<OrdenMasa> ordenMasas = List.of(om1, om2);
        List<OrdenPersonalizada> ordenPersonalizadas = new ArrayList<>();
        ordenPersonalizadas.add(op1);
        ordenPersonalizadas.add(op2);
        List<OrdenPrototipo> ordenPrototipos = List.of(pp1, pp2);

        // ordenes por tipo
        System.out.println("📃 Órdenes registradas:\n");
        ProcesadorOrdenes.imprimirOrdenes(ordenMasas);
        System.out.println();
        ProcesadorOrdenes.imprimirOrdenes(ordenPersonalizadas);
        System.out.println();
        ProcesadorOrdenes.imprimirOrdenes(ordenPrototipos);
        System.out.println();

        System.out.println("💰 Procesando órdenes personalizadas...");
        ProcesadorOrdenes.procesarPersonalizadas(ordenPersonalizadas, 500);
        System.out.println();

        // Resumen
        System.out.println("📊 Resumen total de órdenes:");
        System.out.println("📠 Producción en masa: " + ordenMasas.size());
        System.out.println("📑 Personalizadas: " + ordenPersonalizadas.size());
        System.out.println("📇 Prototipos: " + ordenPrototipos.size());
    }
}