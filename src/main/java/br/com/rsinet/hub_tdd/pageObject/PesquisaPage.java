package br.com.rsinet.hub_tdd.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;

public class PesquisaPage {

	private WebDriver driver;
	
	public PesquisaPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private MobileElement encontraPorduto(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		MobileElement encontraPorduto = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Search\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout/android.widget.ImageView")));
		return encontraPorduto;
	}
	
	public void clicaProduto() {
		encontraPorduto(driver).click();
	}
	
	public MobileElement encontraNomePorduto(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		MobileElement encontraNomePorduto = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/textViewProductName")));
		return encontraNomePorduto;
	}
	
	public MobileElement encontraResultadoPesquisa(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		MobileElement encontraResultadoPesquisa = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.id("com.Advantage.aShopping:id/textViewNoProductsToShow")));
		return encontraResultadoPesquisa;
	}
	
	private MobileElement encontraProdutoCategoria(WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		MobileElement encontraPordutoCategoria = (MobileElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Speakers\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView")));
		return encontraPordutoCategoria;
	}
	
	public void escolheProduto() {
		encontraProdutoCategoria(driver).click();
	}
	
}
