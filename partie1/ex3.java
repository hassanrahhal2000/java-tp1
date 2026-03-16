package partie1.TPJAVA;
import java.util.Scanner;
public class ex3 {

	public static void main(String[] args) {
		System.out.println("entrez un numbre  :");
	Scanner sc = new  Scanner(System.in)	;
	int i;
	int a =sc.nextInt();
	System.out.println("la table  de multiplication de "+a+" est :");
	for( i=1 ;i<=10;i++ ) {
		System.out.println(a+"*"+i+" = "+a*i);
	}

	}

}
