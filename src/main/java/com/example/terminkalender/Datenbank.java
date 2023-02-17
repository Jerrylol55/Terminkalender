package com.example.terminkalender;

import java.util.ArrayList;
import java.util.List;

public class Datenbank {
    private ArrayList<Termin> reservations = new ArrayList<Termin>();
    private Termin aktuell = new Termin();

    public Datenbank(){

    }
    public void add(){
        reservations.add(aktuell);
        aktuell = new Termin();
    }

    public ArrayList<Termin> getReservations() {
        return reservations;
    }

    public void setReservations(ArrayList<Termin> reservations) {
        this.reservations = reservations;
    }

    public Termin getAktuell() {
        return aktuell;
    }

    public void setAktuell(Termin aktuell) {
        this.aktuell = aktuell;
    }

}