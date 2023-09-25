package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;

	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut allerd'une force " + effetPotionMin + " à "
				+ effetPotionMax + ".");
	}

	public String getNom() {
		return nom;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}

	public int getEffetPotionMax() {
		return effetPotionMax;
	}

	public void setEffetPotionMax(int effetPotionMax) {
		this.effetPotionMax = effetPotionMax;
	}

	public int getEffetPotionMin() {
		return effetPotionMin;
	}

	public void setEffetPotionMin(int effetPotionMin) {
		this.effetPotionMin = effetPotionMin;
	}

	public int preparerPotion() {
		Random rand = new Random();
		int r = rand.nextInt(effetPotionMin, effetPotionMax);
		if (r > 7) {
			parler(" J'ai préparé\r\n" + "une super potion de force ");
		} else {
			parler("« Je  n'ai pas trouvé tous les ingrédients, ma potion estseulement de force");
		}
		System.out.println("ma force est :" + r);
		return r;
	}

	public void booster(Gaulois g) {
		if (g.getNom() != "Obélix") {
			g.boirePotion(preparerPotion());
		}
		else {
			this.parler(" Non, Obélix !... Tu n’auras pas de potion magique !");
		}
	}

	public class Main {

		public static void main(String[] args) {
			Druide Panoramix = new Druide("Panoramix ", 5, 10);
			Panoramix.preparerPotion();

		}
	}

}