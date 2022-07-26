package SmartDevice.Dispositivos;
import SmartDevice.general.AtributosGenerales;


    public class Moviles extends AtributosGenerales{
         String memoriaRam;
         String trajetaGrafica;
         String SistemaOperativo;

        public Moviles(String memoriaRam, String trajetaGrafica, String sistemaOperativo) {
            this.memoriaRam = memoriaRam;
            this.trajetaGrafica = trajetaGrafica;
            SistemaOperativo = sistemaOperativo;
        }

        public Moviles(){

        }

    }

