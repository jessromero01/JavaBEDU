public class ImpTransicion implements TransicionHistoria{
    @Override
    public void transicionar(String Decision){
        if (Decision.equalsIgnoreCase("Si")){
            System.out.println("☀\uFE0F Transición al escenario de dia soleado...");
        } else {
            System.out.println("⛈\uFE0F Transición al escenario de tormenta...");
        }
    }
}
