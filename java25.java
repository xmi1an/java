class Super
{
	final int x;
	Super(final int a)
	{
		x=a;
	}
	
	final void display()
	{
		System.out.println("Super x:"+x);				
	}
}

class Sub
{
	int y;
	Sub(int a,int b)	
	{
		super(x);
		y=b;
	}
	void display()//Display method must not override in the subclass of superclass.
	{	
		System.out.println("Super x:"+x);
		System.out.println("Sub y:"+y);	
	}
}

class java25
{
	public static void  main(String args[])
	{
		Sub s1=new Sub(100,300);
		s1.display(); 
	}
}

