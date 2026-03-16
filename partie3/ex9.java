package partie3;
import java.util.Scanner;
public class ex9 {
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int i,j,s=0;
     int[][]M = new int[3][3];
     System.out.println("Saisir les éléments de la matrice 3x3 :");
     for(i=0;i<3;i++) {
    	 for(j=0;j<3;j++) { 
    		 System.out.print("M[" + i + "][" + j + "] = "); 
    		 M[i][j]= sc.nextInt();
    	 }}
     for(i=0;i<3;i++) {
    	 for(j=0;j<3;j++) {
    		s= s+M[i][j] ;
    	 }}     
     System.out.println("la somme des elements de matrice est :" +s);
}}
