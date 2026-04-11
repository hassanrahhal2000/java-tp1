package TP4;
public class CompteEpargne  extends Compte{
	private double tauInteret;
public CompteEpargne(String numero,String titulaire,double solde) {
		super(numero,titulaire,solde);
		this.tauInteret = 6;
}
public double calculerInteret() {
	double solde = 0;
	 solde +=  solde*tauInteret;
	return solde;
}
public void retier( double montant) {
 if(montant<=0 ||montant> solde*tauInteret) {
		System.out.println("interdit le retrait si le solde est insuffisant ");
		return;
 }
 else {
	 solde -=montant;
 }
}
}
