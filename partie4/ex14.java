package partie4;
import java.util.Scanner;
public class ex14 {
	public static void main(String[] args) {	
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Saisir une chaîne : ");
		  String s = sc.nextLine().toLowerCase().replaceAll("\\s", "");
		   String reversed = new StringBuilder(s).reverse().toString();
		   if (s.equals(reversed))
		       System.out.println("La chaîne est un palindrome");
		   else
		       System.out.println("La chaîne n'est pas un palindrome");
		    }}
		

	


