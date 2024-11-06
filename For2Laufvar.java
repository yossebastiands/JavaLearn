/**
 * Es sind mehrere durch Kommata getrennte Ausdrücke im Initialisierungs- 
 * und Reinitialisierung (Inkrementabschnitt) erlaubt.
 * S. PI_06_Iterationin Java, Folie 11 
 * 
 * 
 * @author Gabriele Schmidt
 *
 */
public class For2Laufvar {

	public static void main(String[] args) {
		int i;
		String s;
		for (i=0, s = "testing";	//Initialisierungsabschnitt
		(i< 10) && (s.length() >= 1);	// Testabschnitt
		i++, s = s.substring(1))	 { // Reinitialisierung
			System.out.println(s); // Schleifenrumpf
		}
	}

}
