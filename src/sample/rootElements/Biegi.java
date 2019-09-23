package sample.rootElements;


import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;
@XmlRootElement
public class Biegi {
    private List<Bieg> biegi = new ArrayList<Bieg>();

    public Biegi(List<Bieg> biegi) {
        super();
        this.biegi = biegi;
    }

    public Biegi() {	}

    public List<Bieg> getBiegi() {
        return biegi;
    }

    public void setBiegi(List<Bieg> biegi) {
        this.biegi = biegi;
    }
}
