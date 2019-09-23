package sample.Entities.Containers;

import sample.Entities.Wyniki;
import sample.Entities.Zawodnicy;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class ZawodnicyList {
    private List<Zawodnicy> list;

    public List<Zawodnicy> getList() {
        return list;
    }

    public void setList(List<Zawodnicy> list) {
        this.list = list;
    }

    public ZawodnicyList(List<Zawodnicy> list) {
        this.list = list;
    }

    public ZawodnicyList() {
    }
}
