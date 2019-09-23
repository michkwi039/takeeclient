package sample.rootElements;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement
public class Konkurencje {
    private List<Konkurencja> konkurencje = new ArrayList<Konkurencja>();

    public Konkurencje(List<Konkurencja> konkurencje) {
        super();
        this.konkurencje = konkurencje;
    }

    public Konkurencje() {	}

    public List<Konkurencja> getBiegi() {
        return konkurencje;
    }

    public void setKonkurencje(List<Konkurencja> konkurencje) {
        this.konkurencje = konkurencje;
    }
}
