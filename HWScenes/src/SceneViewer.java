import java.awt.Dimension;

import javax.swing.JFrame;

public class SceneViewer {

	public static void main(String[] args)
	{
		final Dimension SCENE_VIEWER_SIZE = new Dimension(750, 600);
		

			JFrame frame = new JFrame();

			frame.setSize(SCENE_VIEWER_SIZE);
			frame.setTitle("The final scene!");
			frame.add(new SceneComponent());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setVisible(true);

	}

}
