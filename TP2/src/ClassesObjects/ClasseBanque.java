package ClassesObjects;

public class ClasseBanque {
	private String nom;
	private CompteBancaire comptes[];
	private int nbActuels;
	public ClasseBanque(String nom,int capacite) {
		this.nom=nom;
		comptes = new CompteBancaire[capacite];
		nbActuels =0;
	}
	public  void ajouterCompte(CompteBancaire c) {
		if(nbActuels < comptes.length) {
			comptes[nbActuels] = c;
			nbActuels++;
		}else {
			System.out.println("Banque Pleine ! ");
		}	
	}
	public void afficerTous() {
		for(int i=0;i< nbActuels;i++) {
		comptes[i].afficher();
			
		}
	}

}
