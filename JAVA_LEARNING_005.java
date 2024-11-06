/**
 * Die Klasse zeigt komplexe Ausdrücke, die kein guter Stil sind.
 * @author Gabriele Schmidt
 *
 */
 public class OperatorenRaetselLoesung {
	public static void main(String args[ ]) {
		int x = 2, y, z;
		// Zuweisungsoperatoren
		x *= 3 + 2; 		System.out.println(x); 	/* 1. Wert? 10 */
		x *= y = z = 4; 		System.out.println(x); 	/* 2. Wert? 40 */
		// arithmestische Operatoren
		x = - 3 + 4 * 5 - 6; 	System.out.println(x); /* 3. Wert? 11 */
		System.out.println(4%5); //Zwischenausgabe zum Testen von Modulo
		x =  3 + 4 % 5 - 6;  	System.out.println(x); /* 4. Wert? 1 */
		x = - 3 * 4 %  - 6 / 5; 	System.out.println(x); /* 5. Wert? 0 */
		x = (7 + 6 ) %  5 / 2; 	System.out.println(x); /* 6. Wert? 1 */
		// Inkrement Operatoren
		x = y = 1;
		z = x++ - 1;		System.out.println(x + "\t" + z); /* 7. und 8.Wert? x = 2, z = 0*/
		z += - x ++ + ++ y; 	System.out.println(x + "\t" + y + "\t"+ z); /* 9.,10. u. 11.Wert? x = 3, y = 2 , z = 0*/
		z  = x / ++ x ;		System.out.println(x + "\t" + z); /* 12. und 13. Wert? x = 4, z = 0*/
		//Diesen letzten Ausdruck nicht verwenden, da Seiteneffekte!
	}
}
