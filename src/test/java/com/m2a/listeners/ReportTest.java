package com.m2a.listeners;

import java.util.Date;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportTest {

	static Date d = new Date();
	static String fileName = "Extent_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
	
	
//	static String messageBody;
	protected ExtentReports extent;
	ExtentSparkReporter spark;
//	ThreadLocal<ExtentTest> testReport;
	
	
	@BeforeSuite
	public void reportListener() {
	    extent = new ExtentReports();
		spark = new ExtentSparkReporter(fileName);
		extent.attachReporter(spark);
	}
	
	
	@AfterSuite
	public void onFinish(){
		if (extent != null) {

			extent.flush();
		}
		
	}
}
