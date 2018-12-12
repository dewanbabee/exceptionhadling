package exception;

import java.io.IOException;  
public class TestThrows {

	 
	  void m()throws IOException{  
	    throw new IOException("m device error");//checked exception  
	  }  
	  
	  void n()throws IOException{ 
		  
	  m();  
	  //throw new IOException("n device error");          //checked exception 
	  System.out.println("I am sad...that you did not print this line");
	  }  
	  
	  void p(){  
	  try{  
	    n();  
	   }catch(Exception e){System.out.println(e+ "  exception handled");}  
	  }  
	 
	  
	  public static void main(String args[]){  
	   TestThrows obj=new TestThrows();  
	 obj.p();   
	 //obj.m();  	// need try catch block
	// obj.n();
	   System.out.println("normal flow...");  
	  }  
	}  
