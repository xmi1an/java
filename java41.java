class java41
{
	public static void main(String args[])
	{
		int a[]={5,10};
		int b=5;

		try
		{
			int x=a[2]/a[0]-b;
		}
		catch(ArithmeticException e)
		{
			System.out.println("The number cannot divide by zero");	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array index error");	
		}
		catch(ArrayStoreException e)
		{
			System.out.println("The wrong data type");	
		}
		int y=a[1]/a[0];
		System.out.println("The division of y is:"+y);
	}
}
				