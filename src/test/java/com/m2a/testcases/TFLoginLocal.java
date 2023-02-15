package com.m2a.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.m2a.base.TestBase;

import io.appium.java_client.MobileElement;


public class TFLoginLocal extends TestBase{

	//@Test
	public TFLoginLocal() {

		//Contraseña Local
		MobileElement element1 = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@text='Nueva contraseña local']");
	//	String elText = element.getText();
		System.out.println(element1);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Nueva contraseña local']")).sendKeys("Prueba1234");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Confirmación de contraseña local']")).sendKeys("Prueba1234");
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnIngresar")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}

	@Test
	public void testOnex() {

		//Contraseña Local
		MobileElement element1 = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@text='Nueva contraseña local']");
	//	String elText = element.getText();
		System.out.println(element1);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Nueva contraseña local']")).sendKeys("Prueba1234");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Confirmación de contraseña local']")).sendKeys("Prueba1234");
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnIngresar")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}

	
}