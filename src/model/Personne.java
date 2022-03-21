package model;
//import java.util.*;

public class Personne {
    protected String nom;
    protected String prenom;
    protected String sexe;
    protected String dateNaissance; //Voir date apres

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
    // Setters
    public boolean SetNom(String nom){
        if(this.nom == nom){
            return false;
        } else {
            this.nom = nom;
            return true;
        }
    }

    public boolean SetPrenom(String prenom){
        if(this.prenom == prenom){
            return false;
        } else {
            this.prenom = prenom;
            return true;
        }
    }

    public boolean SetDate(String date){
        if(this.dateNaissance == date){
            return false;
        } else {
            this.dateNaissance = date;
            return true;
        }
    }

    public boolean SetSexe(String sexe){
        if(this.sexe == sexe){
            return false;
        } else {
            this.sexe = sexe;
            return true;
        }
    }
}
