import java.util.Scanner;
/**
* Wahl und Ausgabe des Mensaessens
*
* @author Gabriele Schmidt
* @version 1.0
*/
public class MensaEssen {

	public static void main(String[] arcs) {

		// Deklarierung
		final String essensAngebot1 = "Sueß-saure Eier mit hausgemachten Kartoffelstampf";
		final String essensAngebot2 = "Kasslerbraten mit Sauerkraut und Kartoffelkloesse oder Salzkartoffeln";
		final String essensAngebot3 = "Fangfrisches Seelachsfilet mit Sauce Hollondaise, dazu Kartoffeln oder Salbei-Gnocchi und Gemuese der Saison";
		final String essensAngebot4 = "Suesskartoffel-Kokos-Soja-Curry mit Tomatenbulgur (vegan)";

		int angebotsnr;
		
		Scanner sc = new Scanner(System.in);

		// Einlesen
		System.out.println("Waehlen Sie ein Essensangebot zwischen 1 und 4: ");
		angebotsnr = sc.nextInt();
	
		//Verarbeiten und Ausgeben
		switch (angebotsnr) {
			case 1:
				System.out.println("Sie haben gewaehlt: " + essensAngebot1);
				break;
			case 2:
				System.out.println("Sie haben gewaehlt: " + essensAngebot2);
				break;
			case 3:
				System.out.println("Sie haben gewaehlt: " + essensAngebot3);
				break;
			case 4:
				System.out.println("Sie haben gewaehlt: " + essensAngebot4);
				break;
			default:
				System.out.println("Essensangebot-Nr. " + angebotsnr + " gibt es leider in der Mensa nicht.");
		}

		sc.close();
	}
}
