package br.com.alura.leilao.leiloes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CadastroLeilaoPage {
	private WebDriver browser;
	
	public CadastroLeilaoPage(WebDriver browser) {
		this.browser = browser;
	}

	public void fechar() {
		this.browser.quit();
	}
	
	public LeiloesPage cadastrarLeilao(String nomeCadastro, String valorInicial, String data) {
		this.browser.findElement(By.id("nome")).sendKeys(nomeCadastro);
		this.browser.findElement(By.id("valorInicial")).sendKeys(valorInicial);
		this.browser.findElement(By.id("dataAbertura")).sendKeys(data);
		this.browser.findElement(By.id("button-submit")).submit();
		
		return new LeiloesPage(browser);
		
	}

}
