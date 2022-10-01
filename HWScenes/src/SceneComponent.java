import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class SceneComponent extends JComponent
{
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 =  (Graphics2D) g;
		
		g2.setPaint(Color.BLUE);
		g2.fillRect(0, 0, 750, 350);
		g2.drawRect(0, 0, 750, 350);
		
		g2.setPaint(Color.green);
		g2.fillRect(0, 350, 750, 250);
		g2.drawRect(0, 350, 750, 250);
		
//draw suns
		Sun s = new Sun();
		s.drawOn(g2);
		
//draw houses
		House house = new House(25, 50, Color.RED);
		
		g2.translate(0,400);
//		house.drawOn(g2);
//		g2.translate(150,0);
//		house.drawOn(g2);
		
		for (int c =150,i=1;i<=5;i++)
		{	
			house.drawOn(g2);
			g2.translate(c, 0);
			
		}
		
		PineTree small_pt = new PineTree(-100, -75, 10, 40);
		
		for (int c =25,i=1;i<=25;i++)
		{
			small_pt.drawOn(g2);
			g2.translate(-c,0);
		}
		
		PineTree big_pt = new PineTree(-100,-60, 20, 80);
		g2.translate(50, 0);
		for (int c =35,i=1;i<=15;i++)
		{
			big_pt.drawOn(g2);
			g2.translate(c,0);
		}
		big_pt.drawOn(g2);
	}
}

