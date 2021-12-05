class oconstructor 
{
	oconstructor()
	{
		System.out.println("Hi! I am default constructor");	
	}

	oconstructor(int x)
	{
		int a=x;
		int b;
		b=a*a;
		System.out.println("The return value from single arg constructor:"+b);
		
	}

	oconstructor(int p,int q)
	{
		int j,k,s;
		j=p;k=q;
		s=j*k;
		System.out.println("The return value from double args constructor:"+s);
	}
}

class java20

{
	public static void main(String args[])
	{
		oconstructor o1=new oconstructor();
		oconstructor o2=new oconstructor(4);
		oconstructor o3=new oconstructor(4,5);
	}
}