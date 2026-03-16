package partie2;

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        int n, i, PG;
        Scanner sc = new Scanner(System.in);

        System.out.print("Veuillez saisir la taille du tableau : ");
        n = sc.nextInt();

        int[] T = new int[n];

        for(i = 0; i < n; i++) {
            System.out.print("Saisir un entier : ");
            T[i] = sc.nextInt();
        }

        PG = T[0];

        for(i = 1; i < n; i++) {
            if(PG < T[i]) {
                PG = T[i];
            }
        }

        System.out.println("Le plus grand element du tableau est : " + PG);

    }
}