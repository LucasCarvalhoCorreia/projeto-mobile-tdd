package br.com.rsinet.hub_tdd.testes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import br.com.rsinet.hub_tdd.screenObject.CadastroScreen;
import br.com.rsinet.hub_tdd.screenObject.HomeScreen;
import br.com.rsinet.hub_tdd.utils.Constantes;
import br.com.rsinet.hub_tdd.utils.DriverFactory;
import br.com.rsinet.hub_tdd.utils.ExcelUtils;
import br.com.rsinet.hub_tdd.utils.ExtendReport;
import br.com.rsinet.hub_tdd.utils.PegaMassa;
import br.com.rsinet.hub_tdd.utils.ScreenObjectManager;
import io.appium.java_client.android.AndroidDriver;

public class Cadastro {

	private WebDriver driver;
	private CadastroScreen cadastroScreen;
	private HomeScreen homeScreen;
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
		PageFactory.initElements(driver, this);
		ScreenObjectManager manager = new ScreenObjectManager(driver);
		cadastroScreen = manager.getCadastroScreen();
		homeScreen = manager.getHomeScreen();
		pegaMassa = manager.getPegaMassa();
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void testeDeCadastroSucesso() throws Exception {
		test = ExtendReport.createTest("CadastroSucesso");
		
		homeScreen.clicaMenu();
		
		homeScreen.clicaLogin();
		
		homeScreen.clicaCriarNovaConta();

		cadastroScreen.preencheUserName(pegaMassa.UserName());
		
		cadastroScreen.preencheEmail(pegaMassa.Email());
		
		cadastroScreen.preenchePassword(pegaMassa.Password());
		
		cadastroScreen.preencheConfirmPassword(pegaMassa.ConfirmPassword());

		cadastroScreen.preencheFirstName(pegaMassa.FirstName());
		
		cadastroScreen.preencheLastName(pegaMassa.LastName());
		
		cadastroScreen.preenchePhoneNumber(pegaMassa.Telefone());
		
		cadastroScreen.scroll(0.8, 0.2);
		
		cadastroScreen.clicaCountry();	
		
		cadastroScreen.scrollCountry((AndroidDriver) driver, "Brazil");
		
		cadastroScreen.clicaBrazil((AndroidDriver) driver, "Brazil");
		
		cadastroScreen.preencheState(pegaMassa.Estado());
		
		cadastroScreen.preencheAddress(pegaMassa.Endereco());
		
		cadastroScreen.preencheCity(pegaMassa.Cidade());

		cadastroScreen.preenchePostalCode(pegaMassa.Cep());
		
		cadastroScreen.clicaCheckOffers();	

		cadastroScreen.clicaRegister();
		
		homeScreen.clicaMenu();
		
		String mensagem = pegaMassa.MenssagemAssertCadastroSucesso();
		String condicao = pegaMassa.UserName();
		
		String pass = homeScreen.pegaLogon().getText();
		
		Assert.assertTrue(pass.equals(condicao), mensagem);
	}
	
	@Test
	public void testeDeCadastroFalha() throws Exception {
		test = ExtendReport.createTest("CadastroFalha");

		homeScreen.clicaMenu();
		
		homeScreen.clicaLogin();
		
		homeScreen.clicaCriarNovaConta();

		cadastroScreen.preencheUserName(pegaMassa.UserName());
		
		cadastroScreen.preencheEmail(pegaMassa.Email());
		
		cadastroScreen.preenchePassword(pegaMassa.Password());
		
		cadastroScreen.preencheConfirmPassword(pegaMassa.ConfirmPasswordErrado());
		
		cadastroScreen.preencheFirstName(pegaMassa.FirstName());
	
		String condicao = pegaMassa.CondicaoAssertCadastroErro();
		String mensagem = pegaMassa.MenssagemAssertCadastroErro();
		String pass = cadastroScreen.encontraMsgPassword().getText();
		
		Assert.assertTrue(pass.equals(condicao), mensagem);
	}
	
	@AfterMethod
	public void finalizaTeste(ITestResult result) throws Exception {
		ExtendReport.tearDown(result, test, driver);
		DriverFactory.fechaApp();
	}
	
	@AfterTest
	public void finalizaExtendReport() {
		ExtendReport.endReport();
	}

}
