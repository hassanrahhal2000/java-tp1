package tp3;

public class Voiture extends Vehicule {
	private int nbPortes;
	public Voiture (String matricule ,String marque) {
		super(matricule,marque);
		nbPortes=4;
	}
	public void  stationner() {
		 System.out.println(" La voiture  se gare  dans une place standard");
	}
	 public void affichier() {
		 super.affichier();
		 System.out.println(" le nombre de portes = "+nbPortes);
		 System.out.println(" ..................................................................");

	 }
	 
}
