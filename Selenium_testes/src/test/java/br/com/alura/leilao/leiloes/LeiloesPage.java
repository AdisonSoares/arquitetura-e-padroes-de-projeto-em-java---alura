package br.com.alura.leilao.leiloes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LeiloesPage {
	private static final String URL_CADASTRO_LEILOES = "http://localhost:8080/leiloes/new";
	private WebDriver browser;
	
	public LeiloesPage(WebDriver browser) {
		this.browser = browser;
	}

	public void fechar() {
		this.browser.quit();
	}

	public CadastroLeilaoPage carregarFormulario() {
		this.browser.navigate().to(URL_CADASTRO_LEILOES);
		return new CadastroLeilaoPage(browser);		
	}

	public boolean heLeilaoCadastrado(String nome, String valor, String hoje) {
		WebElement findElement = this.browser.findElement(By.cssSelector("#tabela-leiloes tbody tr:last-child"));
		return false;
	}

}
