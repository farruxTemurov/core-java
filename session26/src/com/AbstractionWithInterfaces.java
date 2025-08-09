package com;

//abstract class GooglePay {
interface GooglePay {
	default void payFromGoogle(int amount) {
		System.out.println("[GooglePay] amount paid " + amount);
		onSuccess(101, "Transaction successful");
	}

	abstract void onSuccess(int code, String message); // -> by default public abstract

	abstract void onFailure(int code, String message);
}

//abstract class ApplePay {
interface ApplePay {
	default void payFromApple(int amount) {
		System.out.println("[ApplePay] amount paid " + amount);
		onFailure("Bank interface down. error code of 3102");
	}

	abstract void onSuccess(String message);

	abstract void onFailure(String message);
}

class FoodDeliveryAppPayments implements GooglePay, ApplePay {
	@Override
	public void onSuccess(int code, String message) {
		System.out.println("[FDA] Payment received. We'll deliver the order soon... " + code + " " + message);
	}

	@Override
	public void onFailure(int code, String message) {
		System.out.println("[FDA] Payment failed. Please try again... " + code + " " + message);
	}

	@Override
	public void onSuccess(String message) {
		System.out.println("[FDA] Payment received");

	}

	@Override
	public void onFailure(String message) {
		System.out.println("[FDA] Payment failed -" +message);

	}
}

public class AbstractionWithInterfaces {

	public static void main(String[] args) {
		/*
		 * GooglePay ref = new FoodDeliveryAppPayments(); ref.payFromGoogle(3000);
		 */
		ApplePay ref = new FoodDeliveryAppPayments();
		ref.payFromApple(4200);
	}

}
