class java42
{
	public static void main(String args[])
	{
		int a[]={10,10};
		int b=10;

		try
		{
			int x=a[0]/b-a[2];
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Number cannot divide by zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index Out Of Bound Error");
		}
		finally
		{
			int y=a[0]/a[1];
			System.out.println("Answer:"+y);
		}
	}
}