package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BaseConfig {
	
	public static String getConfigValue(String value) {//return method
		//file location
		File file = new File("/Users/parthadebnath/eclipse-Batch-40/practice/Smart-IT/Config.properties");
		
		//file data ==> stream
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		//to read each value
		Properties pro = new Properties();
		try {
			pro.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println(pro.getProperty(value));
		
		return pro.getProperty(value);
	}
	public static void main(String[] args) {
		getConfigValue("DEV_URL");
		getConfigValue("QA_URL");
		getConfigValue("STAGE_URL");
		getConfigValue("PROD_URl");
		getConfigValue("Email");
		getConfigValue("Password");
		
		
	}


}
