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

public class BuscaLupa {
	
	private ExtentTest test;
	private WebDriver driver;
	private HomeScreen homeScreen;
	private PegaMassa pegaMassa;
	private PesquisaScreen pesquisaScreen;
	
	@BeforeTest
	public void extendReport() {
		ExtendReport.setExtent();
	}

	@BeforeMethod
	public void iniciaTeste() throws Exception {
		driver = DriverFactory.iniciaApp();
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "PesquisaBarra");
		PageFactory.initElements(driver, this);
		ScreenObjectManager manager = new ScreenObjectManager(driver);
		homeScreen = manager.getHomeScreen();
		pesquisaScreen = manager.getPesquisaScreen();
		pegaMassa = manager.getPegaMassa();
	}
	
	@Test
	public void testeDeBuscaPorLupaSucesso() throws Exception {
		test = ExtendReport.createTest("PesquisaBarraSucesso");
		
		homeScreen.preencheBarraPesquisa(pegaMassa.PesquisaNaBarra());
		
		homeScreen.clicaLupa();
		
		pesquisaScreen.clicaProduto();
		
		String condicao = pegaMassa.CondicaoAssertBarra();
		String mensagem = pegaMassa.MenssagemAssertBarra();
		
		String pass = pesquisaScreen.encontraNomePorduto(driver).getText();
		Assert.assertTrue(pass.equals(condicao), mensagem);
	}
	
	@Test
	public void testeDeBuscaPorLupaFalha() throws Exception {
		test = ExtendReport.createTest("PesquisaBarraFalha");
		
		homeScreen.preencheBarraPesquisa(pegaMassa.PesquisaNaBarraErro());
		
		homeScreen.clicaLupa();
		
		String elemento = pegaMassa.PesquisaNaBarraErro();
		String resposta = pesquisaScreen.encontraResultadoPesquisa(driver).getText();
		Assert.assertTrue(resposta.equals("- No results for " + "\"" + elemento + "\" -"),
				"Nenhum resultado encontrado para " + elemento + "!");
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
