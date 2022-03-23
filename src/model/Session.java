package model;

//import java.sql.Date;
//import java.sql.Time;
import java.util.ArrayList;

public class Session {
    String date;
    String heure;
    int nbrPlace;
    Menu menunormal;
    Menu menuveg;
    ArrayList<Enfant> listeEnfants = new ArrayList<Enfant>();

    public Session(String date, String heure, int nbrPlace, Menu mn, Menu mv) {
        this.date = date;
        this.heure = heure;
        this.nbrPlace = nbrPlace;
        this.menunormal = mn;
        this.menuveg = mv;
    }

    public Menu GetMenunormal(){
        return this.menunormal;
    }

    public Menu GetMenuveg(){
        return this.menuveg;
    }
    
    public String getdDate() {
        return date;
    }

    public String getHeure() {
        return heure;
    }

    public int getnbrPlace() {
        return nbrPlace;
    }

    public String setDat(String d) {
        return date = d;
    }

    public String setHeure(String t) {
        return heure = t;
    }

    public int setNbrPlace(int p) {
        return nbrPlace = p;
    }

    public boolean ajouteEnfant(Enfant e){
        if (!(this.listeEnfants.contains(e))) {
            nbrPlace -= 1;
            return this.listeEnfants.add(e);
        } else {
            return false;
        }
    }

    public boolean supprimerEnfant(Enfant e){
        if(this.listeEnfants.contains(e)){
            nbrPlace += 1;
            return this.listeEnfants.remove(e);
        } else {
            return false;
        }
    }
}