/**
 * Beispiel für einfache for-Schleifen
 * 
 * @author Gabriele Schmidt
 *
 */
public class ForSchleifen {

	/**
	 * Es werden die Zahlen 1 - 10 ausgegeben
	 * @param args
	 */
	public static void main(String[] args) {
		int zahl;
		
		//einfache for-Schleife
		for(zahl = 1; zahl <= 10; zahl++) {
			System.out.println(zahl);
		}
		System.out.println("Zahl nach der for-Schleife: " + zahl);
		
		System.out.println();
		//for-Schleifen beginnen oft mit einer Laufvaraible initialisiert mit 0
		for(zahl = 0; zahl < 10; zahl++) {
			System.out.println(zahl + 1);
		}
		System.out.println("Zahl nach der mit 0 initialisierten for-Schleife: " + zahl);
		
		System.out.println();
		//for-Schleife mit lokaler Laufvariable i (haeufiger Name für die Laufvariable)
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
//		System.out.println("Lokale Variable der Laufwanweisung: " + i);
	}

}