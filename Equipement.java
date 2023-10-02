package Personnages;

public enum Equipement {
	CASQUE("CASQUE"),BOUCLIER("BOUCLIER");
	String nom;
	 Equipement(String nom) {
		this.nom=nom;
	}
	public String getNom() {
		return nom;
	}
	
	public String toString() {
		return this.getNom();
	}
}
