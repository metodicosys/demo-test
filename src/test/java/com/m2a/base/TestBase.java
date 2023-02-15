package com.m2a.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.remote.DesiredCapabilities;
//import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.Reporter;
//import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.m2a.listeners.CustomListeners;
import com.m2a.listeners.ReportTest;
import com.m2a.utilities.ExtentManager;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TestBase  extends ReportTest{

	/*
	 * Automation - Test base, By, ExtentReports Jenkins
	 */

	protected static AppiumDriver<MobileElement> driver;
	//public ExtentReports rep = ExtentManager.getInstance();
	public static ExtentTest test;

	@BeforeTest
	public void setup() {

		try {
			File f = new File("src/test/resources/apks");
		//	File fs = new File(f, "Surgir_debug(2.2.4-beta).apk"); // APK sin horario
		//	File fs = new File(f, "app_PRDCargaDiaria13.apk"); // APK
		//	File fs = new File(f, "mesa-productosFeaturecarga-diaria.apk"); // CARGA DIARIA 
			File fs = new File(f, "Surgir_Release4_18_recglasedad.apk"); // ASINCRONO STGAING
			
			DesiredCapabilities caps = new DesiredCapabilities();
			AppiumDriver<MobileElement> appiumDriver;

			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung SM-T395"); // Active 2
		//	caps.setCapability(MobileCapabilityType.DEVICE_NAME, "samsung SM-T575");
			// //Active 3
			caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
			caps.setCapability(MobileCapabilityType.APP, "com.android.contacts");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 1200);
			caps.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
			caps.setCapability("ignoreHiddenApiPolicyError", true); //ultimo
		//	caps.setCapability("eventTiming"=true); API

			caps.setCapability("appWaitActivity", ".ui.login.LoginActivity,.ui.splash.SplashActivity");
			@SuppressWarnings("unused")
			URL url = new URL("http://127.0.0.1:4723/wd/hub");
			driver = new AndroidDriver<MobileElement>(url, caps);
			
			
		//	appiumDriver = new AppiumDriver<>(url, caps);
						
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, 60);

		} catch (Exception exp) {
			System.out.println("Cause is" + exp.getCause());
			System.out.println("Message is" + exp.getMessage());
			exp.printStackTrace();

		}

	}

	@Test
	public void appTest() {
		System.out.println("Ejecutando test");

	}

	@AfterTest
	public void teardown() {
		// driver.close();
		// driver.quit();

	}

}
