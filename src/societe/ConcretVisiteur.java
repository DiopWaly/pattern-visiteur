package societe;

import Interface.IVisiteur;
import societe.*;

public class ConcretVisiteur implements IVisiteur {

	private float salaires;
	public ConcretVisiteur() {
		super();
		this.salaires = 0;
	}

	@Override
	public void salaireDirecteur(Directeur d) {
		this.setSalaires((
				   d.getIndice()*d.getSalairebase()
				   + d.getBonnus()
				));
	}

	@Override
	public void salaireManagere(Managere m) {
		this.setSalaires((
				   m.getIndice()*m.getSalairebase()
				   + m.getPrime()-m.getImpot()
				));
	}

	public float getSalaires() {
		return salaires;
	}

	public void setSalaires(float salaires) {
		this.salaires = salaires;
	}

	@Override
	public void salaireOuvrier(Ouvrier o) {
		this.setSalaires((
				  o.getNbreheure()*o.getSalairehoraire() + 5000
				));

	}

	@Override
	public void salaireCommerciaux(Commerciaux c) {
		this.setSalaires((
				  c.getPrixvent() + 10000
				));
	}

}
