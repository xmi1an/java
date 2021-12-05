import java.util.Scanner;
class java9
{
	public static void main(String args[])
	{
		int no,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enetr the no:");
		no=in.nextInt();

		for(i=1;i<=no;i++)
		{
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}
	}
}