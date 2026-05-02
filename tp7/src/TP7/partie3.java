package TP7;

public class partie3 {
	//7
	public static double lireMontant(String valeur) 
	        throws NumberFormatException, IllegalArgumentException {
	       double montant = Double.parseDouble(valeur);
	    if (montant < 0) {
	        throw new IllegalArgumentException("montant negatif");
            }
	    return montant;
}
	
public static void main(String[] args) {
	//8
	    try {
	        double M = lireMontant("-788");
	        System.out.println("Montant : " + M);

	    } catch (NumberFormatException e) {
	        System.out.println("Erreur : format invalide");

	    } catch (IllegalArgumentException e) {
	        System.out.println("Erreur : montant négatif");
	    }
	}
}
