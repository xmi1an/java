class A extends Thread
{
	public void run()
	{
		System.out.println("ThreadA Started");
		for(int i=1;i<=4;i++)
		{
			System.out.println("\tFrom ThreadA  :  i="+i);
		}
		System.out.println("Exit from A");
	}
}

class B extends Thread
{
	public void run()
	{
		System.out.println("ThreadB Started");
		for(int j=1;j<=4;j++)
		{
			System.out.println("\tFrom ThreadB  :  j="+j);
		}
		System.out.println("Exit from B");
	}
}

class C extends Thread
{
	public void run()
	{
		System.out.println("ThreadC Started");
		for(int k=1;k<=4;k++)
		{
			System.out.println("\tFrom ThreadC  :  k="+k);
		}
		System.out.println("Exit from C");
	}
}
class java38
{
	public static void main(String args[])
	{
		
		A threadA=new A();
		B threadB=new B();
		C threadC=new C();

		threadC.setPriority(Thread.MAX_PRIORITY);
		threadB.setPriority(threadA.getPriority()+1);
		threadA.setPriority(Thread.MIN_PRIORITY);

		System.out.println("Start Thread A");
		threadA.start();

		System.out.println("Start Thread B");
		threadB.start();

		System.out.println("Start Thread C");
		threadC.start();

		System.out.println("End of main Thread");
	}
}