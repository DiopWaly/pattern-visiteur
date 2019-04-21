import Interface.IVisiteur;
import societe.*;

public class Teste {

	public static void main(String[] args) {
		Directeur directeur = new Directeur(3.5f, 100000, 50000);
		Managere man = new Managere(3.5f, 100000, 20000, 30000);
		Commerciaux com = new Commerciaux(250000);
		Ouvrier ouv = new Ouvrier(36, 5000);
		ConcretVisiteur v = new ConcretVisiteur();
		directeur.valide(v);
		System.out.println("Salaire du directeur : "+v.getSalaires());
		man.valide(v);
		System.out.println("Salaire managere : "+v.getSalaires());
		com.valide(v);
		System.out.println("Salaire commercial : "+v.getSalaires());
		ouv.valide(v);
		System.out.println("Salaire ouvrier : "+v.getSalaires());

	}

}
