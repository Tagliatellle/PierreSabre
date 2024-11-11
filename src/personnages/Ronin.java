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
//		int argentPerdu = (int) (argent/10);
		int argentPerdu = getArgent() / 10;
		parler(beneficiaire.getNom() + " prend ces " + argentPerdu + " sous.");
		beneficiaire.gagnerArgent(argentPerdu);
		argent -= argentPerdu;
		beneficiaire.parler(argentPerdu + " sous ! Je te remercie généreux donateur!");
	}

	public void provoquer(Yakuza adversaire) {
		int forceYakuza = adversaire.getReputation() * 2;
		int forceRonin = honneur * 2;
		int argentYakuza = adversaire.getArgent();
		int argentRonin = getArgent();
		parler("Je t'ai retrouvé vermine, tu vas payer pour ce que tu as fait à ce pauvre marchand!");
		if (forceRonin >= forceYakuza) {
			adversaire.perdreArgent(argentYakuza);
			gagnerArgent(argentYakuza);
			honneur++;
			parler("Je t'ai eu petit yakuza!");
			adversaire.parler("J'ai perdu mon duel et mes "+argentYakuza+" sous, snif... J'ai déshonoré le clan de "+adversaire.getClan()+".");
		} else {
			perdreArgent(argentRonin);
			adversaire.gagner(argentRonin);
			honneur--;
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont pris un coup.");
			adversaire.parler("Ce ronin pensait vraiment battre "+adversaire.getNom()+" du clan de "+adversaire.getClan()+" ? Je l'ai dépouillé de ses "+argentRonin+" sous.");
		}

	}
}
