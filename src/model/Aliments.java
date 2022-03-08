package model;

import java.util.ArrayList;

public class Aliments {

ArrayList Alim = new ArrayList();  
String nomAlim;
String allergene;
int quantite;

public Aliments (String nomAlim, String allergene, int quantite){
this.nomAlim = nomAlim;
this.allergene = allergene;
this.quantite = quantite;
}

public enum AlimType {  
    FRUIT, LEGUME, VIANDE , POISSON , FRUITDEMER, PRODUITLAITIER , FECULENT
}

public String getNomAlim(){
return nomAlim;
}

public String getAllergene(){
    return allergene;
}

public int getQuantite(){
    return quantite;
}

}