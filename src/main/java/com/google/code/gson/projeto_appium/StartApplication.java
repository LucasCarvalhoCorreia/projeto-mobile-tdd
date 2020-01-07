package com.google.code.gson.projeto_appium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class StartApplication {

	@SuppressWarnings("rawtypes")
	public static AndroidDriver driver;

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "ASUS_X018D");
		capabilities.setCapability("platformVersion", "8.1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("appPackage", "com.android.vending");
		capabilities.setCapability("appActivity", "com.google.android.finsky.activities.MainActivity");

		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);

//		driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();

//		WebElement seletor =
//		driver.findElement(By.className("android.widget.LinearLayout"));
//		seletor.sendKeys("ISO");

//		driver.findElement(By.id("com.amazon.mShop.android.shopping:id/skip_sign_in_button")).click();
//		WebElement element = driver.findElement(By.className("android.widget.EditText"));
//		element.sendKeys("celular");

//		driver.quit();
		
		driver.findElement(By.id("com.android.vending:id/search_bar_hint")).click();
		WebElement element = driver.findElement(By.className("android.widget.EditText"));
		element.sendKeys("Braw Stars");
		
		driver.findElement(By.id("com.android.vending:id/suggest_text")).click();
		
	}

}
