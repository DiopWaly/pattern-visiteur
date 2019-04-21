package societe;

import Interface.IElement;
import Interface.IVisiteur;

public class Directeur implements IElement {
 
	private float salairebase;
	private float indice;
	private float bonnus;
	
	public float getSalairebase() {
		return salairebase;
	}

	public void setSalairebase(float salairebase) {
		this.salairebase = salairebase;
	}

	public float getIndice() {
		return indice;
	}

	public void setIndice(float indice) {
		this.indice = indice;
	}

	public float getBonnus() {
		return bonnus;
	}

	public void setBonnus(float bonnus) {
		this.bonnus = bonnus;
	}

	public Directeur(float indice, float salairebase, float bonnus) {
		super();
		this.salairebase = salairebase;
		this.indice = indice;
		this.bonnus = bonnus;
	}

	@Override
	public void valide(IVisiteur v) {
		v.salaireDirecteur(this);	
	}

}
