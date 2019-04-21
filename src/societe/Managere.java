package societe;

import Interface.IElement;
import Interface.IVisiteur;

public class Managere implements IElement {

	private float indice;
	private float salairebase;
	private float prime;
	private float impot;
	
	public float getPrime() {
		return prime;
	}

	public void setPrime(float prime) {
		this.prime = prime;
	}

	public float getImpot() {
		return impot;
	}

	public float getIndice() {
		return indice;
	}

	public void setIndice(float indice) {
		this.indice = indice;
	}

	public float getSalairebase() {
		return salairebase;
	}

	public void setSalairebase(float salairebase) {
		this.salairebase = salairebase;
	}

	public void setImpot(float impot) {
		this.impot = impot;
	}

	public Managere(float indice, float salairebase, float prime, float impot) {
		this.indice = indice;
		this.salairebase = salairebase;
		this.prime = prime;
		this.impot = impot;
	}

	@Override
	public void valide(IVisiteur v) {
	   v.salaireManagere(this);
	}

}
