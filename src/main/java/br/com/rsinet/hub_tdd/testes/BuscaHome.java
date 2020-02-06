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

import br.com.rsinet.hub_tdd.screenObject.HomeScreen;
import br.com.rsinet.hub_tdd.screenObject.PesquisaScreen;
import br.com.rsinet.hub_tdd.utils.Constantes;
import br.com.rsinet.hub_tdd.utils.DriverFactory;
import br.com.rsinet.hub_tdd.utils.ExcelUtils;
import br.com.rsinet.hub_tdd.utils.ExtendReport;
import br.com.rsinet.hub_tdd.utils.PegaMassa;
import br.com.rsinet.hub_tdd.utils.ScreenObjectManager;

public class BuscaHome {
	
	private ExtentTest test;
	private WebDriver driver;
	private HomeScreen homeScreen;
	private PegaMassa pegaMassa;
	private PesquisaScreen pesquisaScreen;
	
	@BeforeTest
	public void iniciaExtendReport() {
		ExtendReport.setExtent();
	}

	@BeforeMethod
	public void iniciaTeste() throws Exception {
		driver = DriverFactory.iniciaApp();
		
		PageFactory.initElements(driver, this);
		ScreenObjectManager manager = new ScreenObjectManager(driver);
		homeScreen = manager.getHomeScreen();
		pesquisaScreen = manager.getPesquisaScreen();
		pegaMassa = manager.getPegaMassa();
	}
	
	@Test
	public void testeDeBuscaPorTelaInicialSucesso() throws Exception {
		test = ExtendReport.createTest("PesquisaHomeSucesso");
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "Cadastro");
		
		homeScreen.clicaMenu();
		
		homeScreen.clicaLogin();
		
		homeScreen.preencheUserLogin(pegaMassa.UserName());
		homeScreen.preenchePasswordLogin(pegaMassa.Password());
		
		homeScreen.clicaBtLogin();
		
//		homeScreen.clicaNoBt();
		
		homeScreen.clicaCategoriaSpeakers();
		
		pesquisaScreen.escolheProduto();
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "PesquisaCat");
		
		String condicao = pegaMassa.CondicaoAssertMassaSucesso();
		String mensagem = pegaMassa.MenssagemAssertMassaSucesso();
		
		String pass = pesquisaScreen.encontraNomePorduto(driver).getText();
		Assert.assertTrue(pass.equals(condicao), mensagem);
	}
	
	@Test
	public void testeDeBuscaPorTelaInicialFalha() throws Exception {
		test = ExtendReport.createTest("PesquisaHomeFalha");
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "Cadastro");
		
		homeScreen.clicaMenu();
		
		homeScreen.clicaLogin();
		
		homeScreen.preencheUserLogin(pegaMassa.UserName());
		homeScreen.preenchePasswordLogin(pegaMassa.Password());
		
		homeScreen.clicaBtLogin();
		
//		homeScreen.clicaNoBt();
		
		homeScreen.clicaCategoriaSpeakers();
		
		pesquisaScreen.escolheProduto();
		
		pesquisaScreen.clicaQuantidadeProduto();
		
		pesquisaScreen.preencheQuantidadeCompra();
		
		pesquisaScreen.clicaAplicaQuantidade();
		
		pesquisaScreen.clicaAdicionarAoCarrinho();
		
		pesquisaScreen.clicaCarrinhoDeCompras();
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "PesquisaCat");
		
		String condicao = pegaMassa.CondicaoAssertMassaErro();
		String mensagem = pegaMassa.MenssagemAssertMassaErro();
		
		String pass = pesquisaScreen.encontraQuantidadeComprada().getText();
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
