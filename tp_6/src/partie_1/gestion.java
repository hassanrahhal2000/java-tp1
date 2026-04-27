package partie_1;

import java.util.ArrayList;

public class gestion {
	
	
	public static void main(String[] args ) {
	ArrayList<Etudiant> E = new ArrayList<>();
	E.add(new Etudiant (1,"kamal",17));
	E.add(new Etudiant (2,"ali",18));
	E.add(new Etudiant (3,"sofian",19));
	E.add(new Etudiant (4,"mohamed",20));
	E.add(new Etudiant (5,"omar",11));
	
	for(Etudiant e : E){
        System.out.println(e);
    }
	System.out.println(".....................................");
//3
    String NR = "omar";
	for(Etudiant e : E){
        if(e.nom.equals(NR)) {
            System.out.println("l'etudiant est trouve : " + e);
        }
    
}
	System.out.println("............................................");
	
	E.remove(2);
	for(Etudiant e : E){
        System.out.println(e);
    }
	System.out.println(".............................................................................");
// trie par moyyenne;
	for(int i = 0; i < E.size()-1; i++) {
	    for(int j = i + 1; j < E.size(); j++) {
	        if(E.get(i).Moyenne > E.get(j).Moyenne) {
	            Etudiant temp = E.get(i);
	            E.set(i, E.get(j));
	            E.set(j, temp);
	        }
	    }
	}
	
	for(Etudiant e : E){
	    System.out.println("trie des etudiant par moyenne croissante "+e);
	}
	//6
	System.out.println(".............................................................................");

	Etudiant maxM = E.get(E.size() - 1);
	System.out.println("Meilleure moyenne : " + maxM);
}}