package exception;

public class Throw {
static void checkAge(int age) throws ArithmeticException 
{
	//all class must be subclass of Throwable class
	if(age <16)
		throw new ArithmeticException("Not a valid age for driving");
	else 
		System.out.println("Welcome to our driving school");
}
}
