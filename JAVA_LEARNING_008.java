import java.util.Scanner;

/**
 * Ueberlauf bei der Addition
 * @author Gabriele Schmidt
 *
 */
public class UeberlaufAddition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int augend; //Benennung des ersten Summanden im Englischen
		int addend; //Benennung des zweiten Summanden im Englischen
		int sum;
		
		Scanner sc = new Scanner(System.in);

		augend = sc.nextInt();
		
		//Pruefen, ob 1. Zahl postitiv, sonst Ende
		if (augend > 0) {

			addend = sc.nextInt();
			//Pruefen, ob postitiv 2. Zahl postitiv, sonst Ende
			if (addend > 0) {
				//Pruefen, um Ueberlauf zu verhindern
				if (augend <= Integer.MAX_VALUE - addend) {
					sum = augend + addend;
					System.out.println("Das Ergebnis lautet: " + sum);
				} else
					System.out
							.println("Leider koennen beide Zahlen nicht addiert werden, da es zu einem Ueberlauf kaeme.");

			} else
				System.out.println("Die zweite Zahl ist nicht positiv.");

		} else
			System.out.println("Die erste Zahl ist nicht positiv.");
		
		sc.close();
	}
}
