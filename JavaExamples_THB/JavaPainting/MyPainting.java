
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

/**
 * Zum Zeichnen einer Figur.
 * 
 * Die Figur kann ueber Befehle gesteuert werden, so dass verschiedene Muster 
 * gezeichnet werden koennen. Die Wegbeschreibung der Figur findet direkt waehrend des 
 * Starts des Applets statt. 
 * 
 * Ueber die Tastate 'n' kann die Figur Schritt fuer Schritt weitergefuehrt werden.
 * 
 * @author berdux@fh-brandenburg.de
 * @author gschmidt@fh-brandenburg.de
 * @version 1.2
 */
public class MyPainting extends Panel {
	
	
	private static final long serialVersionUID = 1L;
	private Image backgroundPicture; // Hintergrundbild
	
	
	/**
	 * Methode die alles definiert, was dann schrittweise gezeichnet wird. Hier darf verändert werden.
	 * 
	 */
	public void start(){
		
		
		backgroundPicture = ladeBild("Labyrinth.jpg"); // Hintergrundbild fuer das Labyrinth laden
		
		
		myPainting = new PaintingBasic(); // erzeugt eine neue Figur namens MyPainting
		
		/* Setze den Weg der Figur 'myPainting' mit den Befehlen: 
		 * setStartpoint(x,y)
		 * rotate(a)
		 * go(x)
		 * jumpTo(x,y)
		 * setColor(c) mit den Farben Color.GREEN, Color.BLACK, Color.RED, Color.ORANGE
		 * 
		 * z.B. myPainting.setStartpoint(100, 100);
		 */

		// Viereck beschreiben
		myPainting.setStartpoint(50,355);
		myPainting.rotate(270);
		myPainting.go(20);
		myPainting.rotate(90);
		myPainting.go(20);
		myPainting.rotate(90);
		myPainting.go(20);
		myPainting.rotate(90);
		myPainting.go(20);
	}
	
	/**
	 * Zeichnet die Figur inkl. des Weges bis zur aktuellen Position.
	 * 
	 * @param g Grafikkontext auf dem die Figur gezeichnet wird.
	 */
	  @Override
      protected void paintComponent(final Graphics g) {
          super.paintComponent(g);
		
		// Schrift festsetzen
		Font schrift1 = new Font("Arial",Font.BOLD,14);
		Font schrift2 = new Font("Arial",Font.PLAIN, 12);
		g.setFont(schrift1);
		
		// Ueberschrift und Hintergrundbild anzeigen
		g.drawString("myPainting Labyrinth", 15, 15);
		g.drawImage(backgroundPicture, 0, 30, 250, 150, this);
		
		// Ueberschriften und Text anzeigen
		g.drawString("myPainting Viereck", 15, 300);
		g.drawString("myPainting Haus des Nikolaus", 300, 300);
		
		// Font wechseln und Text anzeigen
		g.setFont(schrift2);
		g.drawString("Hier starter die Zeichnung,", 15, 315);
		g.drawString("wenn Sie \"n\" wie next tippen.", 15, 328);
		
		

		myPainting.paint(g); // zeichnet die Figur und den Weg bis zur aktuellen Position

	
	}
}
