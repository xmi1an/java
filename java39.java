class X implements Runnable
{
	public void run()
	{
		System.out.println("ThreadC Started");
		for(int i=1;i<=10;i++)
		{
			System.out.println("\tThreadX  :   "+i);
		}
		System.out.println("End of ThreadX");
	}
}
class java39
{
	public static void main(String args[])
	{
		X runnable=new X();
		Thread threadX=new Thread(runnable);
		threadX.start();
		System.out.println("End of main Thread");
	}
}