package com;

abstract class GooglePay {
	void payFromGoogle(int amount) {
		System.out.println("[GooglePay] amount paid " + amount);
		onSuccess(101, "Transaction successful");
	}

	abstract void onSuccess(int code, String message);

	abstract void onFailure(int code, String message);
}

abstract class ApplePay {
	void payFromApple(int amount) {
		System.out.println("[ApplePay] amount paid " + amount);
	}

	abstract void onSuccess(String message);

	abstract void onFailure(String message);
}

class FoodDeliveryAppPayments extends GooglePay {
	@Override
	void onSuccess(int code, String message) {
		System.out.println("[FDA] Payment received. We'll deliver the order soon... " + code + " " + message);
	}

	@Override
	void onFailure(int code, String message) {
		System.out.println("[FDA] Payment failed. Please try again... " + code + " " + message);
	}
}

public class AbstractionWithInterfaces {

	public static void main(String[] args) {

	}

}
