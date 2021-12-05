import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class GraphicsDemo extends Applet	{
	public void paint(Graphics g) {
		
		g.setColor(Color.blue);
		g.drawRect(70, 30, 100, 100);
		
		g.setColor(Color.red);
		g.drawString("Hello Applet", 85, 85);
		
	}
}

// <applet code="GraphicsDemo.class" width="300" height="300">
// </applet>