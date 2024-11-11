package personnages;

public class Yakuza extends Humain {
	private String nom;
	private String boissonFav;
	protected int argent;
	private int reputation = 0;
	private String clan;
	
	public Yakuza(String nom, String boissonFav, int argent, String clan) {
		super(nom, boissonFav, argent);
		this.clan = clan;
	}
	
	public void extorquer(Commercant victime) {
		int argentVole = victime.getArgent();
		victime.perdreArgent(argentVole);
		gagnerArgent(argentVole);
		parler("J'ai piqué les "+argentVole+" sous de "+victime.getNom()+", ce qui me fait "+getArgent()+" sous dans ma poche. Hi ! Hi !");
	}
}
