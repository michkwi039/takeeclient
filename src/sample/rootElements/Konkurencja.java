package sample.rootElements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Konkurencja implements Serializable {
    private static final long serialVersionUID = 3L;
    private int idKonkurencja;
    private String styl;
    private int dystans;

    @XmlAttribute
    public int getIdKonkurencja() {
        return idKonkurencja;
    }

    public void setIdKonkurencja(int idKonkurencja) {
        this.idKonkurencja = idKonkurencja;
    }

    public String getStyl() {
        return styl;
    }

    public void setStyl(String styl) {
        this.styl = styl;
    }

    public int getDystans() {
        return dystans;
    }

    public void setDystans(int dystans) {
        this.dystans = dystans;
    }
}
