package model;
//import java.util.ArrayList;

public class Enfant extends Personne {

    Parent pere, mere; 
  // homophobe
    public Enfant(Parent p, Parent m, String n, String pr , String s,String d) {
		super(n, pr, s, d);
        this.pere = p; 
        this.mere = m;
	}


    
    
    public boolean ajouterP(Parent p){
        if (p!=this.pere||p!=this.mere) {
            if(p.sexe=="homme"){
            this.pere=p;
            return true;
            }
            else{
            this.mere=p;
            return true;
            }       
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