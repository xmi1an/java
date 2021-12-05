interface Area
{
	final static float pi=3.14f;
	float compute(float x,float y);
}

class Rectangle implements Area
{
	public float compute(float x,float y)
	{
		return(x*y);
	}
}

class Circle implements Area
{
	public float compute(float x,float y)
	{
		return(pi*x*x);
	}
}

class java27
{
	public static void main(String args[])
	{
		Rectangle r1=new Rectangle();
		Circle c1=new Circle();
		
		Area a1;
		
		a1=r1;
		System.out.println("Area of Rectangle:"+a1.compute(10,20));

		a1=c1;
		System.out.println("Area of Circle:"+a1.compute(10,0));
	}
}
