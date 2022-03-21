package model ;

import java.util.ArrayList;

public class Parent extends Personne {

	ArrayList<Enfant> enfants = new ArrayList<Enfant>();


	public Parent(String n, String p, String s, String d) {
		super(n, p, s, d);
	}

    public boolean ajouterE(Parent p1, Parent p2, String n, String p, String s, String d){
		
		Enfant e = new Enfant(p1, p2, n, p, s, d);
		
		if (!this.enfants.contains(e)) {
			return this.enfants.add(e);
		} else {
			return false;
		}
    }

	public boolean supprimerE(Enfant e){ // J'ai des doutes pour cette méthode
		
		if(this.enfants.contains(e)){
			return this.enfants.remove(e);
		} else {
			return false;
		}
	}

    public void inscrire(){

    }

	public void choisirSession(){
		
	}
}