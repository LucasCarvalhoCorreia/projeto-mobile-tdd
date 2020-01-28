package com.google.code.gson.projeto_appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Giganima {

	private AndroidDriver<?> driver;

	@Before
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(CapabilityType.BROWSER_NAME, "");
		capabilities.setCapability("deviceName", "ASUS_X018D");
		capabilities.setCapability("platformVersion", "8.1.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("automationName", "uiautomator2");

		URL remoteUrl = new URL("http://localhost:4723/wd/hub");

		driver = new AndroidDriver(remoteUrl, capabilities);
	}

	@Test
	public void sampleTest() {
		MobileElement el1 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[3]/android.widget.TextView");
		el1.click();
		MobileElement el2 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.FrameLayout[1]/android.widget.ImageView");
		el2.click();
		MobileElement el3 = (MobileElement) driver.findElementById("br.com.giganoapp.gaganima:id/btn_epi");
		el3.click();
		MobileElement el4 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.FrameLayout");
		el4.click();
		MobileElement el5 = (MobileElement) driver.findElementByXPath(
				"/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[5]/android.view.View");
		el5.click();
		MobileElement el6 = (MobileElement) driver.findElementById("android:id/button2");
		el6.click();
	}

	@After
	public void tearDown() {
		driver.quit();
	}

}
