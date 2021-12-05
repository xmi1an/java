class java40
{
	public static void main(String args[])
	{
		int a=10,b=5,c=5,x,y;

		try
		{
			x=a/(b-c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("The number cannot divide by zero");
		}
		y=a/(b+c);
		System.out.println("The answer is:"+y);
	}
} 