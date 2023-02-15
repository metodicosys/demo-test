package com.m2a.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import com.m2a.base.TestBase;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.touch.offset.PointOption;

@Test
public class TFRse extends TestBase{
	
	public TFRse() {
		
		//RSE
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/autoCompleteTextView")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/autoCompleteTextView")).sendKeys("VE");
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List lists31 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/rl1"));
		TouchAction touch31 = new TouchAction<>(driver);
		touch31.press(PointOption.point(140,253));
		touch31.release();
		touch31.perform(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//caja
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")).sendKeys("10");;
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
		el4.sendKeys("15");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
		el5.sendKeys("20");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
		el6.sendKeys("25");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText");
		el7.sendKeys("30");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el8 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText");
		el8.sendKeys("35");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.RelativeLayout[1]/android.widget.LinearLayout[7]/android.widget.FrameLayout/android.widget.EditText");
		el9.sendKeys("40");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		swipeScreen();
		
		MobileElement el10 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
		el10.sendKeys("45");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el11 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
		el11.sendKeys("50");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el12 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
		el12.sendKeys("55");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el13 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
		el13.sendKeys("60");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el14 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[2]/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText");
		el14.sendKeys("65");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		swipeScreen();
		swipeScreen();
		
		MobileElement el15 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
		el15.sendKeys("23");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el16 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
		el16.sendKeys("24");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el17 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
		el17.sendKeys("25");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		MobileElement el18 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[3]/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
		el18.sendKeys("26");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		MobileElement el19 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.EditText");
		el19.sendKeys("1");
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		swipeScreen();
		
		MobileElement el20 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/rse_add_product");
		el20.click();
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//	MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
	//	el21.sendKeys("PAPAS");
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	 
	 
		
/*			
		driver.findElement(By.xpath("//android.widget.EditText[@text='Unidad de medida']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists1 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		TouchAction touch1 = new TouchAction<>(driver);
		touch1.press(PointOption.point(250,717));
		touch1.release();
		touch1.perform(); 
	*/	
		
		
		
		MobileElement el23 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
		el23.sendKeys("100");
		WebElement el24 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
		el24.sendKeys("100");
		MobileElement el22 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
		el22.sendKeys("6000");
		MobileElement el21 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText");
		el21.sendKeys("PAPAS");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Unidad de medida']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists1 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		TouchAction touch1 = new TouchAction<>(driver);
		touch1.press(PointOption.point(250,717));
		touch1.release();
		touch1.perform(); 
		
		
		
		MobileElement el25 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btn_submit_prospect");
		el25.click();
		
		
		String text1 = driver.findElement(By.id("pe.com.surgir.surgirapp:id/rse_title_result_state")).getText();
		System.out.println(text1);
		if(text1.equals("Estado de resultados")) {
			swipeScreen();
		}
		//Save
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessSave")).click();
		swipeScreen();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		//Agregar deudas
		MobileElement el26 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/rse_add_expenses");
		el26.click();
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Destino de la deuda']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists2 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch2 = new TouchAction<>(driver);
		touch2.press(PointOption.point(240,544));
		touch2.release();
		touch2.perform(); 
		
		MobileElement el27 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/autoCompleteTextView");
		el27.sendKeys("ABC");
		MobileElement el28 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
		el28.sendKeys("2000");
		MobileElement el29 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.FrameLayout/android.widget.EditText");
		el29.sendKeys("500");
		MobileElement el30 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.FrameLayout/android.widget.EditText");
		el30.sendKeys("250");
		
		//Cantidad de cuotas pactadas
		MobileElement el31 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[5]/android.widget.FrameLayout/android.widget.EditText");
		el31.sendKeys("8");
		swipeScreen();
		
		MobileElement el32 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[6]/android.widget.FrameLayout/android.widget.EditText");
		el32.sendKeys("6");
		MobileElement el33 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btn_submit_prospect");
		el33.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		
		
		String text2 = driver.findElement(By.id("pe.com.surgir.surgirapp:id/tv_title_gross_income")).getText();
			

		System.out.println(text2);
		if(text2.equals("Ingreso bruto")) {
			swipeScreen();
		}
		
		
		
		//Save
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessSave")).click();
		swipeScreen();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
	//	swipeScreen();
		
	//	swipeScreen();
	
		/*
		driver.findElement(By.xpath("//android.widget.EditText[@text='Margen bruto']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists32 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/rl1"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch32 = new TouchAction<>(driver);
		touch32.press(PointOption.point(477,687));
		touch32.release();
		touch32.perform(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		*/
		
		/*
		driver.findElement(By.xpath("//android.widget.EditText[@text='Ingreso mensual del negocio']")).sendKeys("6000");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		swipeScreen();
		*/
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Gasto de personal']")).sendKeys("10");
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Alquiler']")).sendKeys("10");
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.widget.EditText[@text='Transporte']")).sendKeys("10");
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Gastos financieros']")).sendKeys("10");
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Mantenimiento (Agua/luz/gas)']")).sendKeys("10");
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Otros servicios (Internet/teléfono/celular)']")).sendKeys("10");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Otros gastos']")).sendKeys("10");
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		swipeScreen();
		
		
		//Gastos familiares mensuales
		driver.findElement(By.xpath("//android.widget.EditText[@text='Alimentación']")).sendKeys("15");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Salud']")).sendKeys("15");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Alquiler vivienda']")).sendKeys("15");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Servicios públicos vivienda']")).sendKeys("15");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Educación']")).sendKeys("15");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Transporte']")).sendKeys("15");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		swipeScreen();
		
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Deudas (Obligaciones financieras)']")).sendKeys("20");	
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Entretenimiento']")).sendKeys("20");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		swipeScreen();
		//String text=driver.findElements(By.id("pe.com.surgir.surgirapp:id/etInputGeneral")).get(i).getText();
	//	String text=driver.findElements(By.xpath("//android.widget.EditText[@text='Entretenimiento']")).get(0).getText();
	//	String text1=driver.findElement(By.xpath("//android.widget.EditText[@text='Entretenimiento']")).getText();
	//	MobileElement element = (MobileElement) driver.findElementByXPath("//android.widget.EditText[@text='Entretenimiento']");
	//	String elText = element.getText();
	//	System.out.println(text);
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Sí']")).click(); 	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		swipeScreen();
		
		
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		MobileElement el32x = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/etInputGeneral");
		el32x.sendKeys("300");
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Otros ingresos (Dependiente/asalariado)']")).sendKeys("10");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Constancia de otros ingresos']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Constancia de otros ingresos']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists33 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touch33 = new TouchAction<>(driver);
		touch33.press(PointOption.point(229,174));
		touch33.release();
		touch33.perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/button_gallery_listo")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Origen de otros ingresos']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists35 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch35 = new TouchAction<>(driver);
		touch35.press(PointOption.point(72,866));//128,750
		touch35.release();
		touch35.perform(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		swipeScreen();
		
		
		
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Otros gastos']")).sendKeys("20");	
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessSave")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessNext")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
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
