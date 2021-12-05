import java.util.Scanner;
class java4
{
	public static void main(String args[])
	{
		int a,b,c;
		
		Scanner in=new Scanner(System.in);

		System.out.println("Enter value of a:");
		a=in.nextInt();

		System.out.println("Enter value of b:");
		b=in.nextInt();

		System.out.println("Enter value of c:");
		c=in.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("value of a is larger");
			}
			else
			{
				System.out.println("value of c is larger");
			}
		}
		else
		{
			if(b>c)
			{
				System.out.println("value of b is larger");
			}
			else
			{
				System.out.println("value of c is larger");
			}
		}
	}
}	
	