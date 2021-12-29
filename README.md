## 1. Write a Java Program find the area of circle.

```java
import java.util.Scanner;
class areacircle {
int r;

    void getdata() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius:");
        r = in.nextInt();
    }

    void findarea() {
        double area, PI = 3.14;
        area = PI * r * r;
        System.out.println("Area of circle is:" + area);
    }

}

class java1 {
public static void main(String args[]) {
areacircle c1 = new areacircle();
c1.getdata();
c1.findarea();
  }
}
```

## 2. Write a Java Program that will display factorial of the given number.

```java
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
fact=fact\*i;
System.out.println("Factorial of given no is:"+fact);
}
}

class java2 {
public static void main(String args[]) {
factorial f1 = new factorial();
f1.getdata();
f1.findarea();
}
}
```

## 3. Write a Java Program that will find the largest no from the given two nos.

```java
import java.util.Scanner;
class java3
{
public static void main(String args[])
{
int no1,no2;
Scanner in=new Scanner(System.in);

    	System.out.println("Enter no1:");
    	no1=in.nextInt();

    	System.out.println("Enter no2:");
    	no2=in.nextInt();
    	if(no1>no2)
    	{
    		System.out.println("no1 is larger");
    	}
    	else
    	{
    		System.out.println("no2 is larger");
    	}
    }

}
```

## 4. Write a Java Program that will find the largest no from the given three nos.

```java
import java.util.Scanner;
class java4 {
public static void main(String args[]) {
int a, b, c;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter value of a:");
        a = in.nextInt();

        System.out.println("Enter value of b:");
        b = in.nextInt();

        System.out.println("Enter value of c:");
        c = in.nextInt();
        if (a > b) {
            if (a > c) {
                System.out.println("value of a is larger");
            } else {
                System.out.println("value of c is larger");
            }
        } else {
            if (b > c) {
                System.out.println("value of b is larger");
            } else {
                System.out.println("value of c is larger");
            }
        }
    }

}
```

## 5. Write a Java Program that shows the use of switch Statement.

```java
import java.util.Scanner;
class java5
{
public static void main(String args[])
{
int choice;
Scanner in=new Scanner(System.in);
System.out.println("Enter choice:");
choice=in.nextInt();

    	switch(choice)
    	{
    		case 1:	System.out.println("This is chocie 1");
    			break;

    		case 2:	System.out.println("This is chocie 2");
    			break;

    		case 3:	System.out.println("This is chocie 3");
    			break;

    		case 4:	System.out.println("This is chocie 4");
    			break;

    		case 5:	System.out.println("This is chocie 5");
    			break;

    		default:	System.out.println("Please enter right choice");
    	}
    }

}
```

## 6. Write a Java Program to find the sum of the digits of given number.

```java
import java.util.Scanner;
class java6 {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int no, i, a, sum = 0;

        System.out.println("Enter the no:");
        no = in.nextInt();

        while (no != 0) {
            a = no % 10;
            no = no / 10;
            sum = sum + a;
        }
        System.out.println("Sum of the digit is:" + sum);

    }

}
```

## 7. Write a Java Program that will display the Sum of 1+1/2+1/3.....+1/n.

```java
import java.util.Scanner;
class java7 {
public static void main(String args[]) {
int no, i, a = 1;
float sum = 0;
Scanner in = new Scanner(System.in);
        System.out.println("Enter no:");
        no = in.nextInt();

        for (i = 1; i <= no; i++) {
            System.out.print(i + "+" + a + "/");
            sum = sum + 1.0f / i;
        }
        System.out.println("Sum is:" + sum);
    }

}
```

## 8. Write a Java Program that check weather the given no is prime or not.

```java
import java.util.Scanner;
class java8
{
public static void main(String args[])
{
int no,i,flag=0;
Scanner in=new Scanner(System.in);
System.out.println("Enetr the no:");
no=in.nextInt();

    	for(i=2;i<=no/2;i++)
    	{
    		if(no%i==0)
    		{
    			flag=1;
    			break;
    		}
    	}

    	if(flag==0)
    	{
    		System.out.print("no is prime");
    	}
    	else
    	{
    		System.out.print("no is not prime");
    	}
    }

}
```

## 9. Write a Java Program that implements the use of break statement.

```java
import java.util.Scanner;
class java9 {
public static void main(String args[]) {
int no, i;
Scanner in = new Scanner(System.in);
System.out.println("Enter the no:");
no = in.nextInt();

        for (i = 1; i <= no; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

}
```

## 10. Write a Java Program that implements the use of continue statement.

```java
import java.util.Scanner;
class java10 {
public static void main(String args[]) {
int no, i;
Scanner in = new Scanner(System.in);
System.out.println("Enetr the no:");
no = in.nextInt();

        for (i = 1; i <= no; i++) {
            if (i == 11) {
                continue;
            }
            System.out.println(i);
        }
    }

}
```

## 11. Write a Java Program that will accept Command-line Arguments and display the same.

```java
class java11 {
public static void main(String args[]) {
for (String s : args) {
System.out.println(s);
}
}
}
```

12. Write a Java Program to sort the elements of an array in Ascending Order.

```java
import java.util.Scanner;
class java12 {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
int i, j, element, temp, no;
int arr[] = new int[10];

        System.out.println("Enter the number of an array:- ");
        no = in.nextInt();

        for (i = 1; i <= no; i++) {
            System.out.println("Enter the element:");
            arr[i] = in.nextInt();
        }

        for (i = 1; i <= no; i++) {
            for (j = i; j <= no; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted list in ascending order:");
        for (i = 1; i <= no; i++) {
            System.out.println(arr[i]);
        }

    }

}

// Practical 13
import java.util.Scanner;

class Student
{
int java,se,ec,net,t;
float per;
String result,grd;
void getmarks()
{
Scanner in=new Scanner(System.in);

    	System.out.println("Enter the java marks:");
    	java=in.nextInt();

    	System.out.println("Enter the software engineering marks:");
    	se=in.nextInt();

    	System.out.println("Enter the e-commerce marks:");
    	ec=in.nextInt();

    	System.out.println("Enter the net framework marks:");
    	net=in.nextInt();
    }
    void total()
    {
    	t=java+se+ec+net;
    	System.out.println("From Total 400 get:"+t);
    }

    void percentage()
    {
    	per=t/4;
    	System.out.println("Percentage:"+per);
    }

    void result()
    {
    	if(java<35 || se<35 || ec<35 || net<35)
    	{
    		System.out.println(result="Fail");
    	}
    	else
    	{
    		System.out.println(result="Pass");
    	}
    }

    void grade()
    {
    	if(result=="Pass")
    	{
    		if(per>=70.0 || per<=100.0)
    		{
    			System.out.println("Student Grade:A");
    		}
    		else if(per>=60.0 || per<70.0)
    		{
    			System.out.println("Student Grade:B");
    		}
    		else if(per>=50.0 || per<60.0)
    		{
    			System.out.println("Student Grade:C");
    		}
    		else if(per>=40.0 || per<50.0)
    		{
    			System.out.println("Student Grade:D");
    		}
    		else if(per>=35.0 || per<40.0)
    		{
    			System.out.println("Student Grade:E");
    		}
    	}
    	else
    	{
    		System.out.println("Student Grade:E");
    	}
    }

}

class java13 {
public static void main(String args[]) {
Student s1 = new Student();
s1.getmarks();
s1.total();
s1.percentage();
s1.result();
s1.grade();
}
}

// Practical 14
import java.util.Scanner;

class empsalary
{
String name;
int id,salary,t,p,h;
Scanner in=new Scanner(System.in);
void heading()
{
String s="Employee Salary Sleep";
System.out.println("\t\t"+s);
}
void underline()
{
System.out.println("--------------------------------------------------------------");
}
void getdata()
{
System.out.println("Enter emp name:");
name=in.nextLine();
System.out.println("Enter emp ID:");
id=in.nextInt();

    	System.out.println("Enter emp salary:");
    	salary=in.nextInt();
    }

    void pflogic()
    {
    	int pf=5;
    	p=salary*pf/100;
    	System.out.println("\t\tEmployee salary pf is:"+p);
    }

    void tddalogic()
    {
    	int td=10;
    	t=salary*td/100;
    	System.out.println("\t\tEmployee salary tdda is:"+t);
    }

    void hralogic()
    {
    	int hr=12;
    	h=salary*hr/100;
    	System.out.println("\t\tEmployee salary hra is:"+h);
    }

    void totalsalary()
    {
    	int total;
    	total=salary-p+t+h;
    	System.out.println("The total salary of employee is:"+total);
    }
    void alldisplay()
    {
    	System.out.println("\t\tEmployee id:"+id);
    	System.out.println("\t\tEmployee name:"+name);
    	System.out.println("\t\tEmployee salary:"+salary);
    }
    void nesting()
    {
    	underline();
    	heading();
    	underline();
    	getdata();
    	heading();
    	underline();
    	alldisplay();
    	pflogic();
    	tddalogic();
    	hralogic();
    	underline();
    	underline();
    	totalsalary();
    	underline();
    }

}

class java14 {
public static void main(String args[]) {
empsalary emp1 = new empsalary();
empsalary emp2 = new empsalary();
empsalary emp3 = new empsalary();
emp1.nesting();
emp2.nesting();
emp3.nesting();
}
}
// Practical 15
import java.util.Scanner;

class staticmembers {
static String sem = "Semester 5";
String name;
int rno;

    void rno() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter rollno:-");
        rno = in.nextInt();
    }

}

class java15 {
public static void main(String args[]) {
staticmembers s1 = new staticmembers();
s1.rno();
String a = staticmembers.sem;
System.out.println("Your semester of BCA is:-" + a);
}
}

// Practical 16
import java.util.Scanner;

class nesting {
Scanner in = new Scanner(System.in);
int a, b;

    void getdata() {
        System.out.println("Enter first value:-");
        a = in.nextInt();

        System.out.println("Enter second value:-");
        b = in.nextInt();
    }

    void putdata() {
        int sum;
        sum = a + b;
        System.out.println("The sum is:-" + sum);
    }

    void nestingmethod() {
        getdata();
        putdata();
    }

}

class java16 {
public static void main(String args[]) {
nesting n1 = new nesting();
n1.nestingmethod();
}
}

// Practical 17
class overloading {
int x, y;

    void mul(int a) {
        x = a;
        System.out.println("The number is:" + x);
    }

    void mul(int a, int b) {
        x = a;
        y = b;
        System.out.println("The numbers are:" + a + "  and  " + b);
    }

}

class java17 {
public static void main(String args[]) {
overloading o1 = new overloading();
o1.mul(4);
o1.mul(5, 6);
}
}

// Practical 18
class dconstructor {
dconstructor() {
System.out.println("Hi!!! kds I am default constructor");
}
}

class java18 {
public static void main(String args[]) {
dconstructor d1 = new dconstructor();
}
}

// Practical 19
class pconstructor {
pconstructor(int x, int y) {
System.out.println("Hi! I am parameterized constructor");
int a, b, c;

        a = x;
        b = y;

        c = a + b;

        System.out.println("The sum is:" + c);
    }

}

class java19 {
public static void main(String args[]) {
pconstructor p1 = new pconstructor(10, 20);
}
}

// Practical 20
class oconstructor {
oconstructor() {
System.out.println("Hi! I am default constructor");
}

    oconstructor(int x) {
        int a = x;
        int b;
        b = a * a;
        System.out.println("The return value from single arg constructor:" + b);

    }

    oconstructor(int p, int q) {
        int j, k, s;
        j = p;
        k = q;
        s = j * k;
        System.out.println("The return value from double args constructor:" + s);
    }

}

class java20

{
public static void main(String args[]) {
oconstructor o1 = new oconstructor();
oconstructor o2 = new oconstructor(4);
oconstructor o3 = new oconstructor(4, 5);
}
}
// Practical 21
import java.util.Scanner;

class Singleinheritance
{
Scanner in=new Scanner(System.in);
String sname,hobby,sem;
int rno;

    void student()
    {
    	System.out.println("Enter Student Name:");
    	sname=in.nextLine();

    	System.out.println("Enter Student Hoby:");
    	hobby=in.nextLine();

    	System.out.println("Enter Student Semester:");
    	sem=in.nextLine();

    	System.out.println("Enter Student Rno:");
    	rno=in.nextInt();
    }

}

class Sports extends Singleinheritance {
int sw;

    void extra() {

        System.out.println("Enter Student Sport weightage:");
        sw = in.nextInt();
    }

}

class java21 {
public static void main(String args[]) {
Sports s1 = new Sports();
s1.student();
s1.extra();
}
}
// Practical 22
import java.util.Scanner;

class ClassA {
Scanner in = new Scanner(System.in);
String sname;
int rno;

    void getdata() {
        System.out.println("Enter Student Name:");
        sname = in.nextLine();

        System.out.println("Enter Student Rno:");
        rno = in.nextInt();
    }

}

class ClassB extends ClassA {
int marks;

    void total() {
        System.out.println("Enter Student marks:");
        marks = in.nextInt();
    }

}

class ClassC extends ClassB {
int sw;

    void extra() {

        System.out.println("Enter Student Sport weightage:");
        sw = in.nextInt();
    }

}

class java22 {
public static void main(String args[]) {
ClassC c1 = new ClassC();
c1.getdata();
c1.total();
c1.extra();
}
}
// Practical 23
import java.util.Scanner;

class Grandfather {
Scanner in = new Scanner(System.in);
String gfname;

    void gf() {
        System.out.println("Hii! This is grand father class");

        System.out.println("Enter GrandFather's Name:");
        gfname = in.nextLine();
    }

}

class Father extends Grandfather {
String fname;

    void father() {
        System.out.println("Hii! This is father class from Grandfather class");

        System.out.println("Enter Father's Name:");
        fname = in.nextLine();
    }

}

class Uncle extends Grandfather {
String uname;

    void uncle() {
        System.out.println("Hii! This is uncle class from Grandfather class");

        System.out.println("Enter Uncle's Name:");
        uname = in.nextLine();
    }

}

class Son extends Father {
String sname;

    void son() {
        System.out.println("Hii! This is Son class from Father class");

        System.out.println("Enter Son's Name:");
        sname = in.nextLine();
    }

}

class Daughter extends Uncle {
String dname;

    void daughter() {
        System.out.println("Hii! This is Daughter class from Uncle class");

        System.out.println("Enter Daughter's Name:");
        dname = in.nextLine();
    }

}

class java23 {
public static void main(String args[]) {
Son s1 = new Son();
s1.gf();
s1.father();
s1.son();
Daughter d1 = new Daughter();
d1.gf();
d1.uncle();
d1.daughter();
}
}

// Practical 24
class Super {
int x;

    Super(int a) {
        x = a;
    }

    void display() {
        System.out.println("Super x:" + x);
    }

}

class Sub extends Super {
int y;

    Sub(int a, int b) {
        super(a);
        y = b;
    }

    void display() {
        System.out.println("Super x:" + x);
        System.out.println("Sub y:" + y);
    }

}

class java24 {
public static void main(String args[]) {
Sub s1 = new Sub(100, 200);
s1.display();
}
}

// Practical 25
class Superr {
final int x;

    Superr(final int a) {
        x = a;
    }

    final void display() {
        System.out.println("Super x:" + x);
    }

}

class Subb {
int y;

    Subb(int a, int b) {
        super(x);
        y = b;
    }

    void display()// Display method must not override in the subclass of superclass.
    {
        System.out.println("Super x:" + x);
        System.out.println("Sub y:" + y);
    }

}

class java25 {
public static void main(String args[]) {
Subb s1 = new Subb(100, 300);
s1.display();
}
}

// Practical 26
abstract class Super {
int x;

    Super(int a) {
        x = a;
    }

    void display() {
        System.out.println("Super x:" + x);
    }

}

class Sub extends Super {
int y;

    Sub(int a, int b) {
        super(a);
        y = b;
    }

    void display() {
        System.out.println("Super x:" + x);
        System.out.println("Sub y:" + y);
    }

}

class java26 {
public static void main(String args[]) {
Sub s1 = new Sub(100, 200);
s1.display();
}
}

// Practical 27
interface Area {
final static float pi = 3.14f;

    float compute(float x, float y);

}

class Rectangle implements Area {
public float compute(float x, float y) {
return (x \* y);
}
}

class Circle implements Area {
public float compute(float x, float y) {
return (pi _ x _ x);
}
}

class java27 {
public static void main(String args[]) {
Rectangle r1 = new Rectangle();
Circle c1 = new Circle();

        Area a1;

        a1 = r1;
        System.out.println("Area of Rectangle:" + a1.compute(10, 20));

        a1 = c1;
        System.out.println("Area of Circle:" + a1.compute(10, 0));
    }

}

// Practical 28
class Student {
int rno;

    void getno(int n) {
        rno = n;
    }

    void putno() {
        System.out.println("Roll no:" + rno);
    }

}

class Test extends Student {
float part1, part2;

    void getmarks(float f1, float f2) {
        part1 = f1;
        part2 = f2;
    }

    void putmarks() {
        System.out.println("Marks Obtained");
        System.out.println("Marks part 1:" + part1);
        System.out.println("Marks part 2:" + part2);
    }

}

interface Sports {
float spwt = 6.0f;

    void putwt();

}

class Result extends Test implements Sports {
float total;

    public void putwt() {
        System.out.println("Sports weight:" + spwt);
    }

    void display() {
        total = part1 + part2 + spwt;

        putno();
        putmarks();
        putwt();

        System.out.println("Total is:" + total);
    }

}

class java28 {
public static void main(String args[]) {
Result s1 = new Result();
s1.getno(120);
s1.getmarks(50.50f, 60.60f);
s1.display();
}
}

// Practical 29
// Practical 30
import java.util.Scanner;

class java30 {
public static void main(String args[]) {
Scanner in = new Scanner(System.in);
double x, z = 30;

        System.out.println("Enter value:");
        x = in.nextDouble();

        double s = Math.sin(x);
        System.out.println("The sin function return value is:" + s);

        double c = Math.cos(x);
        System.out.println("The cos function return value is:" + c);

        double rt = Math.sqrt(x);
        System.out.println("The sqrt function return value is:" + rt);

        double t = Math.tan(x);
        System.out.println("The tan function return value is:" + t);

        double p = Math.pow(x, z);
        System.out.println("The pow function return value is:" + p);

        double at2 = Math.atan2(x, z);
        System.out.println("The atan2 function return value is:" + at2);

        double a = Math.atan(z);
        System.out.println("The atan function return value is:" + a);

        double m = Math.max(x, z);
        System.out.println("The max function return value is:" + m);

        double mn = Math.min(x, z);
        System.out.println("The min function return value is:" + mn);

        double l = Math.log(x);
        System.out.println("The log function return value is:" + l);

        double f = Math.floor(x);
        System.out.println("The floor function return value is:" + f);

        double e = Math.exp(x);
        System.out.println("The exp function return value is:" + e);

        double ab = Math.abs(x);
        System.out.println("The abs function return value is:" + ab);

        double r = Math.round(x);
        System.out.println("The round function return value is:" + r);

        double cl = Math.ceil(x);
        System.out.println("The ceil function return value is:" + cl);

    }

}

// Practical 31
import java.lang.\*;

class java31 {
public static void main(String args[]) {
String s1 = "Java";

        String s2 = "Progrmming Language";
        String s3, s4;
        int s, n = 2;

        s3 = s1.toLowerCase();
        System.out.println(s3);

        s3 = s2.toUpperCase();
        System.out.println(s3);

        s = s2.length();
        System.out.println(s);

        s4 = s3.replace("s1", "s2");
        System.out.println(s4);

        s3 = s1.trim();
        System.out.println(s3);

        s4 = s1.concat(s2);
        System.out.println(s4);

        s4 = s1.toString();
        System.out.println(s4);

        s4 = s2.substring(2);
        System.out.println(s4);

        s4 = s2.substring(2, 4);
        System.out.println(s4);

        if (s1.equals(s2)) {
            System.out.println("s1 equal to s2");
        } else {
            System.out.println("s1 not equal s2");
        }

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("s2 strings are equal");
        } else {
            System.out.println("s2 Strings are not equal");
        }

        if (s1.compareTo(s2) > 0) {
            System.out.println("s2 string is alphabetically greater");
        } else {
            System.out.println("s2 string is alphabetically lesser");
        }

        String str = "car insurance";
        System.out.println(str.indexOf("u"));

    }

}
// Practical 32
import java.util.\*;

public class java32n {
public static void main(String[] args) {
Vector v1 = new Vector();

        v1.add(1);
        v1.add(2);
        v1.add("Java");
        v1.add(3);
        v1.remove(3);
        v1.addElement("Last Element");
        v1.insertElementAt("First Element", 0);

        System.out.println("Vector v1 is " + v1);
        System.out.println("The element at 2nd index : " + v1.elementAt(2));
        System.out.println("The capacity is: " + v1.capacity());
    }

}

// Practical 33
import java.util.\*;

public class java33
{
public static void main(String args[])
{
// creating stack
Stack st = new Stack();

     	 // populating stack
      	st.push("Java");
      	st.push("Source");
      	st.push("code");
    st.push("My java");
    st.push("my code");

    System.out.println("Added object is: "+st);
     	// removing top object
      	System.out.println("Removed object is: "+st.pop());

      	// elements after remove
      	System.out.println("Elements after remove: "+st.pop());

    System.out.println("Elements after remove: "+st.pop());

    System.out.println("Elements after remove: "+st);

}
}
// Practical 34
import java.io.\*;

class java34 {
public static void main(String as[]) throws Exception {
InputStreamReader isr = new InputStreamReader(System.in);
BufferedReader br = new BufferedReader(isr);
int i = 0, count = 0;
String text = "", s = "";
System.out.println("Enter Text:(press ENTER twice to stop)\n");
s = br.readLine();
while (s.length() != 0) {
text += s;
s = br.readLine();
}
System.out.println("Enter search word:");
s = br.readLine();
while (true) {
i = text.indexOf(s, i);
if (i == -1)
break;
System.out.println("Word found at position:" + i);
count++;
i += s.length();
}
System.out.println("Number of occurrences of given word:" + count);
}

}

// Practical 35
import java.util.Arrays;
import java.util.Scanner;

public class java35n {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter a string value: ");
String str = sc.nextLine();
char charArray[] = str.toCharArray();
Arrays.sort(charArray);
System.out.println(new String(charArray));
}
}

// Practical 36
class A extends Thread {
public void run() {
for (int i = 1; i <= 5; i++) {
System.out.println("\tFrom ThreadA : i=" + i);
}
System.out.println("Exit from A");
}
}

class B extends Thread {
public void run() {
for (int j = 1; j <= 5; j++) {
System.out.println("\tFrom ThreadB : j=" + j);
}
System.out.println("Exit from B");
}
}

class C extends Thread {
public void run() {
for (int k = 1; k <= 5; k++) {
System.out.println("\tFrom ThreadC : k=" + k);
}
System.out.println("Exit from C");
}
}

class java36 {
public static void main(String args[]) {
new A().start();
new B().start();
new C().start();
}
}

// Practical 37
class A extends Thread {
public void run() {
for (int i = 1; i <= 5; i++) {
if (i == 1)
yield();
System.out.println("\tFrom ThreadA : i=" + i);
}
System.out.println("Exit from A");
}
}

class B extends Thread {
public void run() {
for (int j = 1; j <= 5; j++) {
System.out.println("\tFrom ThreadB : j=" + j);
if (j == 3)
stop();
}
System.out.println("Exit from B");
}
}

class C extends Thread {
public void run() {
for (int k = 1; k <= 5; k++) {
System.out.println("\tFrom ThreadC : k=" + k);

            if (k == 1)

                try {
                    sleep(1000);
                }

                catch (Exception e) {

                }
        }
        System.out.println("Exit from C");
    }

}

public class java37 {
public static void main(String args[]) {

        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        System.out.println("Start Thread A");
        threadA.start();

        System.out.println("Start Thread B");
        threadB.start();

        System.out.println("Start Thread C");
        threadC.start();

        System.out.println("End of main Thread");
    }

}

// Practical 38
class A extends Thread {
public void run() {
System.out.println("ThreadA Started");
for (int i = 1; i <= 4; i++) {
System.out.println("\tFrom ThreadA : i=" + i);
}
System.out.println("Exit from A");
}
}

class B extends Thread {
public void run() {
System.out.println("ThreadB Started");
for (int j = 1; j <= 4; j++) {
System.out.println("\tFrom ThreadB : j=" + j);
}
System.out.println("Exit from B");
}
}

class C extends Thread {
public void run() {
System.out.println("ThreadC Started");
for (int k = 1; k <= 4; k++) {
System.out.println("\tFrom ThreadC : k=" + k);
}
System.out.println("Exit from C");
}
}

class java38 {
public static void main(String args[]) {

        A threadA = new A();
        B threadB = new B();
        C threadC = new C();

        threadC.setPriority(Thread.MAX_PRIORITY);
        threadB.setPriority(threadA.getPriority() + 1);
        threadA.setPriority(Thread.MIN_PRIORITY);

        System.out.println("Start Thread A");
        threadA.start();

        System.out.println("Start Thread B");
        threadB.start();

        System.out.println("Start Thread C");
        threadC.start();

        System.out.println("End of main Thread");
    }

}

// Practical 39
class X implements Runnable {
public void run() {
System.out.println("ThreadC Started");
for (int i = 1; i <= 10; i++) {
System.out.println("\tThreadX : " + i);
}
System.out.println("End of ThreadX");
}
}

class java39 {
public static void main(String args[]) {
X runnable = new X();
Thread threadX = new Thread(runnable);
threadX.start();
System.out.println("End of main Thread");
}
}

// Practical 40
class java40 {
public static void main(String args[]) {
int a = 10, b = 5, c = 5, x, y;

        try {
            x = a / (b - c);
        } catch (ArithmeticException e) {
            System.out.println("The number cannot divide by zero");
        }
        y = a / (b + c);
        System.out.println("The answer is:" + y);
    }

}

// Practical 41
class java41 {
public static void main(String args[]) {
int a[] = { 5, 10 };
int b = 5;

        try {
            int x = a[2] / a[0] - b;
        } catch (ArithmeticException e) {
            System.out.println("The number cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index error");
        } catch (ArrayStoreException e) {
            System.out.println("The wrong data type");
        }
        int y = a[1] / a[0];
        System.out.println("The division of y is:" + y);
    }

}

// Practical 42
class java42 {
public static void main(String args[]) {
int a[] = { 10, 10 };
int b = 10;

        try {
            int x = a[0] / b - a[2];
        }

        catch (ArithmeticException e) {
            System.out.println("Number cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index Out Of Bound Error");
        } finally {
            int y = a[0] / a[1];
            System.out.println("Answer:" + y);
        }
    }

}

// Practical 43
class java43 {
public static void main(String args[]) {
int a[] = { 10, 10 };
int b = 10, c = 5;
try {
if (b != c) {
try {
int x = a[2] / b - a[1];
} catch (ArithmeticException e) {
System.out.println("The number is cannot divide");
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("The Array index errors occur");
}
}
} catch (ArithmeticException e) {
System.out.println("The number is cannot divide");
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("The Array index error");
} finally {
int y = a[1] / (b - c);
System.out.println("The answer:" + y);
}

    }

}

// Practical 44
import java.lang.Exception;

class MyException extends Exception {
MyException(String message) {
super(message);
}
}

class java44 {
public static void main(String args[]) {
int b = 500, c = 10;

        try {
            float z = (float) c / (float) b;
            if (z < 0.05) {
                throw new MyException("Number is too small");
            }
        } catch (MyException e) {
            System.out.println("Caught my exception");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("I am always here...........");
        }
    }

}
// Practical 45
import java.applet._;
import java.awt._;

public class java45 extends Applet {
public void paint(Graphics g) {
g.drawString("Hello Applet", 50, 50);
}
}

// <applet code="java45.class" width=300 height=300></applet>

// Practical 46
import java.applet.Applet;
import java.awt.Graphics;

public class java46 extends Applet {
public void init() {
System.out.println("1.I am init()");
}

    public void start() {
        System.out.println("2.I am start()");
    }

    public void paint(Graphics g) {
        System.out.println("3.I am paint()");
    }

    public void stop() {
        System.out.println("4.I am stop()");
    }

    public void destroy() {
        System.out.println("5.I am destroy()");
    }

}
// Practical 47
import java.applet.Applet;
import java.awt.Graphics;

public class java47 extends Applet {
public void paint(Graphics g) {
String str = getParameter("msg");
g.drawString(str, 50, 50);
}
}

// <applet code="java47.class" width="400" height="400">
// <param name="msg" value="Welcome to applet">
// </applet>

// Practical 48
import java.applet.Applet;
import java.awt.\*;

// <applet code="java48.class" width="300" height="300">
// </applet>
public class java48 extends Applet {

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawString("Welcome", 50, 50);
        g.drawLine(20, 30, 20, 300);
        g.drawRect(70, 100, 30, 30);
        g.fillRect(170, 100, 30, 30);
        g.drawOval(70, 200, 30, 30);

        g.setColor(Color.pink);
        g.fillOval(170, 200, 30, 30);
        g.drawArc(90, 150, 30, 30, 30, 270);
        g.fillArc(270, 150, 30, 30, 0, 180);

    }

}

```

```

```
