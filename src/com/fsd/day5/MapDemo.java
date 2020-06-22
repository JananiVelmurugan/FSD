package com.fsd.day5;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {

		Map<String,String> countries = new HashMap<>();
		
		countries.put("India", "NewDelhi");
		countries.put("US","Washington");
		
		for(Map.Entry<String, String> country:countries.entrySet()) {
			System.out.println(country.getKey() + " " + country.getValue());
		}
		
		
		
		
	}
}
