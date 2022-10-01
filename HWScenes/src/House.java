import java.awt.Color;
import java.awt.Graphics2D;

public class House {
	private static final int HEIGHT = 50;
	private static final int WIDTH = 100;
	private static final int ROOF_HEIGHT = 20;

	private Color color;
	int x,y;
	
	public House(int x, int y, Color color) {
		this.x=x;
		this.y=y;
		this.color=color;
	}

	public void drawOn(Graphics2D g2) 
	{
		g2.setPaint(color);
		g2.fillRect(x, y, WIDTH, HEIGHT);
		g2.drawRect(x, y, WIDTH, HEIGHT);
		int xc[] = {x,x+(WIDTH)/2,x+WIDTH};
		int yc[] = {y,y-ROOF_HEIGHT,y};
		
		g2.drawPolygon(xc,yc,3);
		
		// TODO: Draw the house body (a rectangle) and the roof (3 lines or a
		// Polygon)
	}

}
