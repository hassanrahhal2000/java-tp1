package TP7;

public class partie4 {
	//12
	public static double lireTransaction(double[] tab, int i) {
	    return tab[i];
	}
	public static void main(String[] args) {
		//13
		  try {
		       double[] tab = {10.0, 20.0,87.9,90.0,576.8};
		        double vl = lireTransaction(tab, 9);
		           System.out.println("Valeur : " + vl);
		    } catch (ArrayIndexOutOfBoundsException e) {
		        System.out.println("Erreur : index invalide");
		     } catch (NullPointerException e) {
		            System.out.println("Erreur : tableau non initialisé");
		    }
	}}


