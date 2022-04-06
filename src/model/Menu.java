package model;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Menu {

    Plat entree;
    Plat repas;
    Plat dessert;
    ArrayList<String> listeAllergenes = new ArrayList<String>();

    public Menu( Plat e, Plat r, Plat d){
        this.entree = e;
        this.repas = r;
        this.dessert = d;

    }
 
    public Plat GetEntree(){
        return this.entree;
    }

    public Plat GetRepas(){
        return this.repas;
    }

    public Plat GetDessert(){
        return this.dessert;
    }


    public boolean SetEntree(Plat e){
        if(e.type!="Entree" || this.entree == e){
            return false;
        } else {
            this.entree=e;
        }
         return true;
    }

    public boolean SetRepas(Plat r){
        if(r.type!="Repas"|| this.repas == r){
                return false;
            }
            else {
            this.repas=r;
            }
        return true;
    }
    

    public boolean SetDessert(Plat d){
        if(d.type !="Dessert" || this.dessert == d){
           return false;
        } else {
            this.dessert = d;
            return true;
        }
        
    }

    public void getAllergenes(){
        for(int i = 0; i < this.entree.composants.size() ; i++){
            if(this.entree.composants.get(i).allergene!="aucun"){
                listeAllergenes.add(entree.composants.get(i).allergene);           
            }
        }
        for(int i = 0; i < this.repas.composants.size() ; i++){
            if(this.repas.composants.get(i).allergene!="aucun"){
                listeAllergenes.add(this.repas.composants.get(i).allergene);           
            }
        }
        for(int i = 0; i < this.dessert.composants.size() ; i++){
            if(this.dessert.composants.get(i).allergene!="aucun"){
                listeAllergenes.add(this.dessert.composants.get(i).allergene);           
            }
        }
        

    }

   /* public boolean addSession(Session session){
        if (this.session == session) {
            return false;
        } else {
            this.session = session;
            return true;
        }
    }*/
    
}
