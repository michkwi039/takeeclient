package sample.remotes;

import sample.Entities.Containers.ZawodyList;
import sample.Entities.Zawody;
import sample.HttpHelper;


import javax.xml.bind.JAXB;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.List;

public class ZawodyRemote implements Remot<Zawody> {
    String url = "http://localhost:8080/SwimmingCompetiton/zawody";
    @Override
    public void create(Zawody zawody) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(zawody, sw);
        HttpHelper.doPost(url+"/create",sw.toString(),"application/xml");
    }

    @Override
    public Zawody find(int idc) {
        String txt = HttpHelper.doGet(url+"/"+idc);
        Zawody z = JAXB.unmarshal(new StringReader(txt), Zawody.class);
        return z;
    }

    @Override
    public List<Zawody> get() {
        String txt = HttpHelper.doGet(url);
        ZawodyList zawody = JAXB.unmarshal(new StringReader(txt), ZawodyList.class);
        return zawody.getList();
    }

    @Override
    public void update(Zawody zawody) {
        StringWriter sw = new StringWriter();
        JAXB.marshal(zawody, sw);
        HttpHelper.send("PUT",url,sw.toString(),"application/xml");
    }

    @Override
    public void delete(int idc) {
        HttpHelper.send("DELETE",url+"/"+idc,null,"application/xml");
    }
}
