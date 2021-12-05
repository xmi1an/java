import java.util.Scanner;
class java8
{
	public static void main(String args[])
	{
		int no,i,flag=0;
		Scanner in=new Scanner(System.in);
		System.out.println("Enetr the no:");
		no=in.nextInt();

		for(i=2;i<=no/2;i++)
		{
			if(no%i==0)
			{
				flag=1;
				break;
			}
		}
		
		if(flag==0)
		{
			System.out.print("no is prime");
		}
		else
		{
			System.out.print("no is not prime");
		}		
	}
}