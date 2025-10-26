package com;

import java.util.*;

public class Library<T> {
	
	public Library(){
		totalLibraries++;
	}

	private List<T> items = new ArrayList<>();
	public static int totalLibraries = 0;

	public void add(T item) {
		items.add(item);
	}

	public List<T> getAll() {
		return items;
	}

	public static int getTotalLibraries() {
		return totalLibraries;
	}

	public static void main(String[] args) {
		Library<String> books = new Library<>();
		books.add("Harry Poter");
		books.add("Dune");

		Library<String> movies = new Library<>();
		movies.add("Inception");
		movies.add("Avatar");
		
		System.out.println("Books: "+books.getAll());
		System.out.println("Movies: "+movies.getAll());
		System.out.println("Total libraries created: " +Library.getTotalLibraries());
	}

}
