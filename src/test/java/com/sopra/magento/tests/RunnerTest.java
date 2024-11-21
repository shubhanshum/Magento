package com.sopra.magento.tests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class RunnerTest {

	protected static 
    ThreadLocal<WebDriver> threadLocalDriver = new ThreadLocal<>();
	
	@Parameters({ "url"})
	@BeforeClass
	public void launchBrowserAndNavigateToUrl(String browserName,String url) {
		browserName= System.getProperty("browserName");
		if (browserName.equalsIgnoreCase(browserName)) {
			ChromeOptions options=new ChromeOptions();
			options.addArguments("--ignore-ssl-errors=yes");
			options.addArguments("--ignore-certificate-errors");
			//options.addArguments("--headless");
			threadLocalDriver.set(new ChromeDriver(options));
		}
		else if (browserName.equalsIgnoreCase("Firefox")){
			FirefoxOptions options=new FirefoxOptions();
			options.addArguments("--ignore-ssl-errors=yes");
			options.addArguments("--ignore-certificate-errors");
			threadLocalDriver.set(new FirefoxDriver(options));
		}
		else {
			System.out.println("Browser not defined");
		}
		getDriver().manage().window().maximize();
		getDriver().get(url);
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	}
	
	public static WebDriver getDriver(){
        return threadLocalDriver.get();
    }
	
	@AfterClass
	public void quitSession() {
		getDriver().quit();
		threadLocalDriver.remove();
	}
}
