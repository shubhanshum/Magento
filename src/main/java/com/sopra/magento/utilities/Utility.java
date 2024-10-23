package com.sopra.magento.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public static String getPropFileData(String key) {
		FileInputStream file;
		String value="";
		try {
			file = new FileInputStream(System.getProperty("user.dir")+"//src//main//java//com//sopra//magento//configuration//config.properties");
			Properties prop=new Properties();
			prop.load(file);
			value=prop.getProperty(key);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
