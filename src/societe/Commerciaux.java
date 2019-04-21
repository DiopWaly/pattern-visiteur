package societe;

import Interface.IElement;
import Interface.IVisiteur;

public class Commerciaux implements IElement {
    private float prixvent;
	public float getPrixvent() {
		return prixvent;
	}

	public void setPrixvent(float prixvent) {
		this.prixvent = prixvent;
	}

	public Commerciaux(float prixvent) {
		this.prixvent = prixvent;
	}

	@Override
	public void valide(IVisiteur v) {
        v.salaireCommerciaux(this);
	}

}
