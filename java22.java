import java.util.Scanner;
class ClassA
{
	Scanner in=new Scanner(System.in);
	String sname;
	int rno;

	void getdata()
	{
		System.out.println("Enter Student Name:");
		sname=in.nextLine();

		System.out.println("Enter Student Rno:");
		rno=in.nextInt();				
	}

}

class ClassB extends ClassA
{
	int marks;
	
	void total()
	{
		System.out.println("Enter Student marks:");
		marks=in.nextInt();
	}
}

class ClassC extends ClassB
{
	int sw;
	
	void extra()
	{
	
		System.out.println("Enter Student Sport weightage:");
		sw=in.nextInt();
	}
}

class java22
{
	public static void main(String args[])
	{
		ClassC c1=new ClassC();
		c1.getdata();
		c1.total();	
		c1.extra();	
	}
}