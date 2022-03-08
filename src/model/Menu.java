package model;

public class Menu {
    Plat entree;
    Plat repas;
    Plat dessert;

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


}
