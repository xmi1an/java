import java.util.Scanner;
class factorial
{
 int fact=1,no,i;
 void getdata()
 {
  Scanner in=new Scanner(System.in);
  System.out.print("Enter no for find factorial:");
  no=in.nextInt();
 }
 void findarea()
 {
  for(i=1;i<=no;i++)
  fact=fact*i;
  System.out.println("Factorial of given no is:"+fact);
 }  
}
class java2
{
 public static void main(String args[])
 {
  factorial f1=new factorial();
  f1.getdata();
  f1.findarea();
 } 
}