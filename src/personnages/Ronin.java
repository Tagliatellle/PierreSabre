package personnages;

public class Ronin extends Humain {
	private String nom;
	private String boissonFav;
	protected int argent;
	private int honneur = 1;
	
	public Ronin(String nom, String boissonFav, int argent) {
		super(nom, boissonFav, argent);
	}

	public void donner(Commercant beneficiaire) {
		int argentPerdu = (int) (argent*0.1);
		parler(beneficiaire.getNom()+" prend ces"+argentPerdu+" sous.");
		beneficiaire.gagnerArgent(argentPerdu);
		argent-=argentPerdu;
	}
}
