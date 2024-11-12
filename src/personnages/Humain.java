package personnages;

public class Humain {
	public static final int TAILLE_MEMOIRE_MAX = 30;
	private String nom;
	private String boissonFav;
	private int argent;
	protected int nbConnaissance = 0;
	protected Humain[] memoire = new Humain[TAILLE_MEMOIRE_MAX];

	public Humain(String nom, String boissonFav, int argent) {
		this.nom = nom;
		this.boissonFav = boissonFav;
		this.argent = argent;
	}

	public String getNom() {
		return nom;
	}

	public int getArgent() {
		return argent;
	}

	public void parler(String texte) {
		System.out.println("(" + nom + ") - " + texte);
	}

	public void direBonjour() {
		parler("Bonjour ! je m'appelle " + nom + " et j'aime boire du " + boissonFav);
	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFav + " ! GLOUPS !");
	}

	public void acheter(String bien, int prix) {
		if (argent >= prix) {
			parler("J'ai " + argent + " sous en poche. Je vais pouvoir m'offrir " + bien + " à " + prix + " sous");
			argent -= prix;
		} else {
			parler("Je n'ai que plus que " + argent + " sous en poche. Je ne peux même pas m'offrir " + bien + " à "
					+ prix + " sous");
		}
	}

	protected void gagnerArgent(int gain) {
		argent += gain;
	}

	protected void perdreArgent(int perte) {
		argent -= perte;
	}

	private void repondre(Humain humain) {
		direBonjour();
		memoriser(humain);
	}

	private void memoriser(Humain nouveauHumain) {
		if (nbConnaissance < TAILLE_MEMOIRE_MAX) {
			memoire[nbConnaissance] = nouveauHumain;
			nbConnaissance++;
		} else {
			for (int i = 0; i < TAILLE_MEMOIRE_MAX - 1; i++) {
				memoire[i] = memoire[i + 1];
			}
			memoire[TAILLE_MEMOIRE_MAX - 1] = nouveauHumain;
		}
	}

	public void faireConnaissanceAvec(Humain autreHumain) {
		direBonjour();
		autreHumain.repondre(this);
		memoriser(autreHumain);
	}

	public void listerConnaissance() {
		System.out.print("("+nom+") - "+"Je connais beaucoup de monde dont : ");
		for (int i = 0; i < nbConnaissance; i++) {
			if (i+1 == nbConnaissance) {
				System.out.println(memoire[i].getNom() + ".");
			} else {
				System.out.print(memoire[i].getNom() + ", ");
			}
		}
	}
}
