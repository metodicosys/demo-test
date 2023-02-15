package com.m2a.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import com.m2a.base.TestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.touch.offset.PointOption;

public class TFBusiness extends TestBase{

	public TFBusiness() {
	//Negocio
	driver.findElement(By.xpath("//android.widget.TextView[@text='Selfie en el negocio']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Selfie en el negocio']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<MobileElement> lists23 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
	TouchAction touch23 = new TouchAction<>(driver);
	touch23.press(PointOption.point(229,174));
	touch23.release();
	touch23.perform();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.id("pe.com.surgir.surgirapp:id/button_gallery_listo")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	swipeScreen();
	
	//Inicio de multiriesgo
	/*
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.EditText[@text='Categoría de construcción']")).click();		
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	List<MobileElement> lists1 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	TouchAction touch1 = new TouchAction<>(driver);
	touch1.press(PointOption.point(179,870));
	touch1.release();
	touch1.perform();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de edificación']")).click();		
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	List<MobileElement> lists2 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	TouchAction touch2 = new TouchAction<>(driver);
	touch2.press(PointOption.point(514,918));
	touch2.release();
	touch2.perform();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.EditText[@text='Material de la edificación']")).click();		
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	List<MobileElement> lists3 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	TouchAction touch3 = new TouchAction<>(driver);
	touch3.press(PointOption.point(87,787));
	touch3.release();
	touch3.perform();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	driver.findElement(By.xpath("//android.widget.EditText[@text='Área del terreno en m2']")).sendKeys("100");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	swipeScreen();
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	driver.findElement(By.xpath("//android.widget.EditText[@text='Área de la edificación en m2']")).sendKeys("100");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	driver.findElement(By.xpath("//android.widget.EditText[@text='Nº de pisos de la edificación']")).sendKeys("5");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	
	
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
//	driver.findElement(By.xpath("//android.widget.EditText[@text='Nº de pisos de la edificación']")).sendKeys("5");
//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	
	
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	driver.findElement(By.xpath("//android.widget.EditText[@text='Año fabricación de la edificación']")).sendKeys("5");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	swipeScreen();
	*/
	// fin multiriesgo
	
	//SCROLL
//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Número de empleados\").instance(0))")).click();	                                                                                           
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//android.widget.EditText[@text='Tiempo función en años']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<MobileElement> lists12 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	TouchAction touch12 = new TouchAction<>(driver);
	touch12.press(PointOption.point(55,971));
	touch12.release();
	touch12.perform();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//android.widget.EditText[@text='Experiencia en años']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<MobileElement> lists24 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	TouchAction touch24 = new TouchAction<>(driver);
	touch24.press(PointOption.point(472,971));
	touch24.release();
	touch24.perform(); 
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	driver.findElement(By.xpath("//android.widget.EditText[@text='Inicio de la actividad']")).sendKeys("01/01/2020");	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de establecimiento']")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	List<MobileElement> lists30 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	TouchAction touch30 = new TouchAction<>(driver);
	touch30.press(PointOption.point(516,1052));
	touch30.release();
	touch30.perform(); 
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//android.widget.EditText[@text='Número de empleados']")).sendKeys("1");
//	((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	
	driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessSave")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessNext")).click();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	}
	
	@Test
	public void swipeScreen() {
		Dimension dim = driver.manage().window().getSize();
		int height = dim.getHeight();
		int width = dim.getWidth();
		
		int startx=width/2;
		int endx=width/2;
		int starty=(int) (height*.40);
		int endy= (int) (height*.10);
		
		TouchAction action = new TouchAction(driver);
		action.press(PointOption.point(startx, starty))
		.moveTo(PointOption.point(endx, endy))
		.release()
		.perform();
		
	}
}
