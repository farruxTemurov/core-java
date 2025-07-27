package com;
// NOTE: Object class is the superclass of all Java classes.

//It provides essential methods like getClass(), hashCode(), equals(), toString().

class Product {
	int pid;
	String pname;
	int price;

	Product() {
		System.out.println("Product object constructed");
	}

	public Product(int pid, String pname, int price) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
	}

	void show() {
		System.out.println("Product details are " + pid + " " + pname + " " + price);
	}
}

public class ObjectDemo {

	public static void main(String[] args) {
		Product product = new Product(1, "Asus Laptop", 800);
		System.out.println("product class is " + product.getClass());
		System.out.println("product class now is " + product.getClass().getSimpleName());

		System.out.println("product is " + product);
		System.out.println("Hashcode is " + product.hashCode());

		System.out.println("product.toString() is " + product.toString());
		product.show();
	}

}
