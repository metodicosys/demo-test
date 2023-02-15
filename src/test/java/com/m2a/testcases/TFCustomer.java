package com.m2a.testcases;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.m2a.base.TestBase;
import com.m2a.utilities.Swippeall;
import com.m2a.utilities.Swippeall.Direction;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.offset.PointOption;


public class TFCustomer extends TestBase {
	

	public TFCustomer() {
		
		try {

		MobileElement el1c = (MobileElement) driver.findElementByAccessibilityId("Cliente");
		el1c.click();
		el1c.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Formulario cliente
		driver.findElement(By.xpath("//android.widget.TextView[@text='Perfil de Experian']")).click();	
		driver.findElement(By.xpath("//android.widget.TextView[@text='Perfil de Experian']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<MobileElement> lists4 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		TouchAction touch4 = new TouchAction<>(driver);
		touch4.press(PointOption.point(230,170));
		touch4.release();
		touch4.perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/button_gallery_listo")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		/*extent.createTest("MyFirstTest Customer")
		.info("info")
		.pass("pass")
		.warning("warnin")
		.skip("skip")
		.fail("fail");*/
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Foto del documento (Frente)']")).click();	
		driver.findElement(By.xpath("//android.widget.TextView[@text='Foto del documento (Frente)']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<MobileElement> lists5 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	 
		TouchAction touch5 = new TouchAction<>(driver);
		touch5.press(PointOption.point(427,168));
		touch5.release();
		touch5.perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/button_gallery_listo")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.TextView[@text='Foto del documento (Verso)']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Foto del documento (Verso)']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 	 
		List<MobileElement> lists6 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery")); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		TouchAction touch6 = new TouchAction<>(driver);
		touch6.press(PointOption.point(623,170));
		touch6.release();
		touch6.perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/button_gallery_listo")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//android.widget.TextView[@text='Foto del cliente']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Foto del cliente']")).click(); 
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		List<MobileElement> lists7 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		TouchAction touch7 = new TouchAction<>(driver);
		touch7.press(PointOption.point(230,170));
		touch7.release();
		touch7.perform();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/button_gallery_listo")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Fecha de caducidad del documento']")).sendKeys("31/12/2030");

	//	swippe.swipeScreen();
		swipeScreen();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//Scroll
	//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Plan telefónico\").instance(0))")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Grado de instruccion']")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<MobileElement> lists8 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch8 = new TouchAction<>(driver);
		touch8.press(PointOption.point(93,876));
		touch8.release();
		touch8.perform(); 
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Profesión u ocupación']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<MobileElement> lists9 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch9 = new TouchAction<>(driver);
		touch9.press(PointOption.point(518,881));
		touch9.release();
		touch9.perform(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		swipeScreen(); 
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.RadioButton[@text='Pre-pago']")).click();	
		//driver.findElement(By.xpath("//android.widget.EditText[@text='Cliente iletrado']")).click();
		//driver.findElement(By.xpath("//android.widget.EditText[@text='Cliente iletrado']")).click();
		swipeScreen();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		swipeScreen();
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Código de área']")).click();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<MobileElement> lists10 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch10 = new TouchAction<>(driver);
		touch10.press(PointOption.point(66,806));
		touch10.release();
		touch10.perform(); 
		
	//	driver.findElement(By.xpath("//android.widget.RadioButton[@text='Pre-pago']")).click();		
	//	swipeSreen();
		
		
	//	driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector().resourceId(\"pe.com.surgir.surgirapp:id/view_pager2\")).scrollIntoView(new UiSelector().textMatches(\"Teléfono fijo\").instance(1))")).click();
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Operador telefónico']")).click();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<MobileElement> lists11 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch11 = new TouchAction<>(driver);
		touch11.press(PointOption.point(72,490));
		touch11.release();
		touch11.perform();
						
		driver.findElement(By.xpath("//android.widget.EditText[@text='Teléfono fijo']")).sendKeys("762352");	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
	//	driver.findElement(By.xpath("//android.widget.EditText[@text='Correo electrónico profesional']")).sendKeys("ppppp@abc.com");		
	//	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 	
	//	swipeScreen();

		MobileElement customer3 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.RelativeLayout/android.widget.RelativeLayout[1]/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText");
		customer3.clear();
		customer3.sendKeys("metodicosys@gmail.com");
		
		swipeScreen();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de comprobante de domicilio']")).click();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<MobileElement> lists13 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch13 = new TouchAction<>(driver);
		touch13.press(PointOption.point(147,703));
		touch13.release();
		touch13.perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 

		driver.findElement(By.xpath("//android.widget.TextView[@text='Comprobante domicilio']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Comprobante domicilio']")).click(); 
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		List<MobileElement> lists14 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/mark_item_gallery"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch14 = new TouchAction<>(driver);
		touch14.press(PointOption.point(625,762));
		touch14.release();
		touch14.perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/button_gallery_listo")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='¿La casa que habita es?']")).click();	
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<MobileElement> lists15 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch15 = new TouchAction<>(driver);
		touch15.press(PointOption.point(67,888));
		touch15.release();
		touch15.perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='N° personas en domicilio']")).click();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<MobileElement> lists16 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch16 = new TouchAction<>(driver);
		touch16.press(PointOption.point(465,930));
		touch16.release();
		touch16.perform();
		
		driver.findElement(By.xpath("//android.widget.EditText[@text='Otro tipo de domicilio']")).sendKeys("Otro tipo");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 	
	//	((PressesKey) driver).pressKey(new KeyEvent(AndroidKey.ESCAPE));
		swipeScreen();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Departamento']")).click();		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<MobileElement> lists17 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch17 = new TouchAction<>(driver);
		touch17.press(PointOption.point(90,947));
		touch17.release();
		touch17.perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Provincia']")).click();		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<MobileElement> lists18 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch18 = new TouchAction<>(driver);
		touch18.press(PointOption.point(480	,954));
		touch18.release();
		touch18.perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Distrito']")).click();		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		List<MobileElement> lists19 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch19 = new TouchAction<>(driver);
		touch19.press(PointOption.point(93,1001));
		touch19.release();
		touch19.perform();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
				
		driver.findElement(By.xpath("//android.widget.EditText[@text='Barrio/Urbanización']")).sendKeys("mibarrio");		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 	
		swipeScreen();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de vía']")).click();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<MobileElement> lists20 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch20 = new TouchAction<>(driver);
		touch20.press(PointOption.point(76,796));
		touch20.release();
		touch20.perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//android.widget.EditText[@text='Nombre de la dirección']")).sendKeys("Mi dirección");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//android.widget.EditText[@text='N° exterior de la dirección']")).sendKeys("500");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//android.widget.EditText[@text='N° interior de la dirección']")).sendKeys("100");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 	
			
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Permanencia en años']")).click();		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		List<MobileElement> lists21 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		TouchAction touch21 = new TouchAction<>(driver);
		touch21.press(PointOption.point(465,1073));
		touch21.release();
		touch21.perform();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//android.widget.EditText[@text='Referencia de ubicación']")).sendKeys("Mi referencia");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 	
		swipeScreen(); 
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
	//	int count1 = driver.findElements(By.xpath("//android.widget.EditText[@text='Número de dependientes']")).size();
		//String text=driver.findElements(By.xpath("//android.widget.EditText[@text='Número de dependientes']")).get(count).getText();
		int count1=0;
		if (count1==0) {
			swipeScreen(); 
		}
			else {
			driver.findElement(By.xpath("//android.widget.EditText[@text='Número de dependientes']")).sendKeys("1");
		}
		
		//Referencia
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//android.widget.EditText[@text='Tipo de referencia']")).click();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		List<MobileElement> lists22 = driver.findElements(By.id("pe.com.surgir.surgirapp:id/list"));
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		TouchAction touch22 = new TouchAction<>(driver);
		touch22.press(PointOption.point(81,1004));
		touch22.release();
		touch22.perform();	
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//android.widget.EditText[@text='Nombres']")).sendKeys("Nom referencia");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 	
		swipeScreen(); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//android.widget.EditText[@text='Apellidos']")).sendKeys("Ap referencia");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.xpath("//android.widget.EditText[@text='Celular']")).sendKeys("911111111");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessSave")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 
		driver.findElement(By.id("pe.com.surgir.surgirapp:id/btnFormBusinessNext")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		}
		catch (Exception exp) {
			System.out.println("Cause is: "+ exp.getCause());
			System.out.println("Message is: "+ exp.getMessage());
		}
		
		
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
