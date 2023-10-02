package Personnages;

public class Romain {
	private String nom;
	private int force;
	private Equipement equipements[];
	private int nbEquipement = 0;

	public Romain(String nom, int force) {
		assert force >= 0 : "La force doit être positive.";
		this.nom = nom;
		this.force = force;
		this.equipements = new Equipement[2];
	}

	public String getNom() {
		return nom;
	}

	public int getForce() {
		return force;
	}

	public void parler(String texte) {
		System.out.println(prendreParole() + "« " + texte + "»");
	}

	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}

	public void recevoirCoup(int forceCoup) {
		assert force >= 0 : "La force doit être positive.";
		int tempo = force;
		force -= forceCoup;
		if (force > 0) {
			parler("Aïe");
		} else {
			parler("J'abandonne...");
		}
		assert force < tempo : "la force n'a pas diminué bizarre!";
	}

	public void sEquiper(Equipement eq) {
		switch (this.nbEquipement) {
		case 0:
			ajouterEquipement(eq);
			break;
		case 1:
			if (eq.getNom() == equipements[0].getNom()) {
				System.out.println("Le soldat" + this.getNom() + " possède déjà un " + eq.getNom() + " !");
			} else {
				ajouterEquipement(eq);
			}
			break;
		case 2:
			System.out.println("Le soldat " + this.getNom() + " est déjà bien protégé !");
		default:
			break;
		}
		/*
		 * if(equipements[0]!=null && equipements[1]!=null) {
		 * System.out.println("Le soldat "+this.getNom()+" est déjà bien protégé !");
		 * }else if(equipements[0]!=null && equipements[0].getNom()==eq.getNom()) {
		 * 
		 * System.out.println("Le soldat"+ this.getNom()+" possède déjà un "+eq.getNom()
		 * +" !"); }else {
		 * 
		 * this.equipements[nbEquipement]=eq; this.nbEquipement+=1;
		 * System.out.println("Le soldat "+this.getNom() +
		 * " s’équipe avec un "+eq.getNom()+"."); }
		 */
	}

	private void ajouterEquipement(Equipement eq) {
		this.equipements[nbEquipement] = eq;
		this.nbEquipement ++;
		System.out.println("Le soldat " + this.getNom() + " s’équipe avec un " + eq.getNom() + ".");
	}

	public static void main(String[] args) {
		Romain minus = new Romain("Minus", 6);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.CASQUE);

	}
}