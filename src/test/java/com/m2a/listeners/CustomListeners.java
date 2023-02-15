package com.m2a.listeners;

import java.io.IOException;
import java.lang.module.ModuleDescriptor.Exports;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
//import java.util.Arrays;
//import java.util.Date;
import java.util.Date;

import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
//import org.testng.internal.TestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.m2a.base.TestBase;
import com.m2a.utilities.ExtentManager;
import com.m2a.utilities.TestConfig;
import com.m2a.utilities.TestUtil;

public class CustomListeners extends TestBase implements ITestListener, ISuiteListener {

	static Date d = new Date();
	static String fileName = "Extent_" + d.toString().replace(":", "_").replace(" ", "_") + ".html";
	static String messageBody;
	private static ExtentReports extent = ExtentManager
			.createInstance(System.getProperty("user.dir") + "\\reports\\" + fileName);
	public static ThreadLocal<ExtentTest> testReport = new ThreadLocal<ExtentTest>();
	
	
	/*

	public void onTestStart(ITestResult result) {

	}

	public void onTestSuccess(ITestResult result) {

		String methodName = result.getMethod().getMethodName();
		String logText = "<b>" + "TEST CASE:- " + methodName.toUpperCase() + " PASSED" + "</b>";

	}

	public void onTestFailure(ITestResult result) {

		String excepionMessage=Arrays.toString(result.getThrowable().getStackTrace());
		testReport.get().fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>" + "Exception Occured:Click to see"
				+ "</font>" + "</b >" + "</summary>" +excepionMessage.replaceAll(",", "<br>")+"</details>"+" \n");

		try {

			TestUtil.captureScreenshot();

		} catch (IOException e) {

		}

		String failureLogg = "TEST CASE FAILED";

	}

	public void onTestSkipped(ITestResult result) {
		String methodName = result.getMethod().getMethodName();
		String logText = "<b>" + "Test Case:- " + methodName + " Skipped" + "</b>";

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}

	public void onStart(ITestContext context) {

	}

	public void onFinish(ISuite arg0) {
		/*
		 * MonitoringMail mail = new MonitoringMail();
		 * 
		 * try { messageBody = "http://" + InetAddress.getLocalHost().getHostAddress() +
		 * ":8080/job/DataDrivenLiveProject/Extent_Reports/"; } catch
		 * (UnknownHostException e) { // TODO Auto-generated catch block
		 * e.printStackTrace(); }
		 * 
		 * try { mail.sendMail(TestConfig.server, TestConfig.from, TestConfig.to,
		 * TestConfig.subject, messageBody); } catch (AddressException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } catch (MessagingException
		 * e) { // TODO Auto-generated catch block e.printStackTrace(); }
		 */

//	}*/

	public void onStart(ISuite arg0) {
		// TODO Auto-generated method stub

	}

	public void onFinish(ITestContext context) {

		if (extent != null) {

			extent.flush();
		}

	}

}
