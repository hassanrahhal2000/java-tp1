package partie4;
import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Veuillez saisir une chaîne de caractères :");
        String s = sc.nextLine();  
        System.out.println("la longuer de la chaine est  : " + s.length());
    }
}