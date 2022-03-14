package model;
import java.util.ArrayList;

public class Platvege extends Plat{

    ArrayList<Alimentveg> composants = new ArrayList<Alimentveg>();

    
    public Platvege(String n, String t) {
        super(n, t);
    }

  /*  public boolean ajouter(Alimentveg a){
        if(!composants.contains(a)){
            composants.add(a);
            return true;
        }
        else return false;
    }
*/
}






