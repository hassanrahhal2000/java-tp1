package partie_4;
import java.util.*;
public class notes {
	public static void main(String[] args) {
		//1
	HashMap<String,Double> notes=new HashMap<>();
	//2
	notes.put("imane",14.75);
	notes.put("mohssin", 19.75);
	notes.put("kamal", 10.50);
	notes.put("ismail", 17.5);
	notes.put("ahmed", 18.5);	
	//3	
	for (String key : notes.keySet()) {
	    System.out.println(key + " : " + notes.get(key));
	}
	//4
	System.out.println(".............................................");
	 double nt = 19.75;
		for(double e : notes.values()){
	        if(e==nt) {
	            System.out.println("l'etudiant est trouve : " + e);
	        }
}
		//5 modifier la note
		System.out.println(".............................................");
		notes.put("imane", 13.50);
		for (String key : notes.keySet()) {
		    System.out.println(key + " : " + notes.get(key));
		}
		//6 supprimier un etudiant 
		System.out.println(".............................................");
		notes.remove("kamal");
		for (String key : notes.keySet()) {
		    System.out.println(key + " : " + notes.get(key));
		}
		System.out.println(".............................................");

		//7 clacule moyenne
		double s=0,M;
		for(double e : notes.values()){
			s=s + e;
		}
		M=s/notes.size();
		System.out.println("La moyenne generale  = " + M);		
}}