package com.m2a.testcases;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.m2a.base.TestBase;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.nativekey.PressesKey;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;


public class TFProposal extends TestBase{
	
	public TFProposal() {
		
		
		MobileElement el3 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[1]");
		el3.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists37 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch37 = new TouchAction<>(driver);
		touch37.press(PointOption.point(109,616));//145,681  //145,721 SEGUNDO
		touch37.release();
		touch37.perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Destino del préstamo']")).click();	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<MobileElement> lists38 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch38 = new TouchAction<>(driver);
		touch38.press(PointOption.point(512,614));
		touch38.release();
		touch38.perform(); 
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Presupuesto de obra']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Presupuesto de obra']")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists23 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);	 
		TouchAction touch23 = new TouchAction<>(driver);
		touch23.press(PointOption.point(229,174));
		touch23.release();
		touch23.perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/button_gallery_listo")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
						
		driver.findElement(By.xpath("//android.widget.EditText[@text='Frecuencia de cuotas']")).click(); 	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<MobileElement> lists40 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(9000, TimeUnit.SECONDS); 
		TouchAction touch40 = new TouchAction<>(driver);
		touch40.press(PointOption.point(491,876));
		touch40.release();
		touch40.perform();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	
		driver.findElement(By.xpath("//android.widget.EditText[@text='Cantidad de cuotas']")).click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<MobileElement> lists39 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch39 = new TouchAction<>(driver);
		touch39.press(PointOption.point(52,912));
		touch39.release();
		touch39.perform(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Calcular tasa
		MobileElement elp3x = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btnCalculateRate");
		elp3x.click();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//calcular monto
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnCalculateAmount")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		//Cancela
		MobileElement elp24x = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btnCancel");
		elp24x.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnCalculateAmount")).click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Cerrar RSE
		MobileElement elp25 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btnConfirm");
		elp25.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.widget.EditText[@text='Fecha del primer vencimiento']")).sendKeys("05/03/2023");	
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		swipeScreen();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		swipeScreen();

		MobileElement elp3 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[3]");
		elp3.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists42 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch42 = new TouchAction<>(driver);
		touch42.press(PointOption.point(142,1002));
		touch42.release();
		touch42.perform(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Seguro optativo
		/*
		MobileElement elp4 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[4]");
		elp4.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists43 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch43 = new TouchAction<>(driver);
		touch43.press(PointOption.point(542,781)); // 503,649  552,821-PLA1
		touch43.release();
		touch43.perform(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		*/
		
		//SEGURO DESGRAVAMEN
		driver.findElement(By.xpath("//*[@text='Agregar']")).click();  	
		driver.findElement(By.xpath("//*[@text='Tipo de documento']")).click(); 
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists44 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch44 = new TouchAction<>(driver);
		touch44.press(PointOption.point(223,504));
		touch44.release();
		touch44.perform(); 
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Número de documento']")).sendKeys("31323334");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Primer nombre']")).sendKeys("TESTA");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Segundo nombre']")).sendKeys("TESTB");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Apellido paterno']")).sendKeys("TESTC");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Apellido materno']")).sendKeys("TESTD");	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		//SCROLL
		long noOfSeconds = 5;
		Duration duration = Duration.ofSeconds(noOfSeconds);
		TouchAction action = new TouchAction(driver); 
        action.press(PointOption.point(540, 970)).waitAction(WaitOptions.waitOptions(Duration.ofSeconds(7)))
                        .moveTo(PointOption.point(540, 414)).release().perform();
		
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Fecha de Nacimiento']")).sendKeys("01/01/2000");	
		swipeScreen();
		
		//Estado civil
		MobileElement elp7 = (MobileElement) driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[1]");
		elp7.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists45 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch45 = new TouchAction<>(driver);
		touch45.press(PointOption.point(240,732));
		touch45.release();
		touch45.perform(); 
		
		//Genero
		MobileElement elp7x = (MobileElement) driver.findElementByXPath("(//android.widget.ImageButton[@content-desc=\"Mostrar menú desplegable\"])[2]");
		elp7x.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<MobileElement> lists45x = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch45x = new TouchAction<>(driver);
		touch45x.press(PointOption.point(241,649)); //FEMENINO
		touch45x.release();
		touch45x.perform(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//telefono
		driver.findElement(By.xpath("//android.widget.EditText[@text='Celular']")).sendKeys("990194545");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE)); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Parentesco
		driver.findElement(By.xpath("//*[@text='Parentesco']")).click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List <MobileElement> List1 = driver.findElements(By.xpath("//*[@text='Parentesco']"));
		System.out.print(List1);
		List<MobileElement> lists46 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch46 = new TouchAction<>(driver);
		touch46.press(PointOption.point(264,897)); // arriba 250, 557
		touch46.release();
		touch46.perform();
		
		//seguros asociados
		MobileElement elp9 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.RelativeLayout[4]/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ImageButton");
		elp9.click();
		swipeScreen();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		List<MobileElement> lists47 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/txt_view"));
		TouchAction touch47 = new TouchAction<>(driver);
		touch47.press(PointOption.point(224,892));
		touch47.release();
		touch47.perform(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		MobileElement elp9x = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout/android.widget.EditText");
		elp9x.sendKeys("100");
		
		//Guardar beneficiario
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btn_submit_prospect")).click();	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		//Guardar propuesta
		MobileElement elP1 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btnFormBusinessSave");
		elP1.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		MobileElement el2 = (MobileElement) driver.findElementById("pe.com.surgir.surgirapp:id/btnFormBusinessNext");
		el2.click();

		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		MobileElement el1p1 = (MobileElement) driver.findElementByAccessibilityId("Contrato");
		el1p1.click();
	
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
