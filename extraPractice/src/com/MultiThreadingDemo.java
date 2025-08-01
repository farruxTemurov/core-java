package com;


class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 3; i++) {
			System.out.println(Thread.currentThread().getName() + " is running");
		}
	}
}

public class MultiThreadingDemo {
	
	public static void main(String[] args) {
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		
		t1.start();
		t2.start();
		
		System.out.println("Main thread finished starting threads");
	}
	
}