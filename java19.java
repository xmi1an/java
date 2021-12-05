class pconstructor 
{
	pconstructor(int x,int y)
	{
		System.out.println("Hi! I am parameterized constructor");
		int a,b,c;

		a=x;
		b=y;

		c=a+b;

		System.out.println("The sum is:"+c);		
	}
}

class java19
{
	public static void main(String args[])
	{
		pconstructor p1=new pconstructor(10,20);
	}
}