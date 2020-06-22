package com.fsd.day5;

import java.util.HashSet;
import java.util.Set;

public class ListSetDemo {

	public static void main(String[] args) {

//		List<String> names = new ArrayList<>();
		Set<String> names = new HashSet<>();

		names.add("Rakshith");
		names.add("Naga");
		names.add("Geo");
		names.add("Janani");
		names.add("Naga");

		for (String name : names) {
			System.out.println(name);
		}

	}

}
