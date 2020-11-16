package package1;

public class Exception_Demo {

	public static void main(String[] args) {
	try {
		int a=10/0;
		
	} catch (ArithmeticException e) {
		System.out.println("Check the code"+ e.getMessage());
		
	}

	}

}
