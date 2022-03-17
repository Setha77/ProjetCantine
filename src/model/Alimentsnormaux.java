package model;

public class Alimentsnormaux extends Aliments {

	public Alimentsnormaux(String nomAlim, String allergene) {
		super(nomAlim, allergene);
	
	}

	public Alimentveg creerAlimentnormal(String nomAlim, String allergene){
		return new Alimentveg(nomAlim, allergene);
	}
  
}
