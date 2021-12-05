import java.util.Scanner;
class java10
{
	public static void main(String args[])
	{
		int no,i;
		Scanner in=new Scanner(System.in);
		System.out.println("Enetr the no:");
		no=in.nextInt();

		for(i=1;i<=no;i++)
		{
			if(i==11)
			{
				continue;
			}
			System.out.println(i);
		}
	}
}