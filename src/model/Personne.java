package model;
import java.util.*;

public class Personne {
    String nom;
    String prenom;
    String sexe;
    String dateNaissance; //Voir date apres

    //CONSTRUCTEUR

    public Personne(String n, String p, String s, String d){
        this.nom = n;
        this.prenom = p;
        this.sexe = s;
        this.dateNaissance= d;
    }

    //GUETTERS 

    public String GetNom(){
        return this.nom;
    }

    public String GetPrenom(){
        return this.prenom;
    }

    public String GetSexe(){
        return this.sexe;
    }
    
    public String GetDateNaissance(){
        return this.dateNaissance;
    }

}
