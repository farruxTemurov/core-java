package com;

public class countOccurrences {

	public static void main(String[] args) {
		String[] words = { "apple", "banana", "apple", "orange" };
		int count = countOccurrences(words, "orange");
		System.out.println("Count of orange is " + count);
	}

	public static <T> int countOccurrences(T[] array, T element) {
		int count = 0;
		for(T item : array) {
			if(item == null && element == null) {
				count++;
			} else if(item != null && item.equals(element)) {
				count++;
			}
		}
		return count;
	}

}
