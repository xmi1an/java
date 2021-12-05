import java.awt.*;

public class AWTExample1 extends Frame {
    public AWTExample1() {
        super("AWT Example 1");
        setSize(300, 200);
        setVisible(true);
        setBackground(Color.red);
        setLayout(new FlowLayout(5, 5, 5));
        add(new Button("Button 1"));

    }

    public static void main(String[] args) {
        AWTExample1 frame = new AWTExample1();
    }

}