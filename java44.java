import java.lang.Exception;
class MyException extends Exception
{
	MyException(String message)
	{
		super(message);
	}
}
class java44
{
	public static void main(String args[])
	{
		int b=500,c=10;

		try
		{
			float z=(float)c/(float)b;
			if(z<0.05)
			{
				throw new MyException("Number is too small");
			}
		}
		catch(MyException e)
		{
			System.out.println("Caught my exception");
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("I am always here...........");
		}
	}
}