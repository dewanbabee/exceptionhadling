package exception;
import java.io.FileNotFoundException;

public class NestedException {

	public static void main(String[] args) {
		  
		  try{
			  
			  int a = 1;
			  int b = 2;
			  System.out.println(a+b);
				try {	  
					String c = null;
					System.out.println(c.length());
				
				}
				
				catch(NullPointerException e) {
					System.out.println("Null pointer Exception");
				}
				    int d [] = {1,2,3,4,5};
	    	        //int c = d[5];   // complier did not complain
			 
			        d[5]=8/0; // here we have 2 exception 
		 
				}
			 
		  catch(ArithmeticException e)
		  	{
			  System.out.println("divide by zero");
			}
			catch (ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Array out of bounds exception");
			}
		 catch(Exception e)
	           {
				 System.out.println("common task completed");
				 }  
		finally {
	    	System.out.println("I am in Finally Block");
	}

}
}
