package com;
// abstraction and inheritance
// EStore extends payTm and gets the messages from it

abstract class PayTmPaymentGateway {
	PayTmPaymentGateway() {
		System.out.println("[PayTM] object constructed");
	}

	private boolean isBankInterfaceUp = false;

	void pay(int amount) {
		if (isBankInterfaceUp) {
			System.out.println("[PayTM] payment successfull with amount of " + amount);
			onSuccess("101 - Payment success");
		} else {
			System.out.println("[PayTM] payment failed.");
			onFailure("201 -  payment failure.");
		}
	}

	abstract void onSuccess(String message);

	abstract void onFailure(String message);
}

class EStorePayment extends PayTmPaymentGateway {
	EStorePayment() {
		System.out.println("[EStore] object constructed");
	}

	void onSuccess(String message) {
		System.out.println(message);
		System.out.println("[EStore] Thank you for placing an order");
	}

	void onFailure(String message) {
		System.out.println("[EStore] " + message);
		System.out.println("[EStore] Something went wrong");
	}
}

public class PaymentsApp {

	public static void main(String[] args) {
		EStorePayment estorePayment = new EStorePayment();
		System.out.println("");
		estorePayment.pay(3000);
	}

}
