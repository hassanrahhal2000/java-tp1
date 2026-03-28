package partie3;
import java.util.Scanner;
public class ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	     int i,j;
	     int[][]T = new int[3][3];
	     int[][]M = new int[3][3];
	     System.out.println("Saisir les éléments de la matrice 3x3 :");
	     for(i=0;i<3;i++) {
	    	 for(j=0;j<3;j++) {
	             System.out.print("M[" + i + "][" + j + "] = ");    		 
	    		 M[i][j]= sc.nextInt();
	    	 }}	     
	     for(i=0;i<3;i++) {
	    	 for(j=0;j<3;j++) {
	    	T[j][i]	= M[i][j] ;
	    	 }
	     }
	     System.out.println("La matrice transpose est :");
	     for(i=0;i<3;i++) {
	    	 for(j=0;j<3;j++) {
	    		 System.out.print(T[i][j] + " ");
	    	 }
	    	 System.out.println();
	     }}}
	


