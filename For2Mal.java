/**
 * Unterschied zwischen einer for-Schleife mit 2 Laufvariablen
 * und  
 * 2 geschachtelten for-Schleifen
 * 
 * @author schmidt
 *
 */
public class For2Mal {

	public static void main(String[] args) {

		//for-Schleife mit 2 Laufvariablen
		for (int i = 0, j = 0;	i < 5 ; i++, j++) { 	
			System.out.println("i = " + i  + " j = " + j); 
		}
		
		System.out.println("-------------------");
		
		//2 geschachtelte for-Schleifen
		for (int i = 0; i < 5; i++) { 	
				
			for(int j = 0; j < 5; j++) {
				
					System.out.println("i = " + i  + " j = " + j); 
			}
		}
	}
}
