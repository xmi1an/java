import java.util.Scanner;
class nesting
{
	Scanner in=new Scanner(System.in);
	int a,b;
	void getdata()
	{
		System.out.println("Enter first value:-");
		a=in.nextInt();

		System.out.println("Enter second value:-");
		b=in.nextInt();
	}	
	
	void putdata()
	{
		int sum;
		sum=a+b;
		System.out.println("The sum is:-"+sum);
	}

	void nestingmethod()
	{
		getdata();
		putdata();
	}
}

class java16
{
	public static void main(String args[])
	{
		nesting n1=new nesting();
		n1.nestingmethod();	
	}
}