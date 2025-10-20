package com;

class Parent {

	String fname;
	String lname;
	int wealth;

	Parent() {
		fname = "Tim";
		lname = "Belaruskikh";
		wealth = 10000;
		System.out.println("Parent object constructed");
	}

	public Parent(String fname, String lname, int wealth) {
		this.fname = fname;
		this.lname = lname;
		this.wealth = wealth;
		System.out.println("Parents parameterized constructor");
	}

	void purchaseCar() {
		System.out.println("Let's buy Lambo STO");
	}

	void show() {
		System.out.println("Parent details " + fname + " " + lname + " " + wealth);
	}
}

class Child extends Parent {
	Child() {
//		super(); // this is for default parent constructor 
		super("John", "Wick", 50299);
		System.out.println("Child object constructed");
	}

	void purchaseCar() {
//		super.purchaseCar(); 
		System.out.println("Let's buy Dodge challenger");
	}
}

public class SuperDemo {

	public static void main(String[] args) {
		Child child = new Child();
		child.show();
		child.purchaseCar();
	}

}
