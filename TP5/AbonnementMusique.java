package TP5;

public class AbonnementMusique extends Abonnement implements Reducible{
	protected int  nbPlaylists;
	protected  boolean optionOffline;
	public AbonnementMusique(String nom , double prixBase, int nbProfils,int  nbPlaylists,boolean optionOffline) {
		super(nom,prixBase,nbProfils);
		this.nbPlaylists=nbPlaylists;
		this.optionOffline=optionOffline;
	}
	public double calculerCoutMensuel() {
		double coutTotal= getPrixBase();
		if(optionOffline==true) {
			coutTotal += 15;
		}
	  return coutTotal;		
	}

	public int calculerScoreSatisfaction() {
		int score=50;
		if(nbPlaylists>20) {
			score += 20;
		}
		if(optionOffline==true) {
			score += 20;
		}
		if(getNbProfils()>=1) {
			score += 10;
		}
		if(score>100) {
			score=100;
		}
		return score;
	}
	public boolean EstEligibleReduction(double pourcentage) {	
		   return pourcentage<=30;
		}

	public double AppliquerReduction(double pourcentage) {
		if(!EstEligibleReduction(pourcentage)) {
			System.out.println("Reduction non acceptable");
			return calculerCoutMensuel();
		}
	    double coutTotal = calculerCoutMensuel();
	    coutTotal -= (coutTotal * 30) / 100;
	    return coutTotal;
	}

}
