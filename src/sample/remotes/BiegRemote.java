package sample.remotes;

import sample.Entities.Biegi;
import sample.Entities.Containers.BiegiList;
import sample.HttpHelper;


import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class BiegRemote implements Remot<Biegi> {
    String url = "http://localhost:8080/SwimmingCompetiton/biegi";
    @Override
    public void create(Biegi bieg) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(bieg, sw);
        HttpHelper.doPost(url+"/create",sw.toString(),"application/xml");
    }

    @Override
    public Biegi find(int idc) {
        String txt = HttpHelper.doGet(url+"/"+idc);
        Biegi b = JAXB.unmarshal(new StringReader(txt), Biegi.class);
        return b;    }

    @Override
    public List<Biegi> get() {

        String txt = HttpHelper.doGet(url);
        BiegiList biegiList = JAXB.unmarshal(new StringReader(txt), BiegiList.class);
        return biegiList.getList();
    }

    @Override
    public void update(Biegi bieg) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(bieg, sw);
        HttpHelper.send("PUT",url,sw.toString(),"application/xml");
    }

    @Override
    public void delete(int idc) {
        HttpHelper.send("DELETE",url+"/"+idc,null,"application/xml");
    }
}
