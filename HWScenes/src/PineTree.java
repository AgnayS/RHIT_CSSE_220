import java.awt.Color;
import java.awt.Graphics2D;

public class PineTree 
{

	private Color color;
	private int x,y,width,height;
	
	public PineTree(int x, int y, int w, int h) {
		this.x=x;
		this.y=y;
		this.width=w;
		this.height = h;
	}

	public void drawOn(Graphics2D g2) 
	{
		Color brown = new Color(145, 112, 33);
	    Color green = new Color(40, 135, 22);
	    
	    int xc[] = {x,x+(width/2),x+width};
	      int yc[]={y+((2*height)/3),y,y+((2*height)/3)};
	      
	    
	      g2.setPaint(green);
		  g2.fillPolygon(xc,yc,3);
	      g2.drawPolygon(xc,yc,3);
	      
	      
		g2.setPaint(brown);
		
		g2.drawRect(x+width/3, y+(2*height)/3, width/3, height/3);
		
		g2.fillRect(x+width/3, y+(2*height)/3, width/3, height/3);
		
		
	}
}
