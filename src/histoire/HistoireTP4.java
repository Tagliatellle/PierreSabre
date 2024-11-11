package histoire;

import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	public static void main(String[] args) {
//		Humain prof = new Humain("Prof", "Kombucha", 54);
//		prof.acheter("une boisson", 12);
//		prof.boire();
//		prof.acheter("un jeu", 2);
//		prof.acheter("kimono", 50);
//		Commercant pablo = new Commercant("Pablo","th�",20);
//		pablo.direBonjour();
//		pablo.seFaireExtorquer();
//		pablo.recevoir(15);
//		pablo.boire();
		
		Yakuza yaku = new Yakuza("Yaku", "whisky", 30, "Warsong");
		Commercant marco = new Commercant("Pablo", "Thé",15);
		yaku.direBonjour();
		yaku.parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		yaku.parler("Marco, si tu tiens à la vie donne moi ta bourse !");
		yaku.extorquer(marco);
	}
}
