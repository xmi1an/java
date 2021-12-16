import java.util.*;

class java32 {
	public static void main(String args[]) {
		Vector list = new Vector();
		String str = "COBOL";
		int length = str.length();

		for (int i = 1; i < length; i++) {
			list.addElement(args[i]);
		}

		list.insertElementAt(str, 2);
		int size = list.size();

		String listArray[] = new String[size];
		list.copyInto(listArray);

		System.out.println("The list of languages");

		for (int i = 0; i < size; i++) {
			System.out.println(listArray[i]);
		}
	}
}
