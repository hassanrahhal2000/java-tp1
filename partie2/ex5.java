package partie2;
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		 int n ,i;
	 Scanner sc = new Scanner (System.in);
	 System.out.print("veillez saisir la taille de tableau :");
	 n = sc.nextInt();
	 int []T = new int[n];
	 for(i=0; i< n;i++) {
		 System.out.print("Saisir un entier : ");
         T[i] = sc.nextInt(); 
	 }
	 System.out.println("Les elements du tableau sont :");

     for(i = 0; i < n; i++) {
         System.out.print(T[i] + " | ");
	}
      

}}
