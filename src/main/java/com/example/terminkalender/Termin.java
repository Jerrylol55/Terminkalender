package com.example.terminkalender;

import java.util.ArrayList;

        import java.text.DateFormat;
        import java.util.Date;
import java.util.List;

public class Termin {



     private String Datum;
     private String Von;
     private String Bis;
     private int Zimmer;
     private String Bemerkung;
     private String ListeVonTeilnehmer;

     private String Key;

     private String Datum2;

     public Termin(){


     }

     public String getKey() {
          return Key;
     }


     public void setKey(String key) {
          Key = key;
     }


     public String getDatum() {
          return Datum;
     }

     public void setDatum(String datum) {
          this.Datum = datum;
     }

     public String getVon() {
          return Von;
     }

     public void setVon(String von) {
          this.Von = von;
     }

     public String getBis() {
          return Bis;
     }

     public void setBis(String bis) {
          this.Bis = bis;
     }

     public int getZimmer() {
          return Zimmer;
     }

     public void setZimmer(int zimmer) {
          this.Zimmer = zimmer;
     }

     public String getBemerkung() {
          return Bemerkung;
     }

     public void setBemerkung(String bemerkung) {
          this.Bemerkung = bemerkung;
     }

     public String getListeVonTeilnehmer() {
          return ListeVonTeilnehmer;
     }

     public void setListeVonTeilnehmer(String listeVonTeilnehmer) {
          this.ListeVonTeilnehmer = listeVonTeilnehmer;
     }
}
