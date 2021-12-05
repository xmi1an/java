import java.util.Scanner;
class java5
{
	public static void main(String args[])
	{
		int choice;
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter choice:");
		choice=in.nextInt();

		switch(choice)
		{
			case 1:	System.out.println("This is chocie 1");
				break;

			case 2:	System.out.println("This is chocie 2");
				break;

			case 3:	System.out.println("This is chocie 3");
				break;

			case 4:	System.out.println("This is chocie 4");
				break;

			case 5:	System.out.println("This is chocie 5");
				break;

			default:	System.out.println("Please enter right choice");
		}
	}
}