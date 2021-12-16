import java.applet.Applet;
import java.awt.Graphics;

public class java47 extends Applet {
    public void paint(Graphics g) {
        String str = getParameter("msg");
        g.drawString(str, 50, 50);
    }
}

// <applet code="java47.class" width="400" height="400">
// <param name="msg" value="Welcome to applet">
// </applet>