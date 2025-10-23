package com;

public class Pair<T, U> {

	private final T value1;
	private final U value2;

	public Pair(T value1, U value2) {
		super();
		this.value1 = value1;
		this.value2 = value2;
	}

	public T getFirst() {
		return value1;
	}

	public U getSecond() {
		return value2;
	}

	@Override
	public String toString() {
		return "Pair [value1 = " + value1 + ", value2 = " + value2 + "]";
	}

	public static void main(String args[]) {
		Pair<String, Integer> pair = new Pair<>("Hello", 124);
		System.out.println(pair);
	}

}
