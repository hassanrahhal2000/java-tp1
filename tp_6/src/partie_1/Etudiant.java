package partie_1;

public class Etudiant {
   protected int id;
   protected String nom ;
   protected double Moyenne;
   public Etudiant(int id, String nom,double Moyenne) {
	    this.nom = nom;
	    this.id=id;
	    this.Moyenne=Moyenne;
   }
   public String toString() {
	   return ("ID: "+id+"    "+ "Nom:"+nom+"  "+"Moyenne:"+Moyenne);
	   
   }
}