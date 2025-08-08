package com;

abstract class GooglePay {
	void payFromGoogle(int amount) {
		System.out.println("[GooglePay] amount paid " + amount);
	}

	abstract void onSuccess(int code, String message);

	abstract void onFailure(int code, String message);
}

public class AbstractionWithInterfaces {

	public static void main(String[] args) {

	}

}
