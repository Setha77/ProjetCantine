package model;
import java.util.ArrayList;

public class Enfant extends Personne {

    Parent parent1, parent2;
     

    ArrayList<Parent> Parents = new ArrayList<Parent>();/* pourquoi utiliser ArrayList pour stocker
                                                           les parents de l'enfant alors qu'on utilise deux variables parents ?*/
  
    public Enfant(Parent p1, Parent p2, String n, String p, String s,String d) {
		super(n, p, s, d);
        this.parent1 = p1;
        this.parent2 = p2;
	}



    public boolean ajouterP(Parent p){
        if (!(this.Parents.contains(p))) {
            return Parents.add(p);
        } else {
            return false;
        }
    }
    
	public String GetNomE(){
        return this.nom;
    }

    public String GetPrenomE(){
        return this.prenom;
    }

    public String GetSexeE(){
        return this.sexe;
    }
    
    public String GetDNE(){
        return this.dateNaissance;
    }

    public String setNomE (String n){
		return nom = n;
        
    }
    public String setPrenomE (String p){
        return prenom = p;
    }

    public String setSexeE (String s){
        return sexe = s;
    }

    public String setDate (String d){
        return dateNaissance = d;
    }

}