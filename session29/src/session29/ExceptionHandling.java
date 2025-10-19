package session29;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		System.out.println("Cashbacks app started");

		int[] cashbacks = { 10, 20, 40, 21, 43, 12, 0, 52, 100 };
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your lucky number");
		int luckyNumber = -1;
		try {
			luckyNumber = scanner.nextInt();
		} catch (Exception ref) {
			System.out.println("message: " + ref.getMessage());
		}
		scanner.close();
		int cashbackEarned = 0;
		try {
			cashbackEarned = cashbacks[luckyNumber];
		} catch (Exception ref) {
			ref.printStackTrace();
		} finally {
			System.out.println("This is an important instruction!");
		}
		System.out.println("Thanks for your participation, your earned cashback is $" + cashbackEarned);

	}

}
