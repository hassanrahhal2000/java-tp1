package partie_3;
import java.util.*;
public class gestion_matiere {
public static void main(String[] args) {
	//1
		Set<matiere> hs = new HashSet<>();
		hs.add(new matiere(121,"math",7));
		hs.add(new matiere(34,"svt",3) );
		hs.add(new matiere(210,"sport",1));
		hs.add(new matiere(300,"arabic",2));
		
		//2
		 matiere M = new matiere(300,"arabic",2);
	        if(!hs.add(M)) {
	            System.out.println("deja exist  : " + M);
	        } else {
	            System.out.println("Ajout  avec succes");
	        }
	    	System.out.println(".....................................");

		//3
		for( matiere m:hs) {
			System.out.println(m);
		}
      //4
	Set<matiere> ts = new TreeSet<>(Comparator.comparing(m -> m.nom));
	for(matiere m:hs) {
		ts.add(m);	
	}
	//5
	System.out.println(".....................................");
	for(matiere m:ts) {
		System.out.println(m);
	}			
	} }
