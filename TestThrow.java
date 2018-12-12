package exception;

public class TestThrow {

	public static void main(String[] args) {
		try {
			Throw.checkAge(20);
		}		catch(ArithmeticException e){
				System.out.println(e);
			}

	}

}
