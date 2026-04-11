package TP4;
public class CompteCourant extends Compte {
	private double decouvertAutorise;
public CompteCourant(String numero,String titulaire,double solde,double decouvertAutorise) {
		super(numero,titulaire,solde);
		this.decouvertAutorise = decouvertAutorise;
	}
public void retirer ( double montant ) {	
	 if ( montant <= 0 || montant > solde + decouvertAutorise ) {	      
	       System.out.println (" Retrait refuse ") ;
	       return ;
	   }
	 solde -= montant ;
	}
public void afficher(){
  super.afficher();
  System.out.println("Auriser un solde negatif dans la limite du decouvert:"+decouvertAutorise);
    }
}
