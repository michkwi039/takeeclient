package sample.rootElements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.sql.Time;

@XmlRootElement
public class Wynik implements Serializable {
    private static final long serialVersionUID = 4L;
    private int idWyniki;
    private int idZwyciezcy;
    private Time czas;
    private int idBiegu;
    private int idZawodnika;

    @XmlAttribute
    public int getIdWyniki() {
        return idWyniki;
    }

    public void setIdWyniki(int idWyniki) {
        this.idWyniki = idWyniki;
    }

    public int getIdZwyciezcy() {
        return idZwyciezcy;
    }

    public void setIdZwyciezcy(int idZwyciezcy) {
        this.idZwyciezcy = idZwyciezcy;
    }

    public Time getCzas() {
        return czas;
    }

    public void setCzas(Time czas) {
        this.czas = czas;
    }

    public int getIdBiegu() {
        return idBiegu;
    }

    public void setIdBiegu(int idBiegu) {
        this.idBiegu = idBiegu;
    }

    public int getIdZawodnika() {
        return idZawodnika;
    }

    public void setIdZawodnika(int idZawodnika) {
        this.idZawodnika = idZawodnika;
    }
}
