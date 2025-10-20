package session29;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputHandling {

	public static void main(String[] args) {
		getInput();
	}

	static void getInput() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter numerator: ");
			int numerator = sc.nextInt();

			System.out.println("Enter denominator: ");
			int denominator = sc.nextInt();

			int result = numerator / denominator;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Error: Division by zero");
		} catch (InputMismatchException e) {
			System.out.println("Error: Invalid input");
		} finally {
			System.out.println("Calculation finished");
			sc.close();
		}
	}
}
