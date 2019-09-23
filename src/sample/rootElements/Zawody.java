package sample.rootElements;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.Serializable;
import java.util.Date;
@XmlRootElement
public class Zawody implements Serializable {
    private static final long serialVersionUID = 6L;
    private int idZawody;
    private int iloscBiegow;
    private Date data;

    @XmlAttribute
    public int getIdZawody() {
        return idZawody;
    }

    public void setIdZawody(int idZawody) {
        this.idZawody = idZawody;
    }

    public int getIloscBiegow() {
        return iloscBiegow;
    }

    public void setIloscBiegow(int iloscBiegow) {
        this.iloscBiegow = iloscBiegow;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
