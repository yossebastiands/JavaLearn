/**
 * A month is assigned to a season multiple switch.
 * @author Gabriele Schmidt
 */
 public class SeasonSwitchStatementLambdaMultiConstCase {
	public static void main(String[] args) {
		
		int number = 1;
		//switch expression without fall-though-semantic and with multi constant case labels
		switch (number) {
		case 12, 1, 2 -> System.out.println("Month " + number + " is " + "winter.");
		case 3, 4, 5 -> System.out.println("Month " + number + " is " + "spring.");	
		case 6, 7, 8 -> System.out.println("Month " + number + " is " + "summer.");
		case 9, 10, 11 -> System.out.println("Month " + number + " is " + "fall.");
		default -> System.out.println("No Season!");
		}
	}
}