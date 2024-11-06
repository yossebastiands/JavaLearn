/**
 * A month is assigned to a season using switch.
 * @author Gabriele Schmidt
 */
 public class SeasonSwitchExpression {
	public static void main(String[] args) {
		int number = 1;
		String season;
		
		//Using switch as an expression 
		season = switch (number) {
		case 12, 1, 2 -> "Month " + number + " is " + "winter.";
		case 3, 4, 5 -> "Month " + number + " is " + "spring.";	
		case 6, 7, 8 -> "Month " + number + " is " + "summer.";
		case 9, 10, 11 -> "Month " + number + " is " + "fall.";
		default -> "No Season";
		};
		System.out.println(season);
	}
}