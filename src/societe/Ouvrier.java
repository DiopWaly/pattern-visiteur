package societe;

import Interface.IElement;
import Interface.IVisiteur;

public class Ouvrier implements IElement {

	private float salairehoraire;
	private int nbreheure;

	public float getSalairehoraire() {
		return salairehoraire;
	}

	public void setSalairehoraire(float salairehoraire) {
		this.salairehoraire = salairehoraire;
	}

	public int getNbreheure() {
		return nbreheure;
	}

	public void setNbreheure(int nbreheure) {
		this.nbreheure = nbreheure;
	}

	public Ouvrier(float salairehoraire, int nbreheure) {
		super();
		this.salairehoraire = salairehoraire;
		this.nbreheure = nbreheure;
	}

	@Override
	public void valide(IVisiteur v) {
		v.salaireOuvrier(this);
		
	}

}
