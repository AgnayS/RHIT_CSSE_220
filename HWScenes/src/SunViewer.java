import java.awt.Dimension;

import javax.swing.JFrame;


public class SunViewer {
public static final Dimension SUN_VIEWER_SIZE = new Dimension(1000, 1000);
	
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		frame.setSize(SUN_VIEWER_SIZE);
		frame.setTitle("I see A Sun!");
		
		frame.add(new SunComponent());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}