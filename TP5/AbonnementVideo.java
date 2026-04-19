package TP5;

public class AbonnementVideo extends  Abonnement implements Reducible {
	protected  boolean optionHD;
	protected  boolean option4K;
	public AbonnementVideo(String nom,double prixBase,int nbProfils,boolean optionHD, boolean option4K) {
		super(nom,prixBase,nbProfils);
		this.optionHD=optionHD;
		this.option4K=option4K;
	}
public  double  calculerCoutMensuel() {
	double coutTotal= getPrixBase();
	if(optionHD==true) {
		coutTotal += 10;
	}
	if(option4K==true) {
		coutTotal += 20;
	}
	
  return coutTotal;
}
public  int calculerScoreSatisfaction() {
	int score=60;
	if(optionHD==true) {
		score += 10;
	}
	if(option4K==true) {
		score  += 20;
	}
	if(getNbProfils()>=4) {
		score  += 10;

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
