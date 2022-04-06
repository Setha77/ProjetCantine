package model;

//import java.util.ArrayList;


public class Aliments {

String nomAlim;
String allergene;

public Aliments (String nomAlim, String allergene){
    this.nomAlim = nomAlim;
    this.allergene = allergene;
}


public String getNomAlim(){
    return nomAlim;
}

public String getAllergene(){
    return allergene;
}



}


