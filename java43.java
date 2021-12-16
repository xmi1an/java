class java43 {
	public static void main(String args[]) {
		int a[] = { 10, 10 };
		int b = 10, c = 5;
		try {
			if (b != c) {
				try {
					int x = a[2] / b - a[1];
				} catch (ArithmeticException e) {
					System.out.println("The number is cannot divide");
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("The Array index errors occur");
				}
			}
		} catch (ArithmeticException e) {
			System.out.println("The number is cannot divide");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("The Array index error");
		} finally {
			int y = a[1] / (b - c);
			System.out.println("The answer:" + y);
		}

	}
}
