package tp3;
public class tableau_polymorphe {
	public static void main(String[] args) {
		Vehicule[] v = new Vehicule[4];	 
		v[0] = new Voiture("Dacia","A39");
		v[1] = new Voiture("BMW","A01");
		v[2] = new Moto("kawazaki","A45",true);
		v[3] = new Camion("SCANYA","A32",29.8);
 for (int i = 0 ; i< v.length ; i++) {
	 v[i].stationner();
	 v[i].affichier();
 }
for ( Vehicule  vehicule :v) {
	if (vehicule instanceof Voiture) {
		vehicule.affichier();
	}}
	Vehicule x = new Moto("11C22","Yamaha",true);
	// ilya probleme  car la class voiture et moto sont des class fille 

	//Voiture v1 = (Voiture)x;
    //System.out.println("Downcasting reussi !");
		
		if (x instanceof Voiture ) {
			Voiture v1 = (Voiture)x;
			System.out.println("downcasting autorise ");}
			else {
				System.out.println("downcasting pas  autorise ");
			}
		}}

		
		
		
		
		
		
		
		
		
	


