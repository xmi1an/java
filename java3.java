import java.util.Scanner;
class java3
{
	public static void main(String args[])
	{
		int no1,no2;
		Scanner in=new Scanner(System.in);

		System.out.println("Enter no1:");
		no1=in.nextInt();

		System.out.println("Enter no2:");
		no2=in.nextInt();
		if(no1>no2)
		{
			System.out.println("no1 is larger");
		}
		else
		{
			System.out.println("no2 is larger");
		}
	}
}