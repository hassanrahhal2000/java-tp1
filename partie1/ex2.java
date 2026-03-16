package partie1.TPJAVA;
import java .util.Scanner;
public class ex2 {

public static void main(String[] args) {
System.out.println("entrz trois numbres  :");
Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();
   if (a>b && a>c) {
	   System.out.println(a +" est le plus grand");
   }else if (b>a && b>c) {
	   System.out.println(b +" est le plus grand");
   }else if(c>a && c>b) {
	   System.out.println(c +" est le plus grand");
   }
	}

}
