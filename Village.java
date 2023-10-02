package Personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois villageois[];
	private int nbVillageois = 0;

	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

	public String getNom() {
		return nom;
	}

	public void ajouterHabitant(Gaulois gaul) {
		this.villageois[nbVillageois] = gaul;
		nbVillageois += 1;
	}
	public Gaulois trouverHabitant(int n) {
		return this.villageois[n];
	}
	public void afficherVillageois(Chef chef) {
		System.out.println("Dans village du chef "+chef.getNom()+" vivent les légendaires "
																			+ "gaulois : ");
		int i=0;
		while(this.villageois[i]!=null) {
			System.out.println("- "+villageois[i].getNom());
			i++;
		}
	}
	public static void main(String[] args) {
		Village village=new Village("Village des Irréductibles",30);
		//Gaulois gaulois = village.trouverHabitant(30);
		// 30 > villageoi.length()-1
		Chef chef=new Chef("Abraracourcix",6,village);
		Gaulois asterix = new Gaulois("Astérix",8);
		village.ajouterHabitant(asterix);
		/*Gaulois gaulois = village.trouverHabitant(1);
		System.out.println(gaulois);
		null car asterix est ajouté a la premiere case d'indice 0 or que les cases sont tous 
		initialisées a null
		*/
		Gaulois obelix = new Gaulois("Obélix",25);
		village.ajouterHabitant(obelix);
		village.afficherVillageois(chef);
	}
	
}
