package Personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;

	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
	}

	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
	}

	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public void boirePotion(int forcePotion) {
		this.effetPotion=forcePotion;
		this.parler("« Merci Druide, je sens que ma force est "+ effetPotion +"fois décuplée.");
	}
	public static void main(String[] args) {
//TODO créer un main permettant de tester la classe Gaulois
		Gaulois asterix= new Gaulois("astérix",8);
		Romain r = new Romain("aboudi",7);
		System.out.println(asterix.getNom());
		asterix.parler("hiiiiiiiiiiiiiiii");
		asterix.frapper(r);
	}
}
