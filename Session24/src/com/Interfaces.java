package com;

interface Notification {
	// we cannot define methods or create constructors in an interface
	// However, we can define abstract methods which will by default be public
	// abstract
	void notifyMessage(String text);
	/*
	 * void show(){ System.out.println("This is show method of an interface"); }
	 */
}

interface ElectricityBillPayment {
	int billAccountNumber = 120321; // by default public static

	void billGenerated();

	void payBillNotification();
}

class ElectricityApp {
	ElectricityBillPayment payment;

	void subscribeForBill(ElectricityBillPayment payment) {
		this.payment = payment;
	}
	
	void broadcastBills() {
		payment.billGenerated();
		payment.payBillNotification();
	}
}

class User implements Notification, ElectricityBillPayment {
	public void notifyMessage(String text) {
		System.out.println("A new notification message " + text);
	}

	@Override
	public void billGenerated() {
		System.out.println("Your electricity bill is generated. PLZ pay on time");
	}

	@Override
	public void payBillNotification() {
		System.out.println("Thank you for paying your bill");
	}
}

public class Interfaces {
	public static void main(String[] args) {

		Notification ref1 = new User();
		ElectricityBillPayment ref2 = new User();
		
		System.out.println("Bill account number is " + ElectricityBillPayment.billAccountNumber);

		ElectricityApp electricityApp = new ElectricityApp();
		User john = new User();
		electricityApp.subscribeForBill(john);
		electricityApp.broadcastBills();
	}
}