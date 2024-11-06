import java.util.Scanner;

/**
 * Erstes Programm mit einer Variable, die 
 * eingelesen wird und wieder ausgegeben wird.
 * 
 * @author Gabriele Schmidt
 *
 */
public class ErsteEinAusgabe {

	public static void main(String[] args) {
		
		int zahl = 42; //lokale Variable deklarieren und initalisieren
		Scanner sc = new Scanner(System.in); 
		// lokale Variable sc mit Objekterzeugung für Scanner
		// dies oeffnet die Standardeingabe System.in
		
		System.out.println("Meine erste Zahl ausgegeben auf der Konsole: " + zahl);
		
		System.out.print("Bitte eine ganze Zahl eingeben: ");
		zahl = sc.nextInt(); //einlesen von Tastatur, der ursprüngliche Wert wird überschrieben
		
		System.out.println("Meine erste eingelesene Zahl ausgegeben auf der Konsole: " + zahl);
		
		sc.close(); // Ressource Standardeingabe wieder freigeben, sonst "resource leak"

	}

}
