package br.com.rsinet.hub_tdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.MobileElement;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clicaMenu() {
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
	}
	
	public void clicaLogin() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser")).click();
	}
	
	public void clicaCriarNovaConta() {
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewDontHaveAnAccount")).click();
	}
	
	public MobileElement pegaLogon() {
		MobileElement pegaLogon = (MobileElement) driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuUser"));
		return pegaLogon;
	}
	
	public void pegaTextoLogon(String txt) {
		pegaLogon().getText();
	}

}