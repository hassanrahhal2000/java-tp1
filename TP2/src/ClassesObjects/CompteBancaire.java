package ClassesObjects;
public class CompteBancaire {
private int numero;
private String titulaire;
private double solde; 
private  double decouvertAutorise;
static int nbComptes =0;
static double tauxInteret = 0.03;

public CompteBancaire() {
	nbComptes ++;
	this.numero =nbComptes;
	this.solde=0;
	this.titulaire=null;
	this.decouvertAutorise =0;	
}
public CompteBancaire(String titulaire, double  solde,double decouvertAutorise ) {
	nbComptes ++;
	this.numero =nbComptes;
	this.titulaire=titulaire;
	this.solde=solde;
	this.decouvertAutorise =decouvertAutorise;
}
public String getTitulaire() {
	return titulaire;
}
public void setTitulaire(String titulaire) {
    if (titulaire != null && !titulaire.isEmpty()) {
        this.titulaire = titulaire;
    }
}
public void setAutorise(double d) {
    if (d>= 0) {
        this.decouvertAutorise= d;
    }
}
public void afficher() {
	System.out.println("Compte N°:"+numero);
	System.out.println("Titulaire:"+titulaire);
	System.out.println("solde:"+solde);
	System.out.println("Decouvert autorise :"+decouvertAutorise);
	System.out.println("----------------------------------");	
}
public void deposer(double montant) {
	if(montant>0) {
		solde+=montant;
	}else {
		System.out.println("Montant de depot invalide");
	}
}
public void retirer(double montant) {
	if(montant >0 && solde - montant > -  decouvertAutorise) {
		solde-= montant;
	}else {
		System.out.println("Retrait refuse");
	}
}
public void virmentVers(CompteBancaire autre ,double montant) {
	if(montant >0 && solde - montant > -  decouvertAutorise) {
		this.retirer(montant);
		autre.deposer(montant);
	}else {
		System.out.println("Virment impossible :montant ou solde insuffisant");
	}
}
public double calculerSoldeAvecInterets() {
	solde = solde + solde*tauxInteret;	
	return solde ;
}
public double calculerSoldeAvecInterets(double bonus) {
	solde = solde + solde*(tauxInteret+ bonus);	
	return solde ;
}

public static int getNbComptes() {
	return nbComptes;
}
public static  double getTauxInteretAnnuel(){
	return tauxInteret;
}
public static void setTauxInteretAnnuel(double taux) {
	tauxInteret=taux;
}











}








 




