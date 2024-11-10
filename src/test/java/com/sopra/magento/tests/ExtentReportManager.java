package com.sopra.magento.tests;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportManager extends RunnerTest implements ITestListener{

	ExtentSparkReporter sparkReporter;
	ExtentReports extent;
	ExtentTest test;
	
	@Override
	public void onStart(ITestContext context) {
		sparkReporter=new ExtentSparkReporter(System.getProperty("user.dir")+"\\Reports\\report.html");
		sparkReporter.config().setDocumentTitle("Magento Automation Report");
		sparkReporter.config().setReportName("Automation Tests");
		sparkReporter.config().setTheme(Theme.STANDARD);
		
		extent=new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("OS", "Windows");
		extent.setSystemInfo("Browser", "Chrome");
		
	}
	
	@Override
	public void onTestSuccess(ITestResult result) {
		test=extent.createTest(result.getTestClass().getName());
		test.log(Status.PASS, "Test case passed is - "+result.getName());
	}
	
	@Override
	public void onTestFailure(ITestResult result) {
		test=extent.createTest(result.getName());
		test.log(Status.FAIL, "Test case failed is - "+result.getName());
		test.log(Status.FAIL, "Test case failed cause is - "+result.getThrowable());
		File srcFile=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
		//FileUtils.copyFile(srcFile, new File(System.getProperty("user.dir"))+"\\Screenshots\\title.png");
		
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
