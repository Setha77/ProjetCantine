package model;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Plat{

    ArrayList<Aliments> composants = new ArrayList<Aliments>();


    String nomPlat;
    String type; // Entrée ou repas ou déssert
    
   
    public Plat(String n, String t){
        this.nomPlat=n;
        this.type=t;
    }


     public boolean ajouterAliment(Aliments n){
        if(!this.composants.contains(n)){
            return this.composants.add(n);
            //return true;
        } else {
            return false;
        }
       
    }

    public boolean supprimerAliment(Aliments a){
        if(this.composants.contains(a)){
            return this.composants.remove(a);
        } else {
            return false;
        }
    }

    

}