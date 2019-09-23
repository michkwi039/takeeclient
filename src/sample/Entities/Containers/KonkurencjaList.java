package sample.Entities.Containers;

import sample.Entities.Konkurencja;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;
@XmlRootElement
public class KonkurencjaList {
    private List<Konkurencja> list;

    public List<Konkurencja> getList() {
        return list;
    }

    public void setList(List<Konkurencja> list) {
        this.list = list;
    }

    public KonkurencjaList() {
    }

    public KonkurencjaList(List<Konkurencja> list) {
        this.list = list;
    }
}
