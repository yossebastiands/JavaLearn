/**
 * Beispiel für eine einfache do-while-Schleife
 * 
 * @author Gabriele Schmidt
 *
 */
public class DoWhileSchleife {

	/**
	 * Es werden die Zahlen 1 - 10 ausgegeben
	 * @param args
	 */
	public static void main(String[] args) {
		int zahl = 1;
		
		do {
			System.out.println(zahl);
			zahl++;
		} while(zahl <= 10);

	}

}
