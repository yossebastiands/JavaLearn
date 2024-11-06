/**
 * Alle definiten Iterationen können als indefinite Iteration dargestellt
 * werden. S. PI_04_Kontrollstrukturen, Folie 37 
 * Die Scheifen sollen immer semantisch gleich verhalten.
 * 
 * @author schmidt
 *
 */
public class SchleifenBeispiel {

	public static void main(String[] args) {
		int i;

		// Ausgabe 0, 2, 4, 6, 8, 10
		// definite Schleife
		for(i = 1; i <= 10; i +=  2){
			System.out.println(i);
		}
		
		System.out.println("Nach for: " + i);

		// indefinite while-Schleife
		i = 1;
		while(i <= 10) {
			System.out.println(i);
			i +=  2;
		}
		
		System.out.println("Nach while: " + i);

		// indefinite do-while-Schleife
		i = 1;
		if(i <= 10) {
			do{
				System.out.println(i);
				i +=  2;
			}while(i <= 10);
		}
		
		System.out.println("Nach do-while: " + i);
	}
}