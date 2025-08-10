package session27;

import java.util.Date;

interface Plan {
	String getPlanName();

	int getPlanPrice();

	default void purchase(int amount) {
		if (amount == getPlanPrice()) {
			System.out.println("Purchasing the plan: " + getPlanName());
			System.out.println("Plan purchased successfully for an amount: " + amount);
			onPurchse("Plan activated from " + new Date());
		} else {
			System.out.println("Purchase Failed. Amount mismatched");
		}
	}

	void onPurchse(String message);
}

class Plan3G implements Plan {

	@Override
	public String getPlanName() {
		return "Unlimited 3G";
	}

	@Override
	public int getPlanPrice() {
		return 250;
	}

	@Override
	public void onPurchse(String message) {
		System.out.println("[Message]: " + message);
	}

}

class Plan4G implements Plan {

	@Override
	public String getPlanName() {
		return " Truly Unlimited 4G";
	}

	@Override
	public int getPlanPrice() {
		return 370;
	}

	@Override
	public void onPurchse(String message) {
		System.out.println("[Message]: " + message);
	}

}

class PlanFactory {
	public static Plan getPlan(int typeOfPlan) {
		Plan plan = null;

		if (typeOfPlan == 3) {
			plan = new Plan3G();
		} else if (typeOfPlan == 4) {
			plan = new Plan4G();
		} else {
			System.out.println("Invalid Plan");
		}
		return plan;
	}
}

public class FactoryDesignPattern {

	public static void main(String[] args) {
		Plan plan = PlanFactory.getPlan(3);
		if (plan != null) {
			plan.purchase(250);
		}
	}

}
