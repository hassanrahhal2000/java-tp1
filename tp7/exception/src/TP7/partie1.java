package TP7;

public class partie1 {
     //1
	public  static double effectuerPaiement(double montant, double solde) {
		if(montant <= 0) {
			throw new IllegalArgumentException("Montant invalide");
		}
		if(montant > solde ) {
			throw new IllegalArgumentException("solde insuffisnt");
		}
		return solde- montant;
	}
	
	
public static void main(String[] args) {
		//2
     try {
    	 double  nouveauSolde = effectuerPaiement(30,100);
         System.out.println("Nouveau solde: " + nouveauSolde);
     }catch (IllegalArgumentException e) {
    	 System.out.println("    error montant invalide ");
     }
     catch (ArithmeticException e) {
         System.out.println("Erreur: solde insuffisant");
     }
     //3
     finally {
    	    System.out.println("Fin de la transaction");
    	}		
	}
}
