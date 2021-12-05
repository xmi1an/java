import java.util.Scanner;
class java6
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int no,i,a,sum=0;

		System.out.println("Enter the no:");
		no=in.nextInt();
	
		while(no!=0)
		{
			a=no%10;
			no=no/10;
			sum=sum+a;
		}
		System.out.println("Sum of the digit is:"+sum);
		
	}
	
}