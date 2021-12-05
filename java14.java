import java.util.Scanner;
class empsalary
{	
	
	String name;
	int id,salary,t,p,h;
	Scanner in=new Scanner(System.in);		
	void heading()
	{
		String s="Employee Salary Sleep";	
		System.out.println("\t\t"+s);
	}
	void underline()
	{
		System.out.println("--------------------------------------------------------------");
	}
		
	void getdata()
	{
		System.out.println("Enter emp name:");
		name=in.nextLine();
		
		System.out.println("Enter emp ID:");
		id=in.nextInt();

		System.out.println("Enter emp salary:");
		salary=in.nextInt();			
	}
	
	void pflogic()
	{
		int pf=5;
		p=salary*pf/100;
		System.out.println("\t\tEmployee salary pf is:"+p);
	}
	
	void tddalogic()
	{
		int td=10;
		t=salary*td/100;
		System.out.println("\t\tEmployee salary tdda is:"+t);
	}

	void hralogic()
	{
		int hr=12;
		h=salary*hr/100;
		System.out.println("\t\tEmployee salary hra is:"+h);
	}

	void totalsalary()
	{
		int total;
		total=salary-p+t+h;
		System.out.println("The total salary of employee is:"+total);
	}
	void alldisplay()
	{
		System.out.println("\t\tEmployee id:"+id);
		System.out.println("\t\tEmployee name:"+name);
		System.out.println("\t\tEmployee salary:"+salary);
	}
	void nesting()
	{
		underline();
		heading();
		underline();
		getdata();
		heading();
		underline();
		alldisplay();
		pflogic();
		tddalogic();
		hralogic();
		underline();
		underline();
		totalsalary();
		underline();
	}
}


class java14
{
	public static void main(String args[])
	{
		empsalary emp1=new empsalary();
		empsalary emp2=new empsalary();	
		empsalary emp3=new empsalary();
		emp1.nesting();
		emp2.nesting();
		emp3.nesting();
	}
}