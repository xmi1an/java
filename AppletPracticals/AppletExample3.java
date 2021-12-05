import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class AppletExample3 extends Applet implements ActionListener {
    TextField t1 = new TextField(10);
    TextField t2 = new TextField(10);

    Label l1 = new Label("First No : ");
    Label l2 = new Label("Second No : ");
    Label l3 = new Label("Sum : ");
    Label sum = new Label();

    Button b = new Button("Add");

    public void init() {
        setLayout(new FlowLayout());
        // Set Background Color
        setBackground(Color.cyan);

        // Set Font Size
        l1.setFont(new Font("Arial", Font.BOLD, 20));
        l2.setFont(new Font("Arial", Font.BOLD, 20));
        l3.setFont(new Font("Arial", Font.BOLD, 20));
        sum.setFont(new Font("Arial", Font.BOLD, 20));
        add(l1);
        add(t1);

        add(l2);
        add(t2);

        add(l3);

        add(sum);

        add(b);
        b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b) {
            int n1 = Integer.parseInt(t1.getText());
            int n2 = Integer.parseInt(t2.getText());
            sum.setText(" " + (n1 + n2));
        }
    }
}

// <applet code="AppletExample3.class" width="700" height="300"></applet>
// created by:
