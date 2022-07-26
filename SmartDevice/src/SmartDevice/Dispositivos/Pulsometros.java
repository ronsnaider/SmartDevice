package SmartDevice.Dispositivos;
import SmartDevice.general.AtributosGenerales;

public class Pulsometros  extends AtributosGenerales{

    boolean medidorOxigeno;
    boolean medidorPulsaciones;
    boolean medidorsueño;

    public Pulsometros(boolean medidorOxigeno, boolean medidorPulsaciones, boolean medidorsueño) {
        this.medidorOxigeno = medidorOxigeno;
        this.medidorPulsaciones = medidorPulsaciones;
        this.medidorsueño = medidorsueño;
    }

    public Pulsometros(){

    }
}
