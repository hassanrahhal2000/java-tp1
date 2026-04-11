package TP4;
public class TestBanque {	
public static void main(String[] args) {
Compte comptes[]=new Compte[4];
comptes[0]=new CompteCourant("C001", "Hassan", 10000, 500);
comptes[1]=new CompteEpargne("B100", "Sara", 2000);
comptes[2]=new ComptePremium("P001", "Ali", 3000, 1000);
comptes[3]=new CompteCourant("E031", "Karim",1000, 200);
for(int i=0;i<comptes.length;i++) {
	comptes[i].deposer(400);
	comptes[i].retirer(200);
	comptes[i].afficher();
    System.out.println("-----------");
}
//affichier uniquement les comptesEpargne
System.out.println("les comptesEpargne: ");
for( Compte c:comptes) {
	if(c instanceof CompteEpargne) {
		c.afficher();
	}
}
//7
/*Compte c = new CompteEpargne("F001", "mohamed", 1000);
CompteCourant cc = (CompteCourant)c;*/
//CompteEpargne cannot be cast to class CompteCourant
/*
 le code non fonction pas  
 l'erreur: CompteEpargne cannot be cast to class CompteCourant
 pourqoui?
 - c contient un objet de type CompteEpargne 
 - tu essayes de le transformer en CompteCourant  donc impossible car CompteEpargne different CompteCourant
 -meme s’ils héritent de Compte, ce sont deux classes différentes
 */
}}
