package tp3;

public class Moto extends Vehicule {
private boolean avecCasque;
	public Moto(String matricule, String marque,boolean avecCasque) {
		super(matricule, marque);
		this.avecCasque = avecCasque;
		
	}
	public void stationner() {
		 System.out.println( " La moto se gare dans  une place reservee aux deux-roues");
		
	}

	 public void affichier() {
		 super.affichier();
		 System.out.println("le moto avec Casque : "+ avecCasque);
		 System.out.println(" ..................................................................");

	 }
	 
}
