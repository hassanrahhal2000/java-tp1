package partie1.TPJAVA;
import  java.util.Scanner;
public class exe1 {
   public static void main(String [] args) {
	 System.out.println("entrez un nombre :");
	 Scanner sc = new Scanner(System.in);
	 int a = sc.nextInt();
	 if (a==0) {
		 System.out.println(a+"est un nombre null ");	 
	 }else if(a>0) {
		 System.out.println(a+"est un nombre positif ");
	 }else if(a<0) {
		 System.out.println(a+"est un nombre negatif ");
	 }
}
}