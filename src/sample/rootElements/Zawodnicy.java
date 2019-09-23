package sample.rootElements;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement
public class Zawodnicy {
    private List<Zawodnik> zawodnicy = new ArrayList<Zawodnik>();

    public Zawodnicy(List<Zawodnik> zawodnicy) {
        super();
        this.zawodnicy = zawodnicy;
    }

    public Zawodnicy() {	}

    public List<Zawodnik> getZawodnicy() {
        return zawodnicy;
    }

    public void setZawodnicy(List<Zawodnik> zawodnicy) {
        this.zawodnicy = zawodnicy;
    }
}
