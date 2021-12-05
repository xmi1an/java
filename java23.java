import java.util.Scanner;
class Grandfather
{
	Scanner in=new Scanner(System.in);
	String gfname;

	void gf()
	{
		System.out.println("Hii! This is grand father class");
		
		System.out.println("Enter GrandFather's Name:");
		gfname=in.nextLine();				
	}

}

class Father extends Grandfather 
{
	String fname;
	
	void father()
	{
		System.out.println("Hii! This is father class from Grandfather class");

		System.out.println("Enter Father's Name:");
		fname=in.nextLine();	
	}
}

class Uncle extends Grandfather
{
	String uname;
	
	void uncle()
	{
		System.out.println("Hii! This is uncle class from Grandfather class");

		System.out.println("Enter Uncle's Name:");
		uname=in.nextLine();	
	}
}

class Son extends Father
{
	String sname;
	
	void son()
	{
		System.out.println("Hii! This is Son class from Father class");

		System.out.println("Enter Son's Name:");
		sname=in.nextLine();	
	}
}


class Daughter extends Uncle
{
	String dname;
	
	void daughter()
	{
		System.out.println("Hii! This is Daughter class from Uncle class");

		System.out.println("Enter Daughter's Name:");
		dname=in.nextLine();	
	}
}

class java23
{
	public static void main(String args[])
	{
		Son s1=new Son();
		s1.gf();
		s1.father();
		s1.son();
		Daughter d1=new Daughter();	
		d1.gf();
		d1.uncle();
		d1.daughter();
	}
}