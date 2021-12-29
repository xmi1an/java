class Super {
	int x;

	Super(int a) {
		x = a;
	}

	void display() {
		System.out.println("Super x:" + x);
	}
}

class Sub extends Super {
	int y;

	Sub(int a, int b) {
		super(a);
		y = b;
	}

	void display() {
		System.out.println("Super x:" + x);
		System.out.println("Sub y:" + y);
	}
}

class java24 {
	public static void main(String args[]) {
		Sub s1 = new Sub(100, 200);
		s1.display();
	}
}
