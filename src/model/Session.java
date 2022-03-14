package model;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;

public class Session {
    Date date;
    Time heure;
    int nbrPlace;
    ArrayList<Menu> listeMenu;
    ArrayList<Enfant> listeEnfants;

    public Session(Date date, Time heure, int nbrPlace) {
        this.date = date;
        this.heure = heure;
        this.nbrPlace = nbrPlace;
    }

    public Date getdDate() {
        return date;
    }

    public Time getHeure() {
        return heure;
    }

    public int getnbrPlace() {
        return nbrPlace;
    }

    public Date setDat(Date d) {
        return date = d;
    }

    public Time setHeure(Time t) {
        return heure = t;
    }

    public int setNbrPlace(int p) {
        return nbrPlace = p;
    }

    public void ajouteMenu(Menu m){
        this.listeMenu.add(m);
    }

    public void ajouteEnfant(Enfant e){
        this.listeEnfants.add(e);
    }
}