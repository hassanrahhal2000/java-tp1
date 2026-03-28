package partie3;
import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] M = new int[3][3]; 
        int i, j;      
        System.out.println("Saisir les éléments de la matrice 3x3 :");
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = sc.nextInt();
            }}      
        System.out.println("La matrice saisie est :");
        for(i = 0; i < 3; i++) {
            for(j = 0; j < 3; j++) {
                System.out.print(M[i][j] + " ");
            }
            System.out.println();
        }}}

    

