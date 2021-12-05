import java.util.Scanner;
class sum10
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
			sum=sum+a;
			a++;
		}
		System.out.println("Sum is:"+sum);
	}
}