package partie_2;
import java.util.LinkedList;
import partie_1.Etudiant;
public class gestion_client {
	public static void main(String[] args) {
		//1
		LinkedList<client>ld= new LinkedList<>();
		ld.add(new client (13,"kamal"));
		ld.add(new client (21,"ali"));
		ld.add(new client (34,"sofian"));
		ld.add(new client (49,"mohamed"));
		ld.add(new client (85,"omar"));
		//2
		for(client e : ld){
	        System.out.println(e);
	    }
		System.out.println(".....................................");
        //3 servir le premier 
		ld.removeFirst();
		for(client e : ld){
	        System.out.println(e);
	    }
		System.out.println(".....................................");	
		//4
		ld.addLast(new client(90, "younes"));System.out.println(ld.peek());
		for(client e : ld){
	        System.out.println(e);
	    }
		//5
		System.out.println(".....................................");	
		System.out.println("client en tete de file:"+ld.peek());
	}}

