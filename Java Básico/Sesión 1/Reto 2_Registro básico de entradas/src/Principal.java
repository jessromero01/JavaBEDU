public class Principal {
    public static void main(String[] args){
        Entrada e1 = new Entrada("Concierto", 2799);
        Entrada e2 = new Entrada("Obra de teatro", 250);
        Entrada e3 = new Entrada("Musical", 878);
        Entrada_Record e4 = new Entrada_Record("Convención", 220);
        Entrada_Record e5 = new Entrada_Record("Festival", 1379);
        Entrada_Record e6 = new Entrada_Record("Congreso", 580);

        e1.mostrarInformacion();
        e2.mostrarInformacion();
        e3.mostrarInformacion();
        e4.mostrarInformacion();
        e5.mostrarInformacion();
        e6.mostrarInformacion();
    }
}
