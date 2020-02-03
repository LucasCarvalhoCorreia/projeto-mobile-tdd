package br.com.rsinet.hub_tdd.utils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Prints {

	/* Atribui data e hora ao nomear o arquivo de print. */
	public static String timestamp() {
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	}

	/*
	 * Cria um arquivo de imagem e atribui um nome a ele especificado na declaração
	 * do metodo.
	 */
	public static String tirarPrints(WebDriver driver, String nomeDaImagem) throws Exception {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
		/* Especifica o endereço onde a print sera armazenada. */
		String imageFileDir = "target";
		FileUtils.copyFile(srcFile, new File(imageFileDir, nomeDaImagem + timestamp() + ".png"));

		try {
			FileUtils.copyFile(srcFile, new File(imageFileDir));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return imageFileDir;
	}
}
