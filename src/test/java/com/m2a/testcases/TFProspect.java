package com.m2a.testcases;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.m2a.base.TestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.interactions.touch.TouchActions;
import io.appium.java_client.touch.WaitOptions;

import org.openqa.selenium.support.ui.ExpectedCondition;
//tiempo explicito
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
//wait fluido
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import java.util.concurrent.TimeUnit;


public class TFProspect extends TestBase {

	@SuppressWarnings("rawtypes")
	public TFProspect() {
		//Home
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/rlPropuesta")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/icon_return_home")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnPropuestaHome")).click();
		
		//Prospecto
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Número de documento']")).sendKeys("71077929");	
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MobileElement nverifica = (MobileElement) driver.findElement(By.xpath("//android.widget.Button[@text='Verificar']"));
		nverifica.click();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//con tiempo explicito
		By byElement = By.id("pe.com.surgir.surgirapp:id/component_datetime_input");
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(nverifica));
       
		MobileElement el1x = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/component_datetime_input");
		el1x.sendKeys("30/12/2022");
				 
		//primer nombre
		MobileElement el1 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
		el1.clear();
		el1.sendKeys("AAAA");
		//segundo nombre
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		MobileElement el2 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
		el2.clear();
		el2.sendKeys("BBBB");
	//	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//apellido paterno
		MobileElement el3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
		el3.clear();
		el3.sendKeys("DDDD");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//SCROLL
		long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.press(PointOption.point(560, 873)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(560, 255)).release().perform();
        /*

        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
        el7.clear();        
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        el7.sendKeys("990193004");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
      //CORREO
        MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
        el8.clear();
        el8.sendKeys("metodicosys@gmail.com");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		*/

		//Boton continuar
		MobileElement el18 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btn_submit_prospect");
		el18.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Scroll
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/atomicNumberDefinition\")).scrollIntoView(new UiSelector().textMatches(\"Autorización de uso de datos personales\").instance(0))")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/positive_radio_button")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//swipeScreen();
		/*
		long noOfSecondsA = 5;
		Duration durationA = Duration.ofSeconds(noOfSecondsA);
		TouchAction actionA = new TouchAction(driver); 
        actionA.press(PointOption.point(397, 951)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(397, 366)).release().perform();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);*/
       // swipeScreen();	
		
		driver.findElement(By.xpath("//android.widget.Button[@text='Continuar']")).click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists9x = driver.findElements(By.id("pe.com.surgir.surgirapp:id/summary_button_continue"));	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch9x = new TouchAction<>(driver);
		touch9x.press(PointOption.point(387,823));
		touch9x.release();
		touch9x.perform(); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
	}

	private Object getDriver() {
		// TODO Auto-generated method stub
		return null;
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
