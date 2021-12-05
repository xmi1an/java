import java.util.Scanner;
class java12
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i;
		int n[]=new int[10];
		
		System.out.println("Enter the element of an array:- ");
		n=in.nextInt();
		
		for(i=1;i<=10;i++)
		{
			System.out.println(n[i]);
		}
	}
}
