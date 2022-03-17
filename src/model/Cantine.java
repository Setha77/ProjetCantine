package model;

import java.util.ArrayList;

public class Cantine{

    ArrayList<Aliments> aliments = new ArrayList<Aliments>();
    ArrayList<Alimentveg> alimentsveg = new ArrayList<Alimentveg>();

    ArrayList<Platvege> platsvege = new ArrayList<Platvege>();
    ArrayList<Plat> plats = new ArrayList<Plat>();


    //méthodes

      public Aliments GetAlimentByName(String nom){
    
		for (int i = 0; i < aliments.size(); i++) {
			if(aliments.get(i).nomAlim==nom) {
				return aliments.get(i);
			}
        }
        return(null);
        
	}

    public  Alimentveg GetAlimentvegByName(String nom){
        
		for (int i = 0; i < alimentsveg.size(); i++) {
			if(alimentsveg.get(i).nomAlim==nom) {
				return alimentsveg.get(i);
			}
        }
        //Aucun aliment sous ce nom trouvé
        return(null);
        
	}


  
    public Plat GetPlatByName(String nom){
        for (int i = 0; i < plats.size(); i++) {
			if(plats.get(i).nomPlat==nom) {
				return plats.get(i);
			}
        }
        return(null);
    }

    public Plat GetPlatvegByName(String nom){
        for (int i = 0; i < platsvege.size(); i++) {
			if(platsvege.get(i).nomPlat==nom) {
				return platsvege.get(i);
			}
        }
        return(null);
    }



    public boolean creerAlimentveg(String n, String allergene){
      
        if(alimentsveg.contains(GetAlimentByName(n))){
            System.out.println("Il est deja dans la liste enfaite zebi t'es gros ");
            return false;
        }
        alimentsveg.add(new Alimentveg(n,allergene));
        aliments.add(new Alimentveg(n,allergene));
        return true;
    }

     public boolean creerAliment(String n, String allergene){
        
        if(aliments.contains(GetAlimentByName(n))){
            System.out.println("Il est deja dans la liste enfaite zebi t'es gros ");
            return false;
        }
        
        aliments.add(new Alimentsnormaux(n,allergene));
        return true ;
    }

    public boolean creerPlatvege(String n, String t){
        if(platsvege.contains(GetPlatByName(n))){
            System.out.println("Il est deja dans la liste enfaite zebi t'es gros ");
            return false;
        }
    
    platsvege.add(new Platvege(n,t));
        plats.add(new Platvege(n,t));
        return true;
    }


    public boolean creerPlatnormal(String n, String t){
        if(plats.contains(GetPlatByName(n))){
            System.out.println("Il est deja dans la liste enfaite zebi t'es gros ");
            return false;
        }
    
        plats.add(new Platnormal(n,t));
        return true;
    }

    

   
    public boolean addComposant(String plat, String aliment){    
        if(GetPlatByName(plat).composants.contains(GetAlimentByName(aliment))){
            System.out.println("Il est deja dans la liste enfaite zebi t'es gros ");
            return false;
        }
        if(aliments.contains(GetAlimentByName(aliment))){
            GetPlatByName(plat).ajouterAliment(GetAlimentByName(aliment));
        return true;
        }

        
        else{
        System.out.println("Cet aliment n'existe pas ou n'est pas disponible gros : "+ aliment);
        return false;
        }
    }


    /*public void creerPlatvege(String n, String t){
        Platvege p = new Platvege(n, t);
        String x=null;
        String encore="oui";
        while( encore=="oui"){
        if(alimentsveg.contains(GetAlimentvegByName(x))&&!p.composants.contains(GetAlimentvegByName(x))){
              p.composants.add(GetAlimentvegByName(x));
        }

        platsvege.add(p);
      
        }
    }

*/
}