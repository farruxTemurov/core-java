package session29;

public class DivisionExample {

	public static void main(String[] args) {
		divide(10, 2);
		divide(3, 0);
	}

	static void divide(int a, int b) {
		try {
			int result = a / b;
			System.out.println("Result: " + result);
		} catch (ArithmeticException ae) {
			System.out.println("Error: division by zero");
		} finally {
			System.out.println("Finally block executes");
		}
	}
}
