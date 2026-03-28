package partie2;
import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,x,m=-1;
		int[]T= new int[10];
        
		for (i=0;i<10;i++) {
			System.out.print("saisir un entier :");
			T[i]= sc.nextInt();
		}
		System.out.print("entre le nombre a rechercher :");
		x = sc.nextInt();		
		for (i =0;i<10 ;i++) {
			if (x==T[i]) {
				m=i;
			}
		}
		if(m != -1) {
            System.out.println("Le nombre existe dans la position : " + m);
        } else {
            System.out.println("Le nombre n'existe pas dans le tableau");
        }

		
}
	}
