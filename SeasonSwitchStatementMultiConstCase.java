/**
 * A month is assigned to a season using switch.
 * @author Gabriele Schmidt
 */
 public class SeasonSwitchStatementMultiConstCase {
	public static void main(String[] args) {
		
		int number = 13;
		//switch statement with lists (not available in Java versions < 12)
		switch (number) {
		case 12, 1, 2:
			System.out.println("Month " + number + " is " + "winter.");
			break;
		case 3, 4, 5:
			System.out.println("Month " + number + " is " + "spring.");
			break;
		case 6, 7, 8:
			System.out.println("Month " + number + " is " + "summer.");
			break;
		case 9, 10, 11:
			System.out.println("Month " + number + " is " + "fall.");
			break;
		default:
			System.out.println("No Season!");
		}
	}
}