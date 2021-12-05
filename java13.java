import java.util.Scanner;
class Student
{
	int java,se,ec,net,t;
	float per;
	String result,grd;
	void getmarks()
	{
		Scanner in=new Scanner(System.in);

		System.out.println("Enter the java marks:");
		java=in.nextInt();

		System.out.println("Enter the software engineering marks:");
		se=in.nextInt();

		System.out.println("Enter the e-commerce marks:");
		ec=in.nextInt();

		System.out.println("Enter the net framework marks:");
		net=in.nextInt();
	}
	void total()
	{
		t=java+se+ec+net;
		System.out.println("From Total 400 get:"+t);
	}

	void percentage()
	{
		per=t/4;
		System.out.println("Percentage:"+per);
	}

	void result()
	{
		if(java<35 || se<35 || ec<35 || net<35)
		{
			System.out.println(result="Fail");
		}
		else
		{
			System.out.println(result="Pass");
		}
	}
	
	void grade()
	{
		if(result=="Pass")
		{
			if(per>=70.0 || per<=100.0)
			{
				System.out.println("Student Grade:A");	
			}
			else if(per>=60.0 || per<70.0)
			{
				System.out.println("Student Grade:B");
			}
			else if(per>=50.0 || per<60.0)
			{
				System.out.println("Student Grade:C");
			}
			else if(per>=40.0 || per<50.0)
			{
				System.out.println("Student Grade:D");
			}
			else if(per>=35.0 || per<40.0)
			{
				System.out.println("Student Grade:E");
			}
		}
		else
		{
			System.out.println("Student Grade:E");		
		}	
	}
}
class java13
{
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.getmarks();
		s1.total();
		s1.percentage();
		s1.result();
		s1.grade();
	}
} 
		
		
			