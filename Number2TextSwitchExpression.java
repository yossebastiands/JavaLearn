import java.util.Scanner;

/**
 * Converter of a number into text (engl.)
 * 
 * Overview of numbers from 1 to 1.000.000 1 one 11 eleven 21 twenty-one 31
 * thirty-one 2 two 12 twelve 22 twenty-two 40 forty 3 three 13 thirteen 23
 * twenty-three 50 fifty 4 four 14 fourteen 24 twenty-four 60 sixty 5 five 15
 * fifteen 25 twenty-five 70 seventy 6 six 16 sixteen 26 twenty-six 80 eighty 7
 * seven 17 seventeen 27 twenty-seven 90 ninety 8 eight 18 eighteen 28
 * twenty-eight 100 a/one hundred 9 nine 19 nineteen 29 twenty-nine 1,000 a/one
 * thousand 10 ten 20 twenty 30 thirty 1,000,000 a/one million and 999 nine
 * hundred and ninety-nine
 * 
 * Solution use only data types, operators and control structures without call
 * 
 * @author Gabriele Schmidt
 * 
 * @version 1.1
 * 
 */
public class Number2TextSwitchExpression {

	/**
	 * 
	 * converts a number into text (engl.)
	 * 
	 * 
	 */
	public static void main(String args[]) {

		boolean isHundredOnly = false;
		boolean isNoTeen = false;

		int number;

		String countTen = "";
		String text = "";

		Scanner sc = new Scanner(System.in);

		// Input
		do {
			System.out.println("Please, insert a number between  -999  and 999: ");
			number = sc.nextInt();
		} while (number < -999 || number > 999);

		// Processing
		// test the range of number
		if (number < -999 || number > 999) {
			text = "The number " + number + " is out of the range from -999 to 999 and cannot be converted.";
		} else {

			// where required set minus
			// and process only with positive values
			if (number < 0) {
				text = "minus ";
				number *= -1;
			}

			// calculate hundred
			if (number >= 100) {
				text += switch (number / 100) {
				case 1 -> "one";
				case 2 -> "two";
				case 3 -> "three";
				case 4 -> "four";
				case 5 -> "five";
				case 6 -> "six";
				case 7 -> "seven";
				case 8 -> "eight";
				case 9 -> "nine";
				default -> "";
				};

				// add hundred
				text += " hundred";

				// cut hundred by modulo
				number %= 100;

				if (number > 0) {
					text += " and ";
				} else {
					isHundredOnly = true; // hundered only
				}
			}

			// Further Special cases: 0, 11, 12, 13, 15
			// culculate Tenner and null
			if (!isHundredOnly) {
				text += switch (number) {
				case 0 -> "null";
				case 11 -> "eleven";
				case 12 -> "twelve";
				case 13 -> "thirteen";
				case 15 -> "fifteen";
				case 18 -> "eighteen";
				case 14 -> "four" + "teen";
				case 16 -> "six" + "teen";
				case 17 -> "seven" + "teen";
				case 19 -> "nine" + "teen";
				default -> {
					isNoTeen = true;
					yield "";
				}
				};

			}

			if (!isHundredOnly && isNoTeen) {
				// special cases first
				// normal case + "ty"
				countTen= switch (number / 10) {
				case 1 -> "ten";
				case 2 -> "twenty";
				case 3 -> "thirty";
				case 4 -> "forty";
				case 5 -> "fifty";
				case 8 -> "eighty";
				case 6 -> "six" + "ty";
				case 7 -> "seven" + "ty";
				case 9 -> "nine" + "ty";
				default -> "";
				};

				// hyphen or not
				if (number >= 10) {
					if (number > 20 && number % 10 != 0) {
						text += countTen + "-";

					} else {
						text += countTen;
					}

				}
				text +=  switch (number % 10) {
				case 1 -> "one";
				case 2 -> "two";
				case 3 -> "three";
				case 4 -> "four";
				case 5 -> "five";
				case 6 -> "six";
				case 7 -> "seven";
				case 8 -> "eight";
				case 9 -> "nine";
				default ->	"";
				};
			}
		}
		System.out.println(text);

		sc.close();
	}
}