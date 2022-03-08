package model;

public class Alimentveg extends Aliments {
    
public Alimentveg(String nomAlim, String allergene, int quantite){
    super(nomAlim,allergene,quantite);
    this.nomAlim = nomAlim;
    this.allergene = allergene;
    this.quantite = quantite;
    }
public boolean isveg(){
   return true;
}
}
    
