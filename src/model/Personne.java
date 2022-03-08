package model;
import java.util.*;

public class Personne {
    String nom;
    String prenom;
    String sexe;
    Date dateNaissance; //Voir date apres

    //CONSTRUCTEUR

    public Personne(String n, String p, String s, Date d){
        this.nom = n;
        this.prenom = p;
        this.sexe = s;
        this.dateNaissance= d;
    }

    //GUETTEURS 

    public String GetNom(){
        return this.nom;
    }

    public String GetPrenom(){
        return this.prenom;
    }

    public String GetSexe(){
        return this.sexe;
    }
    
    public Date GetDateNaissance(){
        return this.dateNaissance;
    }

}
