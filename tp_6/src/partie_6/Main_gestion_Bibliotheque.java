package partie_6;
import java.util.*;
public class Main_gestion_Bibliotheque {
	public static void main(String[] args) {
		//1
	 ArrayList<livre>livres= new ArrayList<>(); 
	  livres.add(new livre("978-1", "Clean Code","Robert Martin",2008));
      livres.add(new livre("978-2", "Java Programming","James Gosling",2020));
      livres.add(new livre("978-3", "Design Patterns","Gang of Four",1994));
      livres.add(new livre("978-4", "The Pragmatic Programmer", "Thomas",1999));
    //2
      HashSet<String>categories= new HashSet<>();
      categories.add("informatique");
      categories.add("programmation");
      categories.add("Architecture logicielle");
     //3
      HashMap<String, String> etudiant = new HashMap<>(); 
       etudiant.put("Ali","978-1");
       etudiant.put("Fatima","978-3");
      //4
       int annee = 2008;
       for (livre l : livres) {
           if (l.Annee==annee) {
               System.out.println("Livre trouvé : " + l);
           }
       } 
       System.out.println("---------------------------------------------------------------------------");
       //5
       Iterator<livre> it = livres.iterator();
       while(it.hasNext()) {
       	livre l = it.next();
       	if(l.Annee== annee) {
       		it.remove();
       	}
       }
       //6
       for (livre l:livres) {
    	    System.out.println(l);
    	} }}
	


