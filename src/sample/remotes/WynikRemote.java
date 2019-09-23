package sample.remotes;

import sample.Entities.Wyniki;
import sample.HttpHelper;


import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class WynikRemote implements Remot<Wyniki> {
    String url = "http://localhost:8080/SwimmingCompetiton/wyniki";
    @Override
    public void create(Wyniki wynik) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(wynik, sw);
        HttpHelper.doPost(url+"/create",sw.toString(),"application/xml");
    }

    @Override
    public Wyniki find(int idc) {
        String txt = HttpHelper.doGet(url+"/"+idc);
        Wyniki w = JAXB.unmarshal(new StringReader(txt), Wyniki.class);
        return w;
    }

    @Override
    public List<Wyniki> get() {
        return null;
    }

    @Override
    public void update(Wyniki wynik) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(wynik, sw);
        HttpHelper.send("PUT",url,sw.toString(),"application/xml");
    }

    @Override
    public void delete(int idc) {
        HttpHelper.send("DELETE",url+"/"+idc,null,"application/xml");
    }
}
