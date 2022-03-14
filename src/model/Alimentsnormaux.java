package model;

public class Alimentsnormaux extends Aliments {

	public Alimentsnormaux(String nomAlim, String allergene) {
		super(nomAlim, allergene);
		aliments.add(this);
	}
}
