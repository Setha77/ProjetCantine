package model;

//import java.util.ArrayList;

public class Menu {

    Session session;
    private Plat entree;
    private Plat repas;
    private Plat dessert;

    public Menu(Plat e, Plat r, Plat d){
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

    public boolean addSession(Session session){
        if (this.session == session) {
            return false;
        } else {
            this.session = session;
            return true;
        }
    }
    
}
