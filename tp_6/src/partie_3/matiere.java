package partie_3;
import java.util.Objects;
public class matiere {
	protected int id;
	protected String nom;
	protected  int coefficient;

    public matiere(int id,String nom, int coefficient) {
    	this.id=id;
    	this.nom=nom;
    	this .coefficient= coefficient;
    }
   public String toString () {
	   return ("id:"+id+"  "+"nom:"+nom+" coefficient:"+coefficient);
   }
	public boolean equals(Object ob) {
	     matiere m = (matiere) ob;
	    return this.id == m.id;
	}
	  public int hashCode() {
	        return Objects.hash(id);
	    }
}
