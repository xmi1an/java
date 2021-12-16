import java.util.*;

public class java32n {
    public static void main(String[] args) {
        Vector v1 = new Vector();

        v1.add(1);
        v1.add(2);
        v1.add("Java");
        v1.add(3);
        v1.remove(3);
        v1.addElement("Last Element");
        v1.insertElementAt("First Element", 0);

        System.out.println("Vector v1 is " + v1);
        System.out.println("The element at 2nd index : " + v1.elementAt(2));
        System.out.println("The capacity is: " + v1.capacity());
    }
}