package tp3;

public class Camion extends Vehicule  {
	private double chargeMax;
	public Camion(String matricule, String marque, double chargeMax) {
		super(matricule, marque);
     this.chargeMax =  chargeMax;
	}
	public void stationner() {
		 System.out.println(" Le Camion se gare dans une zone pour vehicules lourds");
	}
	public void affichier() {
		super.affichier();
		 System.out.println( " La chargeMax de camion  est : "+ chargeMax);
		 System.out.println(" ..................................................................");

	}		
}
