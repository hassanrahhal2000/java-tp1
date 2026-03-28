package partie4;
import java.util.Scanner;
public class ex13 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in)	;
	 System.out.print("Saisir une chaîne : ");
	 String s = sc.nextLine();
	 String sInverse = "";
	 for (int i = s.length() - 1; i >= 0; i--) {
		    sInverse += s.charAt(i);
		}
     System.out.println("la chaine renverse est   : " + sInverse);
	}}


