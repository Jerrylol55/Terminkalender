package com.example.terminkalender;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean
    public class KalenderbeanV2 {

        public KalenderbeanV2(){

        }
        private Datenbank datenbank = new Datenbank();

        public String addReservation(){
            datenbank.add();
            return null;
        }
        public Datenbank getDatenbank(){
            return datenbank;
        }
        public void setDatenbank(Datenbank datenbank){
            this.datenbank = datenbank;
        }

    }


