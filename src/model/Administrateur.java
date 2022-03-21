package model;

import java.util.ArrayList;

public class Administrateur extends Personne {
	
	// à copier dans cantine ( mettre les arraylist en haut )
	Cantine c;
	ArrayList<Menu> menus = new ArrayList<Menu>();
	ArrayList<Session> session = new ArrayList<Session>();

	public Administrateur(String n, String p, String s, String d) {
		super(n, p, s, d);
		c = new Cantine(this);
	}

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
	
}