package TP5;

public class TestAbonnements {

public static void main(String[] args) {
Abonnement []Abonnements = new Abonnement[3];
Abonnements[0] = new AbonnementVideo("VedoiGames",199,2,true,false);
Abonnements[1] = new AbonnementMusique("Spotify",60,1,4,false);	
Abonnements[2] = new AbonnementJeux("PlayStation",267,0,5,6);	


for(Abonnement a: Abonnements){
    a.afficherInfos();
    System.out.println("Cout: " + a.calculerCoutMensuel());
    System.out.println("Score: " + a.calculerScoreSatisfaction());
    System.out.println("-------------------");
}
int p = 20;
Reducible []ObjetReducible = new Reducible[2];
ObjetReducible[0]=new AbonnementVideo("eFootball",200,2,true,false);
ObjetReducible[1]=new AbonnementMusique("Deezer",150,2,8,true);

for (Reducible r : ObjetReducible) {
    if (r.EstEligibleReduction(p)) {
        System.out.println("Acceptée ! Nouveau prix: " + r.AppliquerReduction(p) + " DH");
    } else {
        System.out.println("Refusée ! Le taux de " + p + "% est trop élevé.");
    }
}
int pr = 50;
ObjetReducible[0]=new AbonnementVideo("eFootball",200,3,true,false);
ObjetReducible[1]=new AbonnementMusique("Deezer",150,2,8,true);

for (Reducible r : ObjetReducible) {
    if (r.EstEligibleReduction(pr)) {
        System.out.println("Acceptée ! Nouveau prix: " + r.AppliquerReduction(pr) + " DH");
    } else {
        System.out.println("Refusée ! Le taux de " + pr + "% est trop élevé.");
    }


}
}}
