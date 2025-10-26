package com;

import java.util.ArrayList;
import java.util.List;

public class Repository<T> {
	private List<T> items = new ArrayList<>();

	public void add(T item) {
		items.add(item);
	}

	public void remove(T item) {
		items.remove(item);
	}

	public List<T> getAll() {
		return items;
	}

	public int countOccurrences(T element) {
		int count = 0;
		for(T item : items) {
			if(item == null && element == null){
				count++;
			} else if(item != null && item.equals(element)){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Repository<String> repo = new Repository<>();
		repo.add("Apple");
		repo.add("Cherry");
		repo.add("Banana");
		repo.add("Apple");

		System.out.println(repo.getAll());
		System.out.println(repo.countOccurrences("Apple"));
		repo.remove("Banana");
		System.out.println(repo.getAll());
	}

}
