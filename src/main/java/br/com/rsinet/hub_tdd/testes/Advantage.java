package br.com.rsinet.hub_tdd.testes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import br.com.rsinet.hub_tdd.utils.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Advantage {

	private AndroidDriver<WebElement> driver;

	@BeforeMethod
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
		userName.sendKeys("lucascarvalho");

		MobileElement email = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout/android.widget.EditText"));
		email.click();		
		email.sendKeys("lucas.carvalho99@hotmail.com");

		MobileElement password = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
		password.click();		
		password.sendKeys("10203040Lcc");
		
		new TouchAction(driver).press(PointOption.point(1053, 1019)).moveTo(PointOption.point(1062, 441)).perform();
		
		MobileElement confirmPassword = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.RelativeLayout/android.widget.EditText"));
		confirmPassword.click();		
		confirmPassword.sendKeys("10203040Lcc");

		new TouchAction(driver).press(PointOption.point(1053, 1019)).moveTo(PointOption.point(1062, 441)).perform();
		
		MobileElement firstName = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[1]/android.widget.EditText"));
		firstName.click();		
		firstName.sendKeys("Lucas");
		
		MobileElement lastName = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout[2]/android.widget.EditText"));
		lastName.click();		
		lastName.sendKeys("Carvalho Correia");
		
		MobileElement phoneNumber = (MobileElement) driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"Home Page\"]/android.widget.LinearLayout[2]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.RelativeLayout[3]/android.widget.EditText"));
		phoneNumber.click();		
		phoneNumber.sendKeys("(11)9980-0761");

		new TouchAction(driver).press(PointOption.point(1053, 1019)).moveTo(PointOption.point(1062, 441)).perform();
		
		MobileElement country = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/linearLayoutCountry"));
		country.click();		

		MobileElement brazil = (MobileElement) driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.ListView/android.widget.EditText"));
		brazil.click();		
		
	}

	@AfterMethod
	public void finalizaTeste() {
		driver.quit();
	}

}
