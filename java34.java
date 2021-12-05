import java.io.*;

class java34

{

	public static void main(String as[]) throws Exception

	{

		InputStreamReader isr=new InputStreamReader(System.in);

		BufferedReader br=new BufferedReader(isr);

		int i=0,count=0;

		String text="",s="";

		System.out.println("Enter Text:(press ENTER twice to stop)\n");

		s=br.readLine();

		while(s.length()!=0)

		{

			text+=s;

			s=br.readLine();

		}

		System.out.println("Enter search word:");

		s=br.readLine();

		while(true)

		{

			i=text.indexOf(s,i);

			if(i==-1) break;

			System.out.println("Word found at position:"+i);

			count++;

			i+=s.length();

		}

		System.out.println("Number of occurrences of given word:"+count);

	}

}
