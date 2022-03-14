package model;
import java.util.ArrayList;

public class Platnormal extends Plat{

    ArrayList<Aliments> composants = new ArrayList<Aliments>();

    public Platnormal(String n, String t) {
        super(n, t);
      
    }


    public boolean ajouter(Aliments a){
        if(!composants.contains(a)){
            composants.add(a);
            return true;
        }
        else return false;
    }


}
