import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;


public class Sun {
	
	//Final dimensions declared below
	
	private static final Color BORDER_COLOR = Color.BLACK;
	private static final int NUMBER_OF_RAYS = 8; 
	private static final double RAY_LENGTH_SCALE = 0.5; 
	private static final double RAY_WIDTH_SCALE = 0.1;
	private static final double RAY_DISTANCE_FROM_SUN_SCALE = .2;
	private static final double DEFAULT_SUN_DIAMETER = 100.0;
	private static final double DEFAULT_SUN_X = 100.0; 
	private static final double DEFAULT_SUN_Y = 100.0; 
	private static final Color DEFAULT_SUN_COLOR =Color.YELLOW;

//instance variables to be changed at method call
	private double Sun_Diameter ;
	private double Sun_X;
	private double Sun_Y;
	private Color Sun_colour;

	public Sun() {
		this.Sun_Diameter = DEFAULT_SUN_DIAMETER;
		this.Sun_X = DEFAULT_SUN_X;
		this.Sun_Y = DEFAULT_SUN_Y;
		this.Sun_colour = DEFAULT_SUN_COLOR;

	}	

	public Sun(double x, double y, Color color, double diameter) {

		this.Sun_Diameter = diameter;
		this.Sun_X = x;
		this.Sun_Y = y;
		this.Sun_colour = color;
	}

	

	public void drawOn(Graphics2D g2) {

		Ellipse2D sun = new Ellipse2D.Double(Sun_X, Sun_Y,Sun_Diameter, Sun_Diameter);
		g2.setPaint(Sun_colour);
		g2.draw(sun);
		g2.fill(sun);
		

		Rectangle.Double ray = new Rectangle.Double( Sun_X+(Sun_Diameter*RAY_DISTANCE_FROM_SUN_SCALE)+Sun_Diameter, Sun_Y+(Sun_Diameter/2)-((Sun_Diameter*RAY_WIDTH_SCALE)/2) ,Sun_Diameter*RAY_LENGTH_SCALE, Sun_Diameter*RAY_WIDTH_SCALE);
		g2.draw(ray);
		g2.fill(ray);
		

		g2.setPaint(BORDER_COLOR);
		g2.draw(sun);
		g2.draw(ray);

		
		for(int i = 0; i<=360;i+=360/NUMBER_OF_RAYS) {
			g2.rotate(Math.toRadians(i), Sun_X+(Sun_Diameter/2), Sun_Y+(Sun_Diameter/2));
			g2.setPaint(Sun_colour);
			g2.fill(ray);
			g2.draw(ray);
			g2.setPaint(BORDER_COLOR);
			g2.draw(sun);
			g2.draw(ray);
		}
		
		g2.rotate(Math.toRadians(-180), Sun_X+(Sun_Diameter/2), Sun_Y+(Sun_Diameter/2));
		
	}

}