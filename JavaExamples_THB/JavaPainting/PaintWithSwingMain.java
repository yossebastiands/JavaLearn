
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 * Zum Starten der Anwendung in einem Fenster.
 * 
 * @author gschmidt@fh-brandenburg.de
 * @version 1.1
 */
public class PaintWithSwingMain {
	
	/**
	 * Initialisiert das Fenster
	 * Ordnet den Panel, in dem gezeichnet wird dem Fenster zu.
	 */
	  public static void createAndShowGui() {
	        JFrame f = new JFrame("MyPainting");
	        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
	        Container panel = new MyPainting();
	        f.addKeyListener((KeyListener) panel);
	        ((MyPainting)panel).start();
	        f.getContentPane().add(panel, BorderLayout.CENTER);
	    
	        f.pack();
	        f.setLocationRelativeTo(null);
	    	f.setSize(800, 600);
	        f.setVisible(true);
	    }

	  /**
		 * Startet das Fenster in einem eigenen Thread.
		 */
	    public static void main(final String[] args) {
	        Runnable gui = new Runnable() {

	            @Override
	            public void run() {
	                createAndShowGui();
	            }
	        };
	        //GUI must start on EventDispatchThread:
	        SwingUtilities.invokeLater(gui);
	    }

}
