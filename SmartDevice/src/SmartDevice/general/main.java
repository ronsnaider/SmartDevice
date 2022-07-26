package SmartDevice.general;
import SmartDevice.general.AtributosGenerales;
import SmartDevice.Dispositivos.Moviles;
import SmartDevice.Dispositivos.Pulsometros;
import SmartDevice.Dispositivos.Relojes;


public class main {
        public static void main(String[] args) {
            Moviles Movil = new Moviles("8mb","nvidia","ios");
            Relojes Reloj = new Relojes("cuero",false,false);
            Pulsometros Pulsometro = new Pulsometros(true,true,true);
            

            System.out.println(Movil);
            System.out.println(Reloj);
            System.out.println(Pulsometro);




        }
}