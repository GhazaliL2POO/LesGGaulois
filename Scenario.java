package personnages;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois ("Asterix",8); 
		Romain minus = new Romain ("Minus",6);
	asterix.parler("Bonjours a tous");
	minus.parler("« UN GAU... UN GAUGAU...");
for (int i=0;i<3;i=i+1) {
	asterix.frapper(minus);
	
		Druide Panoramix = new Druide ("Panoramix ",5,10);
		Panoramix.preparerPotion();
	
}
asterix.boirePotion(3);


	}

}
