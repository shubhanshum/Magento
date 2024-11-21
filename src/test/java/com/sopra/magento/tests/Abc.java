package com.sopra.magento.tests;

import java.time.Duration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

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
