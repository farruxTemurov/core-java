package com;

interface PaymentCallbacks {
	void onSuccess(String message);

	void onFailure(String message);
}

/*
 * class Payment implements PaymentCallbacks {
 * 
 * @Override public void onSuccess(String message) {
 * System.out.println("Payment passed: " + message); }
 * 
 * @Override public void onFailure(String message) {
 * System.out.println("Payment failed: " + message); } }
 */

public class AnonymousClasses {

	public static void main(String[] args) {
		/*
		 * PaymentCallbacks ref = new Payment(); ref.onSuccess("Amount paid 200");
		 * ref.onFailure("Amount 200 wasn't processed");
		 */

		PaymentCallbacks ref = new PaymentCallbacks() { // anonymous class

			@Override
			public void onSuccess(String message) {
				System.out.println("Payment passed: " + message);
			}

			@Override
			public void onFailure(String message) {
				System.out.println("Payment failed: " + message);
			}
		};

		ref.onSuccess("Amount paid 200");
		ref.onFailure("Amount 200 wasn't processed");
	}
}
