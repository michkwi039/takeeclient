package sample.remotes;

import sample.Entities.Containers.ZawodnicyList;
import sample.Entities.Zawodnicy;
import sample.HttpHelper;


import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class ZawodnicyRemote implements Remot<Zawodnicy> {
    String url = "http://localhost:8080/SwimmingCompetiton/zawodnicy";
    @Override
    public void create(Zawodnicy zawodnik) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(zawodnik, sw);
        HttpHelper.doPost(url+"/create",sw.toString(),"application/xml");
    }

    @Override
    public Zawodnicy find(int idc) {
        String txt = HttpHelper.doGet(url+"/"+idc);
        Zawodnicy z = JAXB.unmarshal(new StringReader(txt), Zawodnicy.class);
        return z;
    }

    @Override
    public List<Zawodnicy> get() {
        String txt = HttpHelper.doGet(url);
        ZawodnicyList zawodnicy = JAXB.unmarshal(new StringReader(txt), ZawodnicyList.class);
        return zawodnicy.getList();
    }

    @Override
    public void update(Zawodnicy zawodnik) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(zawodnik, sw);
        HttpHelper.send("PUT",url,sw.toString(),"application/xml");
    }

    @Override
    public void delete(int idc) {
        HttpHelper.send("DELETE",url+"/"+idc,null,"application/xml");

    }
}
