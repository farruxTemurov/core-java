package session27;

import java.util.Date;

/* States -> placed, shipped, delivered*/

interface State {
	String getStateName();

	void updateDateTimeStamp(Date date);

	Date getDateTimeStamp();
}

class Placed implements State {

	Date dateTimeStamp;

	@Override
	public String getStateName() {
		return "Placed";
	}

	@Override
	public void updateDateTimeStamp(Date date) {
		dateTimeStamp = date;
	}

	@Override
	public Date getDateTimeStamp() {
		return dateTimeStamp;
	}

}

class Shipped implements State {

	Date dateTimeStamp;

	@Override
	public String getStateName() {
		return "Shipped";
	}

	@Override
	public void updateDateTimeStamp(Date date) {
		dateTimeStamp = date;
	}

	@Override
	public Date getDateTimeStamp() {
		return dateTimeStamp;
	}

}

class Delivered implements State {

	Date dateTimeStamp;

	@Override
	public String getStateName() {
		return "Delivered";
	}

	@Override
	public void updateDateTimeStamp(Date date) {
		dateTimeStamp = date;
	}

	@Override
	public Date getDateTimeStamp() {
		return dateTimeStamp;
	}

}

class Order {
	State state; // Has-A relationship;

	// Whenever we create an object of Order, the state is plcaed, by default;
	Order() {
		state = new Placed();
		state.updateDateTimeStamp(new Date());
	}

	State getState() {
		return state;
	}

	void updateState(State newState) {
		state = newState;
	}
}

public class StateDesignPattern {

	public static void main(String[] args) {
		Order order = new Order();
		System.out.println("The state of order as of now is " + order.getState().getStateName());
		System.out.println("TimeStamp for the current state is " + order.getState().getDateTimeStamp());

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		State state;
		state = new Shipped();
		state.updateDateTimeStamp(new Date());

		order.updateState(state);
		System.out.println("The state of order as of now is " + order.getState().getStateName());
		System.out.println("TimeStamp for the current state is " + order.getState().getDateTimeStamp());
	}

}
