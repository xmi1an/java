class overloading
{
	int x,y;
	void mul(int a)
	{
		x=a;
		System.out.println("The number is:"+x);
	}
	void mul(int a,int b)
	{
		x=a;
		y=b;
		System.out.println("The numbers are:"+a+"  and  "+b);			
	}
}	
class java17
{
	public static void main(String args[])
	{
		overloading o1=new overloading();
		o1.mul(4);
		o1.mul(5,6);	
	}
}