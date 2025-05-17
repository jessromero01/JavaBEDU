import java.util.*;
public class Experimento {
    public static void main (String[] args){

        // ArrayList:  registrar el orden de llegada de las muestras (pueden repetirse si se replican)
        ArrayList<String> muestras = new ArrayList<>();
        muestras.add("Lisosomas celulares");
        muestras.add("Plásmido pBR322");
        muestras.add("Línea celular hepática HepG2");
        muestras.add("Lisosomas celulares"); //Repetida

        System.out.println("\n \uD83E\uDDEA Muestras registradas (ordenadas, con duplicados): \n");
        for(int i = 0; i < muestras.size(); i++){
            System.out.println(i + 1 + "." + muestras.get(i));
        }

        // HashSet: registrar especies únicas procesadas
        HashSet<String> tipoEspecies = new HashSet<>(muestras); // Elimina duplicados

        System.out.println("\n✅ Tipos únicos de especies encontradas:");
        for (String muestra : tipoEspecies) {
            System.out.println("- " + muestra);
        }

        // HashMap: asociar ID de muestra con el nombre del investigador responsable.
        HashMap<String, String> InvesRes = new HashMap<>();
        InvesRes.put("M-001", "Dra. Esmeralda Vences");
        InvesRes.put("M-045", "Dr. Diego Arreola");
        InvesRes.put("M-328", "Dra. Karen Esquivel");

        System.out.println("\n \uD83D\uDC69\uD83C\uDFFB\u200D\uD83D\uDD2C\uD83D\uDC68\uD83C\uDFFB\u200D\uD83D\uDD2C " +
                "Muestras ingresadas (ID → investigador)");
        for (Map.Entry<String, String> entry : InvesRes.entrySet()){
            System.out.println(entry.getKey() + " → " + entry.getValue());
        }

        //  búsqueda por ID de muestra
        String IDbuscar = "M-001";
        System.out.println("\n ⚗\uFE0F La muestra " + IDbuscar +" está a cargo del investigador(a): " + InvesRes.get(IDbuscar));
    }
}
