package model;

import java.util.ArrayList;

public class Cantine{

    ArrayList<Aliments> aliments = new ArrayList<Aliments>();
    ArrayList<Alimentveg> alimentsveg = new ArrayList<Alimentveg>();

    ArrayList<Platvege> platsvege = new ArrayList<Platvege>();
    ArrayList<Plat> plats = new ArrayList<Plat>();


    //méthodes

    public Alimentveg GetAlimentvegByName(String nom){
        
		for (int i = 0; i < alimentsveg.size(); i++) {
			if(alimentsveg.get(i).nomAlim==nom) {
				return alimentsveg.get(i);
			}
        }
        //Aucun aliment sous ce nom trouvé
        return(null);
        
	}


    public Aliments GetAlimentByName(String nom){
    
		for (int i = 0; i < alimentsveg.size(); i++) {
			if(aliments.get(i).nomAlim==nom) {
				return aliments.get(i);
			}
        }
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