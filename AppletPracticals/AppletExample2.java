import java.applet.*;
import java.awt.*;

@SuppressWarnings("deprecation")

public class AppletExample2 extends Applet {
    Label l1, l2;
    TextField t1, t2;
    Button b1;

    public void init() {
        l1 = new Label("Enter your name");
        l2 = new Label("Enter your age");
        t1 = new TextField(10);
        t2 = new TextField(10);
        b1 = new Button("Submit");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(b1);
    }

    public boolean action(Event evt, Object arg) {
        if (evt.target == b1) {
            String name = t1.getText();
            String age = t2.getText();
            showStatus("Name: " + name + " Age: " + age);
        }
        return true;
    }
}
