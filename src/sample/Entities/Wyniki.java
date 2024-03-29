package sample.Entities;


import sample.Utility.TimeAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Wyniki implements Serializable {
    private Integer idWyniki;
    private Integer idZwyciezcy;
    @XmlJavaTypeAdapter(TimeAdapter.class)
    private Time czas;
    private Integer biegiIdBiegu;
    private Integer zawodnicyIdZawodnika;
    private Biegi biegiByBiegiIdBiegu;
    private Zawodnicy zawodnicyByZawodnicyIdZawodnika;


    public Integer getIdWyniki() {
        return idWyniki;
    }

    public void setIdWyniki(Integer idWyniki) {
        this.idWyniki = idWyniki;
    }


    public Integer getIdZwyciezcy() {
        return idZwyciezcy;
    }

    public void setIdZwyciezcy(Integer idZwyciezcy) {
        this.idZwyciezcy = idZwyciezcy;
    }


    public Time getCzas() {
        return czas;
    }

    public void setCzas(Time czas) {
        this.czas = czas;
    }


    public Integer getBiegiIdBiegu() {
        return biegiIdBiegu;
    }

    public void setBiegiIdBiegu(Integer biegiIdBiegu) {
        this.biegiIdBiegu = biegiIdBiegu;
    }


    public Integer getZawodnicyIdZawodnika() {
        return zawodnicyIdZawodnika;
    }

    public void setZawodnicyIdZawodnika(Integer zawodnicyIdZawodnika) {
        this.zawodnicyIdZawodnika = zawodnicyIdZawodnika;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wyniki wyniki = (Wyniki) o;
        return Objects.equals(idWyniki, wyniki.idWyniki) &&
                Objects.equals(idZwyciezcy, wyniki.idZwyciezcy) &&
                Objects.equals(czas, wyniki.czas) &&
                Objects.equals(biegiIdBiegu, wyniki.biegiIdBiegu) &&
                Objects.equals(zawodnicyIdZawodnika, wyniki.zawodnicyIdZawodnika);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idWyniki, idZwyciezcy, czas, biegiIdBiegu, zawodnicyIdZawodnika);
    }


    public Biegi getBiegiByBiegiIdBiegu() {
        return biegiByBiegiIdBiegu;
    }

    public void setBiegiByBiegiIdBiegu(Biegi biegiByBiegiIdBiegu) {
        this.biegiByBiegiIdBiegu = biegiByBiegiIdBiegu;
    }


    public Zawodnicy getZawodnicyByZawodnicyIdZawodnika() {
        return zawodnicyByZawodnicyIdZawodnika;
    }

    public void setZawodnicyByZawodnicyIdZawodnika(Zawodnicy zawodnicyByZawodnicyIdZawodnika) {
        this.zawodnicyByZawodnicyIdZawodnika = zawodnicyByZawodnicyIdZawodnika;
    }
}
