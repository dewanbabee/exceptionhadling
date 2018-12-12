package exception;

import java.io.File;
import java.io.FileNotFoundException;
//import java.io.FileNotFoundException;
//import java.io.File;
//import java.io.File.*;
import java.io.FileReader;


public class FileNotFoundDemo {

	public static void main(String[] args) {
	
//	File file = new File("D://exception.txt");
//	try {
//		FileReader fr = new FileReader(file);
//}
//	catch ( FileNotFoundException e )
//	{
//		System.out.println(e);
//		}
//		
//		System.out.println("Hey I found the file ");
		
		
 	
/*
 * ************************************************************************
 * */		
		int a[] = {10,5,7,8,9}; //array of size 5
		
 try {
	 
	     String c = null;
    	 System.out.println(c.length());
    	 
	    //int b = a[5];   // complier did not complain
		 
		 //a[5]=8/0; // here we have 2 exception 
    	 }
    	
	 
		 
catch(ArithmeticException e)
	   {
		System.out.println("divide by zero");
	  }
catch (ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of bounds exception");
		}
 catch (NullPointerException e)
	{
		System.out.println("Null Pointer exception");
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
