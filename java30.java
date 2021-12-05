import java.util.Scanner;
class java30
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		double x,z=30;
		
		System.out.println("Enter value:");
		x=in.nextDouble();

		double s=Math.sin(x);
		System.out.println("The sin function return value is:"+s);

		double c=Math.cos(x);
		System.out.println("The cos function return value is:"+c);

		double rt=Math.sqrt(x);
		System.out.println("The sqrt function return value is:"+rt);
	
		double t=Math.tan(x);
		System.out.println("The tan function return value is:"+t);

		double p=Math.pow(x,z);
		System.out.println("The pow function return value is:"+p);

		
		double at2=Math.atan2(x,z);
		System.out.println("The atan2 function return value is:"+at2);

		
		double a=Math.atan(z);
		System.out.println("The atan function return value is:"+a);
	
		
		double m=Math.max(x,z);
		System.out.println("The max function return value is:"+m);

		double mn=Math.min(x,z);
		System.out.println("The min function return value is:"+mn);

		double l=Math.log(x);
		System.out.println("The log function return value is:"+l);

		double f=Math.floor(x);
		System.out.println("The floor function return value is:"+f);

		double e=Math.exp(x);
		System.out.println("The exp function return value is:"+e);
		
		double ab=Math.abs(x);
		System.out.println("The abs function return value is:"+ab);

		double r=Math.round(x);
		System.out.println("The round function return value is:"+r);

		double cl=Math.ceil(x);
		System.out.println("The ceil function return value is:"+cl);
		
	}
}