package sample.Utility;

import sample.Entities.*;
import sample.Entities.Containers.ZawodyList;
import sample.remotes.*;

import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FillDatabase {
    public BiegRemote biegRemote=new BiegRemote();
    public ZawodnicyRemote zawodnicyRemote=new ZawodnicyRemote();
    public KonkurencjaRemote konkurencjaRemote=new KonkurencjaRemote();
    public WynikRemote wynikiRemote=new WynikRemote();
    public ZawodyRemote zawodyRemote=new ZawodyRemote();

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

        try {
            Wyniki wyniki = new Wyniki();
            wyniki.setIdWyniki(1);
            String s = "10:05";
            SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
            long ms = sdf.parse(s).getTime();
            Time t = new Time(ms);
            wyniki.setCzas(t);
            wyniki.setZawodnicyIdZawodnika(1);
            wyniki.setBiegiIdBiegu(1);
            wyniki.setIdZwyciezcy(2);
            wynikiRemote.create(wyniki);
            wyniki.setIdWyniki(2);
            s = "08:05";
            ms = sdf.parse(s).getTime();
            t = new Time(ms);
            wyniki.setCzas(t);
            wyniki.setZawodnicyIdZawodnika(2);
            wyniki.setBiegiIdBiegu(1);
            wyniki.setIdZwyciezcy(2);
            wynikiRemote.create(wyniki);
            Zawody zawody = new Zawody();
            zawody.setIdZawody(1);
            zawody.setIloscBiegow(8);
            SimpleDateFormat sdff = new SimpleDateFormat("yyyy-mm-dd");
            s="2019-08-12";
            ms = sdff.parse(s).getTime();
            Date d = new Date(ms);

            zawody.setData(d);
            zawodyRemote.create(zawody);

        }catch (ParseException e){

        }

    }
}
