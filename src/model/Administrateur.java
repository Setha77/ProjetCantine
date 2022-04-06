package model;

//import java.util.ArrayList;

public class Administrateur extends Personne {

	int login;
	String motdepasse;
	
	public Administrateur(String n, String p, String s, String d, int l, String mdp) {
		super(n, p, s, d);
		this.login = l;
		this.motdepasse = mdp;
	}


	

	/*	

	public boolean ajouterSession(Session s){
		if (!this.session.contains(s)) {
			return this.session.add(s);
		} else {
			return false;
		}
	}
	
	public boolean supprimerSession(Session s){
		if(this.session.contains(s)){
			return this.session.remove(s);
		} else {
			return false;
		}
	}

	*/
	
}