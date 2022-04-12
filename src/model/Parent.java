package model ;

import java.util.ArrayList;

public class Parent extends Personne {

	ArrayList<Enfant> enfants = new ArrayList<Enfant>();
	String login;
	String motdepasse;
	int PARENT_ID;
	
	public Parent(String n, String p, String s, String d, String l, String mdp) {
		super(n, p, s, d);
		this.login=l;
		this.motdepasse=mdp;
	}

    public boolean ajouterE(Parent p, Parent m, String n, String pr, String s, String d){
		
		Enfant e = new Enfant(p, m, n, pr, s, d);
		
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

    public boolean inscrire(Session s, Enfant e){
		if(!s.listeEnfants.contains(e) && s.listeEnfants.size()<s.nbrPlace && this.enfants.contains(e)){
			s.listeEnfants.add(e);
			return true;
		}
		else{
			if(s.listeEnfants.contains(e)){
				System.out.println("Cet enfant est déja inscris pour cette session");
				return false;
			}
			if(s.listeEnfants.size()==s.nbrPlace){
				System.out.println("Malheureusement, il n'y a plus de place pour cette session");
				return false;
			}
			if(!this.enfants.contains(e)){
				System.out.println("Cet enfant n'est pas trouvable dans vos enfants");
				return false;
			}
		}
		return false;
    }

	public void choisirSession(){
		
	}
}