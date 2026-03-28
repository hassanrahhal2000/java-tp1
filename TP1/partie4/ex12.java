package partie4;
import java.util.Scanner;
public class ex12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Saisir une chaîne : ");
        String s = sc.nextLine().toLowerCase();
        int compteur = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiouy".indexOf(c) != -1) {
                compteur++;
            }
        }
        System.out.println("Nombre de voyelles : " + compteur);
	}}


