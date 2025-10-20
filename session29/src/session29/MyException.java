package session29;

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}

	public static void main(String[] args) {
		try {
			checkNumber(-3);
			System.out.println("The number is valid");
		} catch (MyException e) {
			System.out.println("Caught MyException: " + e.getMessage());
		} finally {
			System.err.println("Finally block executes");
		}
	}

	static void checkNumber(int n) throws MyException {
		if (n < 0) {
			throw new MyException("Negative number not allowed!");
		}
	}
}
