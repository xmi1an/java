import java.util.Scanner;
class java7
{
	public static void main(String args[])
	{
		int no,i,a=1;
		float sum=0;
		Scanner in=new Scanner(System.in);

		System.out.println("Enter no:");
		no=in.nextInt();
		
		for(i=1;i<=no;i++)
		{
			System.out.print(i+"+"+a+"/");
			sum=sum+1.0f/i;
		}
		System.out.println("Sum is:"+sum);
	}
}