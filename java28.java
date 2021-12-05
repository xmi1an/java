class Student
{
	int rno;
	
	void getno(int n)
	{
		rno=n;
	}
	void putno()
	{
		System.out.println("Roll no:"+rno);
	}
}

class Test extends Student
{
	float part1,part2;
	
	void getmarks(float f1,float f2)
	{
		part1=f1;
		part2=f2;
	}
	
	void putmarks()
	{
		System.out.println("Marks Obtained");
		System.out.println("Marks part 1:"+part1);
		System.out.println("Marks part 2:"+part2);
	}
}

interface Sports
{
	float spwt=6.0f;
	void putwt();
}

class Result extends Test implements Sports
{
 	float total;
	
	public void putwt()
	{
		System.out.println("Sports weight:"+spwt);
	}
	
	void display()
	{
		total=part1+part2+spwt;

		putno();
		putmarks();
		putwt();

		System.out.println("Total is:"+total);	
	}
}

class java28
{
	public static void main(String args[])
	{
		Result s1=new Result();
		s1.getno(120);
		s1.getmarks(50.50f,60.60f);
		s1.display();		
	}
}

