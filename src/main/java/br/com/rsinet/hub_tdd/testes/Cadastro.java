package br.com.rsinet.hub_tdd.testes;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_tdd.pageObject.CadastroPage;
import br.com.rsinet.hub_tdd.pageObject.HomePage;
import br.com.rsinet.hub_tdd.utils.Constantes;
import br.com.rsinet.hub_tdd.utils.DriverFactory;
import br.com.rsinet.hub_tdd.utils.ExcelUtils;
import br.com.rsinet.hub_tdd.utils.ExtendReport;
import br.com.rsinet.hub_tdd.utils.PegaMassa;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.offset.PointOption;

public class Cadastro {

	private AndroidDriver<WebElement> driver;
	private CadastroPage cadastroPage;
	private HomePage homePage;
	private ExtentTest test;
	private PegaMassa pegaMassa;
	
	@BeforeTest
	public void extendReport() {
		ExtendReport.setExtent();
	}

	@BeforeMethod
	public void iniciaTeste() throws Exception {
		driver = DriverFactory.iniciaApp();
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "Cadastro");
		
		cadastroPage = PageFactory.initElements(driver, CadastroPage.class);
		homePage = PageFactory.initElements(driver, HomePage.class);
		pegaMassa = new PegaMassa();
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void testeDeCadastroSucesso() throws Exception {
		test = ExtendReport.createTest("CadastroSucesso");

		homePage.clicaMenu();
		
		homePage.clicaLogin();
		
		homePage.clicaCriarNovaConta();

		cadastroPage.preencheUserName(pegaMassa.UserName());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();

		cadastroPage.preencheEmail(pegaMassa.Email());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preenchePassword(pegaMassa.Password());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preencheConfirmPassword(pegaMassa.ConfirmPassword());

		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preencheFirstName(pegaMassa.FirstName());
		
		cadastroPage.preencheLastName(pegaMassa.LastName());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preenchePhoneNumber(pegaMassa.Telefone());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.clicaCountry();	
		
		new TouchAction(driver).press(PointOption.point(1019, 1962)).moveTo(PointOption.point(1014, 132)).perform();
		new TouchAction(driver).press(PointOption.point(1019, 1962)).moveTo(PointOption.point(1014, 132)).perform();
		
		cadastroPage.clicaBrazil();
		
		cadastroPage.preencheState(pegaMassa.Estado());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preencheAddress(pegaMassa.Endereco());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preencheCity(pegaMassa.Cidade());

		cadastroPage.preenchePostalCode(pegaMassa.Cep());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		new TouchAction(driver).press(PointOption.point(1019, 1962)).moveTo(PointOption.point(1014, 132)).perform();
		
		cadastroPage.clicaCheckOffers();	

		cadastroPage.clicaRegister();
		
		homePage.clicaMenu();
		
		String mensagem = pegaMassa.MenssagemAssertCadastroSucesso();
		String condicao = pegaMassa.UserName();
		
		String pass = homePage.pegaLogon().getText();
		
		Assert.assertTrue(pass.equals(condicao), mensagem);
	}
	
	@SuppressWarnings("rawtypes")
	@Test
	public void testeDeCadastroFalha() throws Exception {
		test = ExtendReport.createTest("CadastroFalha");

		homePage.clicaMenu();
		
		homePage.clicaLogin();
		
		homePage.clicaCriarNovaConta();

		cadastroPage.preencheUserName(pegaMassa.UserName());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();

		cadastroPage.preencheEmail(pegaMassa.Email());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preenchePassword(pegaMassa.Password());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preencheConfirmPassword(pegaMassa.ConfirmPasswordErrado());

		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preencheFirstName(pegaMassa.FirstName());
		
		cadastroPage.preencheLastName(pegaMassa.LastName());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preenchePhoneNumber(pegaMassa.Telefone());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.clicaCountry();	
		
		new TouchAction(driver).press(PointOption.point(1019, 1962)).moveTo(PointOption.point(1014, 132)).perform();
		new TouchAction(driver).press(PointOption.point(1019, 1962)).moveTo(PointOption.point(1014, 132)).perform();
		
		cadastroPage.clicaBrazil();
		
		cadastroPage.preencheState(pegaMassa.Estado());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preencheAddress(pegaMassa.Endereco());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		cadastroPage.preencheCity(pegaMassa.Cidade());

		cadastroPage.preenchePostalCode(pegaMassa.Cep());
		
		new TouchAction(driver).tap(PointOption.point(976, 1934)).perform();
		
		new TouchAction(driver).press(PointOption.point(1019, 1962)).moveTo(PointOption.point(1014, 132)).perform();
		
		cadastroPage.clicaCheckOffers();	

		cadastroPage.clicaRegister();
	}
	
	@AfterMethod
	public void finalizaTeste(ITestResult result) throws Exception {
		ExtendReport.tearDown(result, test, driver);
		ExtendReport.endReport();
		DriverFactory.fechaApp();
	}

}
