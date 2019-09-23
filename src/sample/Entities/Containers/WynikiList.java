package sample.Entities.Containers;

import sample.Entities.Wyniki;

import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement
public class WynikiList {
    private List<Wyniki> list;

    public List<Wyniki> getList() {
        return list;
    }

    public void setList(List<Wyniki> list) {
        this.list = list;
    }

    public WynikiList(List<Wyniki> list) {
        this.list = list;
    }

    public WynikiList() {
    }
}
