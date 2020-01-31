package br.com.rsinet.hub_tdd.testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import br.com.rsinet.hub_tdd.utils.DriverFactory;

public class Advantage {
	
	private WebDriver driver;

	@Before
	public void iniciaTeste() throws Exception {
		driver = DriverFactory.iniciaApp();
	}
	
	@Test
	public void testeDeCadastro() {

		driver.findElement(By.id("com.Advantage.aShopping:id/textViewCategory")).click();
		driver.findElement(By.id("com.Advantage.aShopping:id/imageViewMenu")).click();
		driver.findElement(By.id("com.Advantage.aShopping:id/textViewMenuMice")).click();
		driver.findElement(By.xpath("//android.widget.RelativeLayout[@content-desc=\"Mice\"]/android.widget.LinearLayout/android.widget.GridView/android.widget.RelativeLayout[3]/android.widget.ImageView")).click();
		driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart")).click();
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[3]/android.widget.EditText")).sendKeys("lucascarvalho");
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout[2]/android.widget.RelativeLayout[4]/android.widget.EditText")).sendKeys("10203040Lcc");
		driver.findElement(By.id("com.Advantage.aShopping:id/buttonLogin")).click();
		
	}
	
	@After
	public void finalizaTeste() {
//		driver.quit();
	}

}
