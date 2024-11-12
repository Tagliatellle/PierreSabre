package histoire;

import personnages.Commercant;
import personnages.Yakuza;
import personnages.Ronin;
import personnages.Humain;

public class HistoireTP4 {
	public static void main(String[] args) {
		Humain prof = new Humain("Prof", "Kombucha", 54);
		prof.acheter("une boisson", 12);
		prof.boire();
		prof.acheter("un jeu", 2);
		prof.acheter("kimono", 50);
		Commercant marco = new Commercant("Marco", 20);
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();

		Yakuza yaku = new Yakuza("Yaku Le Noir", "whisky", 30, "Warsong");
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par l� ?");
		yaku.parler("Marco, si tu tiens à la vie donne moi ta bourse !");
		yaku.extorquer(marco);

		Ronin roro = new Ronin("Roro", "Shochu", 60);
		roro.direBonjour();
		roro.donner(marco);
		roro.provoquer(yaku);
		
		Commercant chonin = new Commercant("Chonin", 40);
		Commercant kumi = new Commercant("Kumi", 10);
		
		marco.faireConnaissanceAvec(roro);
		marco.faireConnaissanceAvec(yaku);
		marco.faireConnaissanceAvec(chonin);
		marco.faireConnaissanceAvec(kumi);
		
		marco.listerConnaissance();
		roro.listerConnaissance();
		yaku.listerConnaissance();
	}
}
