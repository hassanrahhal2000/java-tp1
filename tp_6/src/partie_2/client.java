package partie_2;

public class client {
	  protected int Numero;
	  protected String Nom;
	  public client(int Numero,String Nom) {
		  this.Numero=Numero;
		  this.Nom=Nom;
	  }
	  public String toString() {
		   return ("Numero: "+Numero+"    "+ "Nom:"+Nom);
		   
	  }

	}