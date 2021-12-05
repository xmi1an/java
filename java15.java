import java.util.Scanner;
class staticmembers
{
	static String sem="Semester 5";
	String name;
	int rno;
	void rno()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter rollno:-");
		rno=in.nextInt();
	}
	
}
class java15
{
	public static void main(String args[])
	{
		staticmembers s1=new staticmembers();
		s1.rno();
		String a=staticmembers.sem;
		System.out.println("Your semester of BCA is:-"+a);
	}	
}
