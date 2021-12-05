import java.util.Scanner;
class areacircle
{
	int r;
	void getdata()
	{
		Scanner in=new Scanner(System.in);
		System.out.print("Enter radius:");
		r=in.nextInt();
	}
	void findarea()
	{
		double area,PI=3.14;
		area=PI*r*r;
		System.out.println("Area of circle is:"+area);
	} 	
}
class java1
{
	public static void main(String args[])
	{
		areacircle c1=new areacircle();
		c1.getdata();
		c1.findarea();
	}
}

