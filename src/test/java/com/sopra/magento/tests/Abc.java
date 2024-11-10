package com.sopra.magento.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Abc {

	public static void main(String[] args) {
		Map<Integer, ArrayList<Object>> map=new HashMap<>();
		ArrayList<Object> list=new ArrayList<>();
		list.add("Hi");
		list.add(267);
		map.put(101, list);
		System.out.println(map.get(101));

	}

}
