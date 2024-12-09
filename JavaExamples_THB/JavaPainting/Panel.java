import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 * Erstellt ein JPanel, in dem gezeichnet werden kann.
 * Legt die Reaktion auf die Tastatur fest.
 * 
 * @author berdux@fh-brandenburg.de, gabriele.schmidt@th-brandenburg.de
 *
 */
public class Panel extends JPanel implements KeyListener {
	

	private static final long serialVersionUID = -2079406396462118506L;
	
	/**
	 * Figur, die gezeichnet wird
	 */
	protected PaintingBasic myPainting = null;
	
	/** (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyReleased(KeyEvent actEvent){
		
	}
	
	/** (non-Javadoc)
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyPressed(KeyEvent actEvent){
		
	}
	
	/** 
	 * Reagiert auf die Eingabe von n über die Tastatur, um den nächsten Schritt zu zeichnen
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	public void keyTyped(KeyEvent actEvent){
		char key = actEvent.getKeyChar();
		switch(key){
			case('n'):	myPainting.nextStep();
						repaint();
						break;
		}
	}
	
	/** 
	 * Läd ein Bild
	 * @see java.awt.event.KeyListener#keyReleased(java.awt.event.KeyEvent)
	 */
	protected Image ladeBild(String name) {
		  BufferedImage image = null;
	        try
	        {
	          image = ImageIO.read(new File(name));
	        }
	        catch (Exception e)
	        {
	          e.printStackTrace();
	          System.exit(1);
	        }
	        return image;
}
}
