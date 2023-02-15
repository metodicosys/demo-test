package com.m2a.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.m2a.base.TestBase;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;

public class TFLogin<TesLoginLocal> extends TestBase {

	@Test
	public void testOne() {
		
		try {
		ExtentTest test = extent.createTest("Automation Test","Login");
		test.pass("Pass");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Usuario']")).sendKeys("asesorqa");
	//	test.log(Status.PASS, "Usuario");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Contraseña']")).sendKeys("Surgir.2026");
	//	test.log(Status.PASS, "Password");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnLogin")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		extent.createTest("MyFirstTest Login")
		.info("info")
		.pass("pass")
		.warning("warnin")
		.skip("skip")
		.fail("fail");

		// Sesion Local
		driver.findElement(By.xpath("//android.widget.EditText[@text='Agencia']")).click();
		List lists = driver.findElements(By.xpath("//android.widget.EditText[@text='Agencia']"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TouchAction touch = new TouchAction<>(driver);
		touch.press(PointOption.point(300, 649));
		touch.release();
		touch.perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Rol']")).click();
		List lists1 = driver.findElements(By.xpath("//android.widget.EditText[@text='Rol']"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		TouchAction touch1 = new TouchAction<>(driver);
		// touch1.press(PointOption.point(256,730)); //Grupal
		touch1.press(PointOption.point(256, 777)); // Individual
		// touch1.press(PointOption.point(256,820)); //MENU POR PROCESO
		touch1.release();
		touch1.perform();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnLoginRol")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		selectLoginTest();
		selectProspectTest();
		selectCustomerTest();
		selectBusinessTest();
		selectRseTest();
		selectProposalTest();
		selectContractTest();
		selectSignatureTest();
		}
		catch (Exception exp) {
			System.out.println("Cause is: "+ exp.getCause());
			System.out.println("Message is: "+ exp.getMessage());
		}

	}

	private void selectLoginTest() {
		// TODO Auto-generated method stub
		TFLoginLocal testLoginLocal = new TFLoginLocal();
		
	}
	
	private void selectProspectTest() {
		TFProspect testProspect = new TFProspect();
	}
	
	private void selectCustomerTest() {
		TFCustomer testCustomer = new TFCustomer();
	}

	private void selectBusinessTest() {
		TFBusiness testBusiness = new TFBusiness();
	}
	
	private void selectRseTest() {
		TFRse testRse = new TFRse();
	}
	
	private void selectProposalTest() {
		TFProposal testProposal = new TFProposal();
	}
	
	private void selectContractTest() {
		TFContract testContract = new TFContract();
	}
	
	private void selectSignatureTest() {
		TFSignature testSignature = new TFSignature();
	}
	
}
