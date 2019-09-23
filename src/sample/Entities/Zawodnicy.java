package sample.Entities;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import java.io.Serializable;
import java.util.Collection;
import java.util.Objects;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Zawodnicy implements Serializable {
    private Integer idZawodnika;
    private String imie;
    private String nazwisko;
    private String plec;
    private Integer wiek;
    @XmlTransient
    private Collection<Wyniki> wynikisByIdZawodnika;


    public Integer getIdZawodnika() {
        return idZawodnika;
    }

    public void setIdZawodnika(Integer idZawodnika) {
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

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }


    public Integer getWiek() {
        return wiek;
    }

    public void setWiek(Integer wiek) {
        this.wiek = wiek;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zawodnicy zawodnicy = (Zawodnicy) o;
        return Objects.equals(idZawodnika, zawodnicy.idZawodnika) &&
                Objects.equals(imie, zawodnicy.imie) &&
                Objects.equals(nazwisko, zawodnicy.nazwisko) &&
                Objects.equals(plec, zawodnicy.plec) &&
                Objects.equals(wiek, zawodnicy.wiek);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idZawodnika, imie, nazwisko, plec, wiek);
    }


    public Collection<Wyniki> getWynikisByIdZawodnika() {
        return wynikisByIdZawodnika;
    }

    public void setWynikisByIdZawodnika(Collection<Wyniki> wynikisByIdZawodnika) {
        this.wynikisByIdZawodnika = wynikisByIdZawodnika;
    }
}
