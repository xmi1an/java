import java.io.*;
import java.util.*;

class java35 {
	String alphaOrder(String str) {
		char[] charArray = str.toCharArray();
		Arrays.sort(charArray);
		String aString = new String(charArray);
		return aString;
	}

	public static void main(String[] args) throws IOException {
		System.out.println("Enter the String->");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputString = br.readLine();
		Alphabatic obj = new Alphabatic();
		String alphaString = obj.alphaOrder(inputString);
		System.out.println("String in the Alphabetic Order :" + alphaString);
	}
}