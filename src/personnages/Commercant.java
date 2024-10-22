package personnages;

public class Commercant extends Humain {
	private String nom;
	private String boissonFav;
	private int argent;

	public Commercant(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}
	
	public int seFaireExtorquer() {
		int somme = getArgent();
		perdreArgent(getArgent());
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return somme;
	}
	
	public void recevoir(int argent) {
		parler(argent +" sous ! Je te remercie généreux donateur!");
		gagnerArgent(argent);
	}
}
