import java.lang.*;
class java31
{
	public static void main(String args[])
	{
		String s1="Java";

		String s2="Progrmming Language";
		String s3,s4;
		int s,n=2;
	
		s3=s1.toLowerCase();
		System.out.println(s3);
	  
		s3=s2.toUpperCase();
		System.out.println(s3);
			
		s=s2.length();
		System.out.println(s);

		s4=s3.replace("s1","s2");
		System.out.println(s4);

		s3=s1.trim();
		System.out.println(s3);

		s4=s1.concat(s2);
		System.out.println(s4);

		s4=s1.toString();
		System.out.println(s4);
		
		s4=s2.substring(2);
		System.out.println(s4);

		s4=s2.substring(2,4);
		System.out.println(s4);
		
		if(s1.equals(s2))
		{
			System.out.println("s1 equal to s2");
		}		
		else
		{
			System.out.println("s1 not equal s2");
		}
		
		if ( s1.equalsIgnoreCase(s2) )
		{ 
  			System.out.println("s2 strings are equal"); 
		}
		else
		{
  			System.out.println("s2 Strings are not equal");
		}

		if (s1.compareTo(s2)>0)
		{	 
  			System.out.println("s2 string is alphabetically greater"); 
		}
		else
		{
  			System.out.println("s2 string is alphabetically lesser");
		}

		String str= "car insurance";
		System.out.println( str.indexOf("u") );

	}		
}	