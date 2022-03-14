package model ;

import java.util.ArrayList;

public class Parent extends Personne {

	 ArrayList<Enfant> enfants = new ArrayList<Enfant>();


	public Parent(String n, String p, String s, String d) {
		super(n, p, s, d);
		
	}

    public void ajouterE(Parent p1, Parent p2, String n, String p, String s, String d){

		
		enfants.add(new Enfant(p1, p2, n, p, s, d));
		

    }

    public void inscrire(){

    }

	public void choisirSession(){
		
	}
}