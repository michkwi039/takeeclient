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
public class Konkurencja implements Serializable {
    private Integer idKonkurencja;
    private String styl;
    private Integer dystans;
    @XmlTransient
    private Collection<Biegi> biegisByIdKonkurencja;


    public Integer getIdKonkurencja() {
        return idKonkurencja;
    }

    public void setIdKonkurencja(Integer idKonkurencja) {
        this.idKonkurencja = idKonkurencja;
    }


    public String getStyl() {
        return styl;
    }

    public void setStyl(String styl) {
        this.styl = styl;
    }


    public Integer getDystans() {
        return dystans;
    }

    public void setDystans(Integer dystans) {
        this.dystans = dystans;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Konkurencja that = (Konkurencja) o;
        return Objects.equals(idKonkurencja, that.idKonkurencja) &&
                Objects.equals(styl, that.styl) &&
                Objects.equals(dystans, that.dystans);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idKonkurencja, styl, dystans);
    }


    public Collection<Biegi> getBiegisByIdKonkurencja() {
        return biegisByIdKonkurencja;
    }

    public void setBiegisByIdKonkurencja(Collection<Biegi> biegisByIdKonkurencja) {
        this.biegisByIdKonkurencja = biegisByIdKonkurencja;
    }
}
