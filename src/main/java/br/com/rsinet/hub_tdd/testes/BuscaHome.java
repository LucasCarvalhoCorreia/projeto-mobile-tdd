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

import br.com.rsinet.hub_tdd.pageObject.HomePage;
import br.com.rsinet.hub_tdd.pageObject.PesquisaPage;
import br.com.rsinet.hub_tdd.utils.Constantes;
import br.com.rsinet.hub_tdd.utils.DriverFactory;
import br.com.rsinet.hub_tdd.utils.ExcelUtils;
import br.com.rsinet.hub_tdd.utils.ExtendReport;
import br.com.rsinet.hub_tdd.utils.PegaMassa;
import io.appium.java_client.android.AndroidDriver;

public class BuscaHome {
	
	private ExtentTest test;
	private AndroidDriver<WebElement> driver;
	private HomePage homePage;
	private PegaMassa pegaMassa;
	private PesquisaPage pesquisaPage;
	
	@BeforeTest
	public void extendReport() {
		ExtendReport.setExtent();
	}

	@BeforeMethod
	public void iniciaTeste() throws Exception {
		driver = DriverFactory.iniciaApp();
		
		homePage = PageFactory.initElements(driver, HomePage.class);
		pesquisaPage = PageFactory.initElements(driver, PesquisaPage.class);
		pegaMassa = new PegaMassa();
	}
	
	@Test
	public void testeDeBuscaPorTelaInicialSucesso() throws Exception {
		test = ExtendReport.createTest("PesquisaHomeSucesso");
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "Cadastro");
		
		homePage.clicaMenu();
		
		homePage.clicaLogin();
		
		homePage.preencheUserLogin(pegaMassa.UserName());
		homePage.preenchePasswordLogin(pegaMassa.Password());
		
		homePage.clicaBtLogin();
		
		homePage.clicaNoBt();
		
		homePage.clicaCategoriaSpeakers();
		
		pesquisaPage.escolheProduto();
		
		ExcelUtils.setExcelFile(Constantes.Path_TestData + Constantes.File_TestData, "PesquisaCat");
		
		String condicao = pegaMassa.CondicaoAssertMassaSucesso();
		String mensagem = pegaMassa.MenssagemAssertMassaSucesso();
		
		String pass = pesquisaPage.encontraNomePorduto(driver).getText();
		Assert.assertTrue(pass.equals(condicao), mensagem);
	}
	
//	@Test
//	public void testeDeBuscaPorTelaInicialFalha() {
//		
//	}
	
	@AfterMethod
	public void finalizaTeste(ITestResult result) throws Exception {
		ExtendReport.tearDown(result, test, driver);
		ExtendReport.endReport();
		DriverFactory.fechaApp();
	}

}
