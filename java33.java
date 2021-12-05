import java.util.*;

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