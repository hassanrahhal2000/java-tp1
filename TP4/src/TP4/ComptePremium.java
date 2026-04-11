package TP4;
public class ComptePremium extends Compte {
 private double plafondRetrait;
 public ComptePremium(String numero,String titulaire,double solde , double plafondRetrait) {
	 super(numero,titulaire,solde);
	 this.plafondRetrait = plafondRetrait;
 }
 public void retier(double montant) {
	 if(montant<=0 || montant>plafondRetrait) {
		 System.out.println("interdit le retrait si le solde est insuffisant ");
	 }
 }
}
