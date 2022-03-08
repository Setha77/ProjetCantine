package model;

public class Platvege extends Plat{
    String nomPlatvege;
    //Je mettrais type de plat en attribut de plat 


    public Platvege(String n){
        this.nomPlatvege = n;
    }
    
    public String GetNomPlatvege(){
        return this.nomPlatvege;
    }

    // je mettrais les SetEntrée ,SetRepas, SetDessert comme méthods dans le Menu
}
