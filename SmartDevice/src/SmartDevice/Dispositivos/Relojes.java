package SmartDevice.Dispositivos;
import SmartDevice.general.AtributosGenerales;
import SmartDevice.general.AtributosGenerales;

public class Relojes extends AtributosGenerales {
    String tipoCorrea;
    Boolean Digital;
    boolean bluethoo;

    public Relojes(String tipoCorrea, Boolean digital, boolean bluethoo) {
        this.tipoCorrea = tipoCorrea;
        Digital = digital;
        this.bluethoo = bluethoo;
    }

    public Relojes(){

    }
}
