package sample.Utility;

import sample.Entities.Biegi;
import sample.Entities.Konkurencja;
import sample.Entities.Zawodnicy;
import sample.remotes.BiegRemote;
import sample.remotes.KonkurencjaRemote;
import sample.remotes.ZawodnicyRemote;

public class FillDatabase {
    public BiegRemote biegRemote=new BiegRemote();
    public ZawodnicyRemote zawodnicyRemote=new ZawodnicyRemote();
    public KonkurencjaRemote konkurencjaRemote=new KonkurencjaRemote();

    public void fill(){
        Konkurencja konkurencja =new Konkurencja();
        konkurencja.setDystans(300);
        konkurencja.setIdKonkurencja(1);
        konkurencja.setStyl("kraul");
        konkurencjaRemote.create(konkurencja);
        konkurencja.setDystans(500);
        konkurencja.setIdKonkurencja(2);
        konkurencja.setStyl("rozpaczliwiec");
        konkurencjaRemote.create(konkurencja);
        konkurencja.setDystans(1000);
        konkurencja.setIdKonkurencja(3);
        konkurencja.setStyl("plecy");
        konkurencjaRemote.create(konkurencja);
        konkurencja.setDystans(1200);
        konkurencja.setIdKonkurencja(5);
        konkurencja.setStyl("zabka");
        konkurencjaRemote.create(konkurencja);
        konkurencja.setDystans(100);
        konkurencja.setIdKonkurencja(6);
        konkurencja.setStyl("glajk");
        konkurencjaRemote.create(konkurencja);

        Zawodnicy zawodnicy=new Zawodnicy();
        zawodnicy.setIdZawodnika(1);
        zawodnicy.setImie("Michal");
        zawodnicy.setNazwisko("Kwiatkowski");
        zawodnicy.setWiek(12);
        zawodnicy.setPlec("M");
        zawodnicyRemote.create(zawodnicy);
        zawodnicy.setIdZawodnika(2);
        zawodnicy.setImie("Andrzej");
        zawodnicy.setNazwisko("Magik");
        zawodnicy.setWiek(21);
        zawodnicy.setPlec("K");
        zawodnicyRemote.create(zawodnicy);
        zawodnicy.setIdZawodnika(3);
        zawodnicy.setImie("Samolot");
        zawodnicy.setNazwisko("Samolotowski");
        zawodnicy.setWiek(18);
        zawodnicy.setPlec("M");
        zawodnicyRemote.create(zawodnicy);
        zawodnicy.setIdZawodnika(4);
        zawodnicy.setImie("Jarosław");
        zawodnicy.setNazwisko("Niestowski");
        zawodnicy.setWiek(24);
        zawodnicy.setPlec("M");
        zawodnicyRemote.create(zawodnicy);
        zawodnicy.setIdZawodnika(5);
        zawodnicy.setImie("Agnieszka");
        zawodnicy.setNazwisko("Piaseczna");
        zawodnicy.setWiek(8);
        zawodnicy.setPlec("K");
        zawodnicyRemote.create(zawodnicy);
        Biegi biegi=new Biegi();
        biegi.setIdBiegu(1);
        biegi.setPlec("M");
        biegi.setPrzedzialWiekowy("J");
        biegi.setKonkurencjaIdKonkurencja(2);
        biegRemote.create(biegi);
        biegi.setIdBiegu(2);
        biegi.setPlec("K");
        biegi.setPrzedzialWiekowy("D");
        biegi.setKonkurencjaIdKonkurencja(3);
        biegRemote.create(biegi);
        biegi.setIdBiegu(3);
        biegi.setPlec("M");
        biegi.setPrzedzialWiekowy("G");
        biegi.setKonkurencjaIdKonkurencja(1);
        biegRemote.create(biegi);
        biegi.setIdBiegu(4);
        biegi.setPlec("M");
        biegi.setPrzedzialWiekowy("J");
        biegi.setKonkurencjaIdKonkurencja(4);
        biegRemote.create(biegi);
        biegi.setIdBiegu(5);
        biegi.setPlec("K");
        biegi.setPrzedzialWiekowy("D");
        biegi.setKonkurencjaIdKonkurencja(1);
        biegRemote.create(biegi);

    }
}
