import java.util.Scanner;
class Singleinheritance
{
	Scanner in=new Scanner(System.in);
	String sname,hobby,sem;
	int rno;

	void student()
	{
		System.out.println("Enter Student Name:");
		sname=in.nextLine();

		System.out.println("Enter Student Hoby:");
		hobby=in.nextLine();

		System.out.println("Enter Student Semester:");
		sem=in.nextLine();

		System.out.println("Enter Student Rno:");
		rno=in.nextInt();				
	}

}

class Sports extends Singleinheritance
{
	int sw;
	
	void extra()
	{
	
		System.out.println("Enter Student Sport weightage:");
		sw=in.nextInt();
	}
}

class java21
{
	public static void main(String args[])
	{
		Sports s1=new Sports();
		s1.student();	
		s1.extra();	
	}
}