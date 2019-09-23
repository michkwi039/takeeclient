package sample;

import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.util.converter.IntegerStringConverter;
import sample.Entities.*;
import sample.remotes.*;

import java.io.IOException;
import java.net.URL;
import java.sql.Date;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    public TableView<Konkurencja> konkurencjeTable;
    public TableView<Zawody> zawodyTable;
    public TableView<Biegi> biegiTable;
    public TableView<Wyniki> wynikiTable;
    public TableView<Zawodnicy> zawodnicyTable;
    public TableColumn column13;
    public TableColumn column23;
    public TableColumn column33;
    public TableColumn column1;
    public TableColumn column2;
    public TableColumn column3;
    public TableColumn column4;
    public TableColumn column14;
    public TableColumn column11;
    public TableColumn column21;
    public TableColumn column31;
    public TableColumn column41;
    public TableColumn column111;
    public TableColumn column12;
    public TableColumn column22;
    public TableColumn column32;
    public TableColumn column42;
    public TableColumn column121;
    public TextField bieg0,bieg1,bieg2,bieg3,bieg4;
    public TextField konkurencja0,konkurencja1,konkurencja2;
    public TextField wyniki0,wyniki01,wyniki011,wyniki0111,wyniki01111;
    public TextField zawodnicy1,zawodnicy11,zawodnicy111,zawodnicy1111,zawodnicy11111;
    public ZawodyRemote zawodyRemote=new ZawodyRemote();
    public KonkurencjaRemote konkurencjaRemote=new KonkurencjaRemote();
    public BiegRemote biegRemote=new BiegRemote();
    public ZawodnicyRemote zawodnicyRemote=new ZawodnicyRemote();
    public WynikRemote wynikRemote=new WynikRemote();
    public TableColumn IDKonkurencjiColumn;
    public TableColumn stylColumn;
    public TableColumn dystansColumn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        column13.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("idZawody"));
        column23.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("iloscBiegow"));
        column23.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        column33.setCellValueFactory(
                new PropertyValueFactory<Zawody, Date>("data"));
        IDKonkurencjiColumn.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("idKonkurencja"));
        stylColumn.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("styl"));
        stylColumn.setCellFactory(TextFieldTableCell.forTableColumn());
        dystansColumn.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("dystans"));
        dystansColumn.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        column1.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("idBiegu"));
        column2.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("plec"));
        column2.setCellFactory(TextFieldTableCell.forTableColumn());
        column3.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("przedzialWiekowy"));
        column3.setCellFactory(TextFieldTableCell.forTableColumn());
        column4.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("konkurencjaIdKonkurencja"));
        column4.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        column14.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("zawodyIdZawody"));
        column14.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        column11.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("idWyniki"));
        column21.setCellValueFactory(
                new PropertyValueFactory<Zawody, Time>("czas"));
        column31.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("zawodnicyIdZawodnika"));
        column31.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        column111.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("biegiIdBiegu"));
        column111.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        column41.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("idZwyciezcy"));
        column41.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        column12.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("idZawodnika"));
        column22.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("imie"));
        column22.setCellFactory(TextFieldTableCell.forTableColumn());
        column32.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("nazwisko"));
        column32.setCellFactory(TextFieldTableCell.forTableColumn());
        column42.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("wiek"));
        column42.setCellFactory(TextFieldTableCell.forTableColumn(new IntegerStringConverter()));
        column121.setCellValueFactory(
                new PropertyValueFactory<Zawody, String>("plec"));
        column121.setCellFactory(TextFieldTableCell.forTableColumn());


        Konkurencja konkurencja =new Konkurencja();
        konkurencja.setDystans(200);
        konkurencja.setIdKonkurencja(4);
        konkurencja.setStyl("zabka");
        konkurencjaRemote.create(konkurencja);
        Zawody zawody=new Zawody();
        zawody.setIloscBiegow(12);
        zawody.setIdZawody(2);
        zawody.setData(new Date(2000000));
        zawodyRemote.create(zawody);
        List<Zawody> zawodyList= zawodyRemote.get();
        if(zawodyList!=null&&!zawodyList.isEmpty()) {
            zawodyTable.getItems().setAll(zawodyList);
        }
        getKonkurencja();
    }


    public void addKonkurencja(ActionEvent event) throws IOException{
        Konkurencja konkurencja=new Konkurencja();
        konkurencja.setIdKonkurencja(Integer.parseInt(konkurencja0.getText()));
        konkurencja.setStyl(konkurencja1.getText());
        konkurencja.setDystans(Integer.parseInt(konkurencja2.getText()));
        konkurencjaRemote.create(konkurencja);
        getKonkurencja();
    }
    public void deleteKonkurencja(ActionEvent event) throws IOException{
        ObservableList<Konkurencja> selected,all;
        all=konkurencjeTable.getItems();
        selected=konkurencjeTable.getSelectionModel().getSelectedItems();
        konkurencjaRemote.delete(selected.get(0).getIdKonkurencja());
        getKonkurencja();
    }
    public void getKonkurencja(){
        List<Konkurencja> konkurencjaList= konkurencjaRemote.get();
        if(konkurencjaList!=null&&!konkurencjaList.isEmpty()) {
            konkurencjeTable.getItems().setAll(konkurencjaList);
        }
    }
    public void onEditStyl(TableColumn.CellEditEvent<Konkurencja,String> cellEditEvent) {
        Konkurencja konkurencja= konkurencjeTable.getSelectionModel().getSelectedItem();
        konkurencja.setStyl(cellEditEvent.getNewValue());
        konkurencjaRemote.update(konkurencja);
        getKonkurencja();
    }
    public void onEditDystans(TableColumn.CellEditEvent<Konkurencja,Integer> cellEditEvent) {
        Konkurencja konkurencja= konkurencjeTable.getSelectionModel().getSelectedItem();

        konkurencja.setDystans( cellEditEvent.getNewValue());
        konkurencjaRemote.update(konkurencja);
        getKonkurencja();
    }

    public void addBieg(ActionEvent actionEvent) {
        Biegi biegi=new Biegi();
        biegi.setIdBiegu(Integer.parseInt(bieg0.getText()));
        biegi.setPlec(bieg1.getText());
        biegi.setPrzedzialWiekowy(bieg2.getText());
        if(bieg3.getText()!=null)
            if(!bieg3.getText().isEmpty())
        biegi.setKonkurencjaIdKonkurencja(Integer.parseInt(bieg3.getText()));
        if(bieg4.getText()!=null)
            if(!bieg4.getText().isEmpty())
        biegi.setZawodyIdZawody(Integer.parseInt(bieg4.getText()));
        biegRemote.create(biegi);
        getBiegi();
    }
    public void deleteBieg(ActionEvent event) throws IOException{
        List<Biegi> selected;
        selected=biegiTable.getSelectionModel().getSelectedItems();
        biegRemote.delete(selected.get(0).getIdBiegu());
        getBiegi();
    }
    public void getBiegi(){
        List<Biegi> biegiList= biegRemote.get();
        if(biegiList!=null&&!biegiList.isEmpty()) {
            biegiTable.getItems().setAll(biegiList);
        }
    }
    public void onEditPlec(TableColumn.CellEditEvent<Konkurencja,String> cellEditEvent) {
        Biegi biegi= biegiTable.getSelectionModel().getSelectedItem();
        biegi.setPlec(cellEditEvent.getNewValue());
        biegRemote.update(biegi);
        getBiegi();
    }
    public void onEditPrzedzial(TableColumn.CellEditEvent<Konkurencja,String> cellEditEvent) {
        Biegi biegi= biegiTable.getSelectionModel().getSelectedItem();
        biegi.setPrzedzialWiekowy(cellEditEvent.getNewValue());
        biegRemote.update(biegi);
        getBiegi();
    }
    public void onEditIdZawody(TableColumn.CellEditEvent<Konkurencja,Integer> cellEditEvent) {
        Biegi biegi= biegiTable.getSelectionModel().getSelectedItem();
        biegi.setZawodyIdZawody(cellEditEvent.getNewValue());
        biegRemote.update(biegi);
        getBiegi();
    }
    public void onEditIdKonkurencja(TableColumn.CellEditEvent<Konkurencja,Integer> cellEditEvent) {
        Biegi biegi= biegiTable.getSelectionModel().getSelectedItem();
        biegi.setKonkurencjaIdKonkurencja(cellEditEvent.getNewValue());
        biegRemote.update(biegi);
        getBiegi();
    }

    public void addWyniki(ActionEvent actionEvent) {
        try {
            Wyniki wyniki = new Wyniki();
            wyniki.setIdWyniki(Integer.parseInt(wyniki0.getText()));
            String s = wyniki01.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
            long ms = sdf.parse(s).getTime();
            Time t = new Time(ms);
            wyniki.setCzas(t);
            if(wyniki011.getText()!=null||!wyniki011.getText().isEmpty())
            wyniki.setZawodnicyIdZawodnika(Integer.parseInt(wyniki011.getText()));
            if(wyniki0111.getText()!=null||!wyniki0111.getText().isEmpty())
            wyniki.setBiegiIdBiegu(Integer.parseInt(wyniki0111.getText()));
            wyniki.setIdZwyciezcy(Integer.parseInt(wyniki01111.getText()));
            wynikRemote.create(wyniki);
            getWyniki();
        }catch (ParseException ex){
            System.out.println("Kuuuurwaaaaaa");
        }

    }
    public void deleteWyniki(ActionEvent event) throws IOException{
        List<Wyniki> selected;
        selected=wynikiTable.getSelectionModel().getSelectedItems();
        wynikRemote.delete(selected.get(0).getIdWyniki());
        getWyniki();
    }
    public void getWyniki(){
        List<Wyniki> wynikiList= wynikRemote.get();
        if(wynikiList!=null&&!wynikiList.isEmpty()) {
            wynikiTable.getItems().setAll(wynikiList);
        }
    }
    public void onEditIdZwyciezcy(TableColumn.CellEditEvent<Konkurencja,Integer> cellEditEvent) {
        Wyniki wyniki= wynikiTable.getSelectionModel().getSelectedItem();
        wyniki.setIdZwyciezcy(cellEditEvent.getNewValue());
        wynikRemote.update(wyniki);
        getWyniki();
    }
    public void onEditIdBiegu(TableColumn.CellEditEvent<Konkurencja,Integer> cellEditEvent) {
        Wyniki wyniki= wynikiTable.getSelectionModel().getSelectedItem();
        wyniki.setBiegiIdBiegu(cellEditEvent.getNewValue());
        wynikRemote.update(wyniki);
        getWyniki();
    }
    public void onEditIdZawodnika(TableColumn.CellEditEvent<Konkurencja,Integer> cellEditEvent) {
        Wyniki wyniki= wynikiTable.getSelectionModel().getSelectedItem();
        wyniki.setZawodnicyIdZawodnika(cellEditEvent.getNewValue());
        wynikRemote.update(wyniki);
        getWyniki();
    }

    public void addZawodnicy(ActionEvent actionEvent) {
        Zawodnicy zawodnicy=new Zawodnicy();
        zawodnicy.setIdZawodnika(Integer.parseInt(zawodnicy1.getText()));
        zawodnicy.setImie(zawodnicy11.getText());
        zawodnicy.setNazwisko(zawodnicy111.getText());
        zawodnicy.setWiek(Integer.parseInt(zawodnicy1111.getText()));
        zawodnicy.setPlec(zawodnicy11111.getText());
        zawodnicyRemote.create(zawodnicy);
        getZawodnicy();
    }
    public void deleteZawodnicy(ActionEvent event) throws IOException{
        List<Zawodnicy> selected;
        selected=zawodnicyTable.getSelectionModel().getSelectedItems();
        zawodnicyRemote.delete(selected.get(0).getIdZawodnika());
        getZawodnicy();
    }
    public void getZawodnicy(){
        List<Zawodnicy> zawodnicyList= zawodnicyRemote.get();
        if(zawodnicyList!=null&&!zawodnicyList.isEmpty()) {
            zawodnicyTable.getItems().setAll(zawodnicyList);
        }
    }
    public void onEditImie(TableColumn.CellEditEvent<Konkurencja,String> cellEditEvent) {
        Zawodnicy zawodnicy= zawodnicyTable.getSelectionModel().getSelectedItem();
        zawodnicy.setImie(cellEditEvent.getNewValue());
        zawodnicyRemote.update(zawodnicy);
        getZawodnicy();
    }
    public void onEditNazwisko(TableColumn.CellEditEvent<Konkurencja,String> cellEditEvent) {
        Zawodnicy zawodnicy= zawodnicyTable.getSelectionModel().getSelectedItem();
        zawodnicy.setNazwisko(cellEditEvent.getNewValue());
        zawodnicyRemote.update(zawodnicy);
        getZawodnicy();
    }
    public void onEditPlecZawodnika(TableColumn.CellEditEvent<Konkurencja,String> cellEditEvent) {
        Zawodnicy zawodnicy= zawodnicyTable.getSelectionModel().getSelectedItem();
        zawodnicy.setPlec(cellEditEvent.getNewValue());
        zawodnicyRemote.update(zawodnicy);
        getZawodnicy();
    }
    public void onEditWiek(TableColumn.CellEditEvent<Konkurencja,Integer> cellEditEvent) {
        Zawodnicy zawodnicy= zawodnicyTable.getSelectionModel().getSelectedItem();
        zawodnicy.setWiek(cellEditEvent.getNewValue());
        zawodnicyRemote.update(zawodnicy);
        getZawodnicy();
    }



}
