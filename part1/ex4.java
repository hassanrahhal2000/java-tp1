package partie1.TPJAVA;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
	System.out.print("entrez un numbre :");
	Scanner sc = new Scanner (System.in);
	int a=sc.nextInt();
	int i=0;int s=0;
	while (i<=a) {
		s= s+i;
		i++;
	}
	
	System.out.println("la somme est :"+s);
	}

}
