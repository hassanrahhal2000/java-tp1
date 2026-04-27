package partie_6;

public class livre {
  protected String ISBN;
  protected String Titre;
  protected String Auteur;
  protected int Annee;
  public livre(String ISBN,String Titre,String Auteur,int Annee) {
	this.ISBN=ISBN;
	this.Titre=Titre;
	this.Auteur=Auteur;
	this.Annee=Annee;
}
  public String toString() {
      return ("ISBN:" + ISBN+" || " +" Titre :"+ Titre+"|| " + "Auteur:" +Auteur+ " || " +"Aannee:"+Annee);
  }
}