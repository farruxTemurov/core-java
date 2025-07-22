package com;

class User {
	static int ObjectSerialNumber = 0;
	String name;
	String phone;
	String email;

	User() {
		ObjectSerialNumber++;
		name = "";
		phone = "";
		email = "";
		System.out.println("User object constructed with serial number " + ObjectSerialNumber + " this is " + this);
	}

	User(String name) {
		this.name = name.isEmpty() ? "NA" : name;
	}

	User(String name, String phone, String email) {
		this(name); // this will execute the above constructor with only the name parameter
		this.phone = phone;
		this.email = email;
	}

	void show() {
		System.out.println("User details " + name + " " + phone + " " + email);
	}
}

// Reference variable this will always hold the current object's hashcode
public class Thisdemo {
	public static void main(String[] args) {
//		User user1 = new User();
//		System.out.println("User1 is " + user1);
//		System.out.println("");
//		User user2 = new User();
//		System.out.println("User2 is " + user2);

		User user = new User("", "+99 000 11 22", "example@.com");
		user.show();

	}
}
