package com;

// Final keyword is like a const. It helps stop a variable from being modified after it is given a value;
// it helps prevent the method from being re-defined and modified.
// if classes are marked final, they cannot be extended -> meaning inheriting doesn't work.
// SUMMARY: Final keyword is a basic level of security.

final class PaymentGateway {
	final void pay(int amount) {
		System.out.println("Paymnet done with amount of " + amount);
	}
}

//class MyPaymentGateway extends PaymentGateway { cannot inherit from final class
	
//}

public class FinalKeyword {

	public static void main(String[] args) {
		int age = 20;
		age = 18; // modified the age variable

		final int score = 593;
//		score = 501; // ERROR-> The final local variable score cannot be assigned. It must be blank and not using a compound assignment

		final int distance; // blank final variable -> it hasn't been initialized
		distance = 20; // it got its first and last value;
	}

}
