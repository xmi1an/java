import java.util.Scanner;
class java12
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		int i,j,element,temp,no;
		int arr[]=new int[10];
		
		System.out.println("Enter the number of an array:- ");
		no=in.nextInt();
		
		for(i=1;i<=no;i++)
		{
			System.out.println("Enter the element:");
			arr[i]=in.nextInt();
		}

		for(i=1;i<=no;i++)
    		{
     			   for(j=i;j<=no;j++)
     			   {
         				   if(arr[i] > arr[j])
           				 {
              					 temp=arr[i];
               					 arr[i]=arr[j];
               					 arr[j]=temp;
      			  	}
        			   }
    		}
		System.out.println("Sorted list in ascending order:");
		 for(i=1;i<=no;i++)
		{
			System.out.println(arr[i]);
		}
			
	}
}
