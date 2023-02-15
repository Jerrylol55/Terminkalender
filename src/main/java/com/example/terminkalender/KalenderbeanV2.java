package com.example.terminkalender;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class KalenderbeanV2 {

    public String Openpage(){
        return "Reservationerstellen";
    }
}
