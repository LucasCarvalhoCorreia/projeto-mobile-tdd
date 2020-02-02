package br.com.rsinet.hub_tdd.testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.com.rsinet.hub_tdd.utils.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Advantage {

	private AndroidDriver<WebElement> driver;

	@Before
	public void iniciaTeste() throws Exception {
		driver = DriverFactory.iniciaApp();
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void testeDeCadastro() throws InterruptedException {

//		driver.findElement(By.id("com.Advantage.aShopping:id/textViewCategory")).click();
//		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
//		driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuMice")).click();
//		driver.findElement(By.xpath(
//				"//android.widget.RelativeLayout[@content-desc=\"Mice\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView"))
//				.click();
//		
//		driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart")).click();
//		driver.findElement(By.xpath(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText"))
//				.sendKeys("lucascarvalho");
//		
//		driver.findElement(By.xpath(
//				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText"))
//				.sendKeys("10203040Lcc");
//		
//		driver.findElement(By.id("com.Advantage.aShopping:id/buttonLogin")).click();
		
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
		
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).click();
		
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewDontHaveAnAccount")).click();

		MobileElement userName = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.EditText"));
		userName.click();
		userName.sendKeys("lucascarvalh04");
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();

		MobileElement email = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		email.click();		
		email.sendKeys("lucas.carvalho99@hotmail.com");
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();

		MobileElement password = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
		password.click();		
		password.sendKeys("10203040Lcc");
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		MobileElement confirmPassword = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.widget.RelativeLayout/android.widget.EditText"));
		confirmPassword.click();	
		confirmPassword.sendKeys("10203040Lcc");

		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		MobileElement firstName = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"));
		firstName.click();		
		firstName.sendKeys("Lucas");
		
		MobileElement lastName = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"));
		lastName.click();		
		lastName.sendKeys("Carvalho Correia");
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		MobileElement phoneNumber = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		phoneNumber.click();		
		phoneNumber.sendKeys("(11)9980-0761");
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();

		MobileElement country = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutCountry"));
		country.click();	
		
		new TouchAction(driver).press(PointOption.point(1019, 1962)).moveTo(PointOption.point(1014, 132)).perform();
		new TouchAction(driver).press(PointOption.point(1019, 1962)).moveTo(PointOption.point(1014, 132)).perform();

		MobileElement brazil = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.TextView[6]"));
		brazil.click();	
		
		MobileElement state = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		state.click();	
		state.sendKeys("São Paulo");
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		MobileElement address = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.EditText"));
		address.click();	
		address.sendKeys("lucinda");
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		MobileElement city = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[1]/android.widget.EditText"));
		city.click();	
		city.sendKeys("Guarulhos");

		MobileElement postalCode = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[2]/android.widget.EditText"));
		postalCode.click();	
		postalCode.sendKeys("07080-305");
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		new TouchAction(driver).press(PointOption.point(1019, 1962)).moveTo(PointOption.point(1014, 132)).perform();

		MobileElement checkOffers = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/checkBoxRecieveOffers"));
		checkOffers.click();	

		MobileElement btRegister = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/buttonRegister"));
		btRegister.click();	
		
	}
	
	@After
	public void finalizaTeste() {
		driver = DriverFactory.fechaApp();
	}

}
