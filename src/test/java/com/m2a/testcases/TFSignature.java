package com.m2a.testcases;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import com.m2a.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TFSignature extends TestBase{

	
	public TFSignature() {
		
	//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"android.widget.LinearLayout\")).scrollIntoView(new UiSelector().TextView(\"Tasa de interés\").instance(0))")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/primaryScroll\")).scrollIntoView(new UiSelector().textMatches(\"Uso de datos personales\").instance(0))")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


	//	MobileElement els1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView");
	//	els1.click();
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/chk")).click(); 
		
		/*
		driver.findElement(By.xpath("//android.widget.ImageView[@text='']")).click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists46x = driver.findElements(By.id("pe.com.surgir.surgirapp:id/imgSign"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch46x = new TouchAction<>(driver);
		touch46x.press(PointOption.point(732,986));
		touch46x.release();
		touch46x.perform(); 
		*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/confirmationSignDucAsesorCheckbox")).click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/confirmationSignDucClienteCheckbox")).click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@text='Continuar']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	//	MobileElement elf1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/androidx.viewpager.widget.ViewPager/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout");
	//	elf1.click();
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/chk")).click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		swipeScreen();
		
		/*
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/chkConfirmaLeerCliente")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		swipeScreen();
		*/
	//	pe.com.surgir.surgirapp:id/confirmationSignDucAsesorCheckbox
	//	pe.com.surgir.surgirapp:id/confirmationSignDucClienteCheckbox
	//	pe.com.surgir.surgirapp:id/confirmationSignDucContinueButton   Continuar
		/*
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/chkAudio")).click();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		swipeScreen();
		swipeScreen();*/
		/*
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/chkDigitalSign")).click();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		swipeScreen();
		*/	
		/*
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MobileElement el1 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/sign");
		el1.click();
		*/
		  
	    TouchAction touchAction = new TouchAction(driver);

	    touchAction.longPress(PointOption.point(333, 783))
	               .moveTo(PointOption.point(420, 710))
	               .release()
	               .perform();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/id_chk_acepta")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/llSaveSign")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnGuardar")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFirmarSeguros")).click();  
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Autorizacion de datos
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/negative_radio_button")).click(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.Button[@text='Continuar']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//Finalizar
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnConfirm")).click();
		
		
		//Enviar
		
		
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
