package sample.rootElements;


import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;


@XmlRootElement
public class Zawodnik implements Serializable {
    private static final long serialVersionUID = 5L;
    private int idZawodnika;
    private String imie;
    private String nazwisko;
    private char plec;
    private int wiek;

    @XmlAttribute
    public int getIdZawodnika() {
        return idZawodnika;
    }

    public void setIdZawodnika(int idZawodnika) {
        this.idZawodnika = idZawodnika;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public char getPlec() {
        return plec;
    }

    public void setPlec(char plec) {
        this.plec = plec;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
