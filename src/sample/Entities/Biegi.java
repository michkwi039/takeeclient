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
public class Biegi  implements Serializable {
    private Integer idBiegu;
    private String plec;
    private String przedzialWiekowy;
    private Integer zawodyIdZawody;
    private Integer konkurencjaIdKonkurencja;
    private Zawody zawodyByZawodyIdZawody;
    private Konkurencja konkurencjaByKonkurencjaIdKonkurencja;
    @XmlTransient
    private Collection<Wyniki> wynikisByIdBiegu;


    public Integer getIdBiegu() {
        return idBiegu;
    }

    public void setIdBiegu(Integer idBiegu) {
        this.idBiegu = idBiegu;
    }


    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }


    public String getPrzedzialWiekowy() {
        return przedzialWiekowy;
    }

    public void setPrzedzialWiekowy(String przedzialWiekowy) {
        this.przedzialWiekowy = przedzialWiekowy;
    }


    public Integer getZawodyIdZawody() {
        return zawodyIdZawody;
    }

    public void setZawodyIdZawody(Integer zawodyIdZawody) {
        this.zawodyIdZawody = zawodyIdZawody;
    }

    public Integer getKonkurencjaIdKonkurencja() {
        return konkurencjaIdKonkurencja;
    }

    public void setKonkurencjaIdKonkurencja(Integer konkurencjaIdKonkurencja) {
        this.konkurencjaIdKonkurencja = konkurencjaIdKonkurencja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Biegi biegi = (Biegi) o;
        return Objects.equals(idBiegu, biegi.idBiegu) &&
                Objects.equals(plec, biegi.plec) &&
                Objects.equals(przedzialWiekowy, biegi.przedzialWiekowy) &&
                Objects.equals(zawodyIdZawody, biegi.zawodyIdZawody) &&
                Objects.equals(konkurencjaIdKonkurencja, biegi.konkurencjaIdKonkurencja);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBiegu, plec, przedzialWiekowy, zawodyIdZawody, konkurencjaIdKonkurencja);
    }


    public Zawody getZawodyByZawodyIdZawody() {
        return zawodyByZawodyIdZawody;
    }

    public void setZawodyByZawodyIdZawody(Zawody zawodyByZawodyIdZawody) {
        this.zawodyByZawodyIdZawody = zawodyByZawodyIdZawody;
    }


    public Konkurencja getKonkurencjaByKonkurencjaIdKonkurencja() {
        return konkurencjaByKonkurencjaIdKonkurencja;
    }

    public void setKonkurencjaByKonkurencjaIdKonkurencja(Konkurencja konkurencjaByKonkurencjaIdKonkurencja) {
        this.konkurencjaByKonkurencjaIdKonkurencja = konkurencjaByKonkurencjaIdKonkurencja;
    }


    public Collection<Wyniki> getWynikisByIdBiegu() {
        return wynikisByIdBiegu;
    }

    public void setWynikisByIdBiegu(Collection<Wyniki> wynikisByIdBiegu) {
        this.wynikisByIdBiegu = wynikisByIdBiegu;
    }
}
