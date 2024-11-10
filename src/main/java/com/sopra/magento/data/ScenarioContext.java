package com.sopra.magento.data;

import java.util.HashMap;
import java.util.Map;

public class ScenarioContext {

	private Map<String, Object> map;
	
	public ScenarioContext() {
		map=new HashMap<>();
	}
	
	public void setData(String key, Object value) {
		map.put(key, value);
	}
	
	public Object getData(String key) {
		return map.get(key);
	}
}
