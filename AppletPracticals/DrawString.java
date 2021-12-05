import java.applet.Applet;
import java.awt.Graphics;

public class DrawString extends Applet {

  public void paint(Graphics g) {
    g.drawString("welcome to applet", 150, 150);
  }

}

/*
 * <applet code="DrawString.class" width="600" height="300">
 * </applet>
 */