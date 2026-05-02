package TP7;
import java.util.Scanner;
public class partie2 {
	//5
	public double lireMontant(String valeur) {
		try {
	        double montant = Double.parseDouble(valeur);
	        
	        if (montant<0) {
	            throw new IllegalArgumentException("montant negatif ");
		}
	        return  montant;
	}catch(NumberFormatException  e) {
        System.out.println("valeur non numerique");
    	return 0;
	}	
	}	
	public static void main(String[] args) {

        partie2 obj = new partie2();
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrer un montant : ");
        String valeur = sc.nextLine();

        double result = obj.lireMontant(valeur);

        System.out.println("Résultat = " + result);

        sc.close();
    }
	
}
