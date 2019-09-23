package sample.remotes;

import sample.Entities.Containers.KonkurencjaList;
import sample.Entities.Konkurencja;
import sample.HttpHelper;


import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class KonkurencjaRemote implements Remot<Konkurencja> {
    String url = "http://localhost:8080/SwimmingCompetiton/konkurencja";
    @Override
    public void create(Konkurencja konkurencja) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(konkurencja, sw);
        HttpHelper.doPost(url+"/create",sw.toString(),"application/xml");
    }

    @Override
    public Konkurencja find(int idc) {
        String txt = HttpHelper.doGet(url+"/"+idc);
        Konkurencja k = JAXB.unmarshal(new StringReader(txt), Konkurencja.class);
        return k;
    }

    @Override
    public List<Konkurencja> get() {
        String txt = HttpHelper.doGet(url);
        KonkurencjaList zawodnicy = JAXB.unmarshal(new StringReader(txt), KonkurencjaList.class);
        return zawodnicy.getList();
    }

    @Override
    public void update(Konkurencja konkurencja) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(konkurencja, sw);
        HttpHelper.send("PUT",url,sw.toString(),"application/xml");
    }

    @Override
    public void delete(int idc) {
        HttpHelper.send("DELETE",url+"/"+idc,null,"application/xml");
    }
}
