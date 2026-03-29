package ClassesObjects;

public class TestBanque {

	public static void main(String[] args) {
  ClasseBanque b = new  ClasseBanque("MarocBank",1500) ;
  CompteBancaire c1= new CompteBancaire("hassan",1000,500);
  CompteBancaire c2= new CompteBancaire("imane",2000,300);
  CompteBancaire c3= new CompteBancaire("sara",1500,400);
  b.ajouterCompte(c1);
  b.ajouterCompte(c2);
  b.ajouterCompte(c3);
  c1.deposer(500);
  c1.retirer(1200);
  c2.virmentVers(c3, 300);
  b.afficerTous();
    System.out.println("solde de ce avec intret :"+c2.calculerSoldeAvecInterets());
    System.out.println("solde de ce avec bonus  :"+c2.calculerSoldeAvecInterets(0.015));
    System.out.println("nombre total de  compte  :"+CompteBancaire.getNbComptes());
    System.out.println("tuax interet  :"+CompteBancaire.getTauxInteretAnnuel());


	}

}
