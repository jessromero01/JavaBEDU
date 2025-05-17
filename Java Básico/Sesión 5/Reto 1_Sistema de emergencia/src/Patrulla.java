public class Patrulla extends UnidadEmergencia{
        private SistemaGPS gps;
        private Sirena sir;
        private Operador oper;

        public Patrulla(String nombre, String nO) {
            super(nombre);
            this.gps = new SistemaGPS();
            this.sir = new Sirena();
            this.oper = new Operador(nO);
        }

        public void iniciarOperador(){
            activarUnidad();
            gps.localizar();
            sir.activarSirena();
            oper.reportarse();
            Responder();
        }

        @Override
        public void Responder(){
            System.out.println("\uD83D\uDE93 Patrulla atendiendo situación de seguridad ciudadana.");
        }
}
