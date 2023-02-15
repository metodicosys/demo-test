package com.m2a.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ExtentManager {

	private static ExtentReports extent;
	static ExtentTest test;
	static ExtentReports report;

	//public static ExtentReports getInstance() {
	public static ExtentReports createInstance(String fileName) {
	//	ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(fileName);
	//	ExtentSparkReporter sparkReporter = new ExtentSparkReporter("Spark.html");

	//	sparkReporter.config().setTheme(Theme.STANDARD);
	//	sparkReporter.config().setDocumentTitle(fileName);
	//	sparkReporter.config().setEncoding("utf-8");
	//	sparkReporter.config().setReportName(fileName);
		
		if (extent==null) {
		//	extent = new ExtentReports(System.getProperty("User.dir")+"\\target\\surefire-reports\\html\\extent.html",true,DisplayOrder.OLDEST_FIRST);
		//	extent = new ExtentReports(System.getProperty(""));
		//	extent = new ExtentReports(System.getProperty("user.dir")+"\\ExtentReportResults.html");
			extent = new ExtentReports();

			
		}

		extent = new ExtentReports();
	//	extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Automation Tester", "Meto");
		extent.setSystemInfo("Organization", "Way2Automation");
		extent.setSystemInfo("Build no", "M2A-1234");

		return extent;
	}

}
