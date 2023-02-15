package com.m2a.testcases;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.android.library.AndroidWebElement;
import org.testng.annotations.Test;

import com.m2a.base.TestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class TFContract extends TestBase{
	
	public TFContract() {
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
//		MobileElement el1d = (MobileElement) driver.findElementByAccessibilityId("Contrato");
//		el1d.click();
		//Contrato
	//	MobileElement abc = driver.findElement(By.xpath("//*[@text='Desembolso']")); 
	//	if(abc.equals("Desembolso")) {
			driver.findElement(By.id("pe.com.surgir.surgirapp:id/list")).click();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			List lists43 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
			TouchAction touch43 = new TouchAction<>(driver);
			touch43.press(PointOption.point(102,827));
			touch43.release();
			touch43.perform(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	//	}
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de desembolso']")).click(); 

		driver.findElement(By.xpath("//android.widget.EditText[@text='Entidad bancaria']")).click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List lists44 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch44 = new TouchAction<>(driver);
		touch44.press(PointOption.point(46,567));
		touch44.release();
		touch44.perform(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Comprobante de cuenta']")).click();	
		driver.findElement(By.xpath("//android.widget.TextView[@text='Comprobante de cuenta']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List lists45 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touch45 = new TouchAction<>(driver);
		touch45.press(PointOption.point(229,174));
		touch45.release();
		touch45.perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/button_gallery_listo")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		swipeScreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Número de cuenta']")).sendKeys("1111000002222");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Código de cuenta interbancario']")).sendKeys("10101010101010101010");	
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Scroll Autorizacion
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Comentario/s de crédito\").instance(0))")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/chkLink")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/etInputGeneral")).sendKeys("Conforme");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessSave")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessNext")).click();
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
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
