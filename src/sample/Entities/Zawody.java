package sample.Entities;


import sample.Utility.DateAdapter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.sql.Date;
import java.util.Collection;
import java.util.Objects;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Zawody implements Serializable {
    private Integer idZawody;
    private Integer iloscBiegow;
    @XmlJavaTypeAdapter(DateAdapter.class)
    private Date data;
    @XmlTransient
    private Collection<Biegi> biegisByIdZawody;


    public Integer getIdZawody() {
        return idZawody;
    }

    public void setIdZawody(Integer idZawody) {
        this.idZawody = idZawody;
    }

    public Integer getIloscBiegow() {
        return iloscBiegow;
    }

    public void setIloscBiegow(Integer iloscBiegow) {
        this.iloscBiegow = iloscBiegow;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Zawody zawody = (Zawody) o;
        return Objects.equals(idZawody, zawody.idZawody) &&
                Objects.equals(iloscBiegow, zawody.iloscBiegow) &&
                Objects.equals(data, zawody.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idZawody, iloscBiegow, data);
    }


    public Collection<Biegi> getBiegisByIdZawody() {
        return biegisByIdZawody;
    }

    public void setBiegisByIdZawody(Collection<Biegi> biegisByIdZawody) {
        this.biegisByIdZawody = biegisByIdZawody;
    }
}
