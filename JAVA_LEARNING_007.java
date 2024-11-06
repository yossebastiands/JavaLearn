import java.util.Scanner;

/**
 * Brutto-Netto Rechner. Applikation fuer die Berechnung des aktuellen
 * gewichtsabhaengigen Produktpreises.
 * 
 * @author berdux, schmidt, buchholz
 * @version 3.0
 */
public class BananenRechner {

	/**
	 * Berechnung des aktuellen Brutto-, Netto-, MwSt-Preises bei einzulesenden
	 * Werten für das Produktgewicht (in Gramm), den Kilopreis (in Cent) und den zu
	 * berechnenden MwSt-Satz. Das Ergebnis wird auf der Konsole ausgegeben.
	 */
	public static void main(String args[]) {

		int bruttoKiloPreis;
		int gewicht;
		final float MWST_SATZ;
		float bruttoPreis;
		float nettoPreis;
		float mwstPreis;
		float gesamtPreis;

		Scanner sc = new Scanner(System.in);

		// Einlesen der Werte fuer die Preisberechnung
		System.out.println("Bitte Kilopreis(brutto) in Cent eingeben:");
		bruttoKiloPreis = sc.nextInt();
		System.out.println("Bitte Mehrwertsteuer eingeben:");
		MWST_SATZ = sc.nextFloat();
		System.out.println("Bitte Gewicht(in Gramm) eingeben:");
		gewicht = sc.nextInt();

		// Berechnung
		// Bruttopreis der aktuellen Bananenmenge
		// Berechnung in Kilogramm, aber noch Cent, da erst spaeter runden
		// Konvertierung in float
		bruttoPreis = bruttoKiloPreis * gewicht / 1000.0f;
		// Umrechnung von Brutto nach Netto (brutto = netto + netto * MwSt)
		nettoPreis = bruttoPreis / (1 + MWST_SATZ / 100);
		mwstPreis = nettoPreis * MWST_SATZ / 100;


		//Berechnung des Gesamtpreises, um Rundungsungenauigkeiten zu vermeiden
		gesamtPreis = mwstPreis + nettoPreis;

		// Umrechnung von Cent in Euro mit Rundung
		gesamtPreis = Math.round(gesamtPreis) / 100f;
		mwstPreis = Math.round(mwstPreis) / 100f;
		nettoPreis = Math.round(nettoPreis) / 100f;

		// Ausgabe
		System.out.println("Brutto: "+ gesamtPreis + " Euro");
		System.out.println("MwSt: "+mwstPreis + " Euro");
		System.out.println("Netto: "+ nettoPreis + " Euro");

		sc.close();
	}
}
