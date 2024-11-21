package com.sopra.magento.tests;

import java.io.File;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;

public class PPPP {

	AppiumDriver driver;
	DesiredCapabilities caps;
	
	public String NodeModulesAppiumMainJs = System.getProperty("user.home") + File.separator
			+ "AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js";
	public String NodePath = "C:\\Program Files\\nodejs\\node.exe";
	public String ipAddress = "127.0.0.1";
	
	public AppiumServiceBuilder serviceBuilder;
	public AppiumDriverLocalService appiumService;
	
	String urlAppium;
	
	public void setup() {
serviceBuilder = new AppiumServiceBuilder();
		

		serviceBuilder.withAppiumJS(new File(NodeModulesAppiumMainJs));
		serviceBuilder.usingDriverExecutable(new File(NodePath));
		serviceBuilder.withIPAddress(ipAddress);
		serviceBuilder.usingAnyFreePort();
		serviceBuilder.withArgument(GeneralServerFlag.LOG_LEVEL, "error");
		appiumService = serviceBuilder.build();
		
		//if (!appiumService.isRunning()) {
			urlAppium=appiumService.getUrl().toString();
			System.out.println("starting appium server at " + appiumService.getUrl().toString());
	}
	public static void main(String[] args) {
		PPPP pp=new PPPP();
		pp.setup();

	}

}
