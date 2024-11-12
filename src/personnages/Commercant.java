package personnages;

public class Commercant extends Humain {

	public Commercant(String nom,int argent) {
		super(nom,"Thé",argent);
	}

	public int seFaireExtorquer() {
		int somme = getArgent();
		perdreArgent(somme);
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return somme;
	}

	public void recevoir(int argent) {
		parler(argent + " sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
}
