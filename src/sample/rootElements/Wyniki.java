package sample.rootElements;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement
public class Wyniki {
    private List<Wynik> wyniki = new ArrayList<Wynik>();

    public Wyniki(List<Wynik> wyniki) {
        super();
        this.wyniki = wyniki;
    }

    public Wyniki() {	}

    public List<Wynik> getWyniki() {
        return wyniki;
    }

    public void setWyniki(List<Wynik> wyniki) {
        this.wyniki = wyniki;
    }
}

