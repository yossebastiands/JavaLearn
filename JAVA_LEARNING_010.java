/**
 * A month is assigned to a season multiple switch.
 * @author Gabriele Schmidt
 */
public class SeasonSwitchStatementClassic {
	public static void main(String[] args) {
		int number = 3;
		//switch statement with fall-though-semantic
		//bad solution
		switch (number) {
		case 12:
		case 1:
		case 2: System.out.println("Month " + number + " is " + "winter.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("Month " + number + " is " + "spring.");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Month " + number + " is " + "summer.");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("Month " + number + " is " + "fall.");
			break;
		default:
			System.out.println("No Season!");
		}
	}
}
