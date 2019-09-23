package sample.rootElements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;

@XmlRootElement
public class Bieg implements Serializable {
    private static final long serialVersionUID = 2L;
    private int idBiegu;
    private char plec;
    private char przedzial_wiekowy;
    private int idZawody;
    private int idKonkurencja;

    @XmlAttribute
    public int getIdBiegu() {
        return idBiegu;
    }

    public void setIdBiegu(int idBiegu) {
        this.idBiegu = idBiegu;
    }

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public char getPrzedzial_wiekowy() {
        return przedzial_wiekowy;
    }

    public void setPrzedzial_wiekowy(char przedzial_wiekowy) {
        this.przedzial_wiekowy = przedzial_wiekowy;
    }

    public int getIdZawody() {
        return idZawody;
    }

    public void setIdZawody(int idZawody) {
        this.idZawody = idZawody;
    }

    public int getIdKonkurencja() {
        return idKonkurencja;
    }

    public void setIdKonkurencja(int idKonkurencja) {
        this.idKonkurencja = idKonkurencja;
    }



}
