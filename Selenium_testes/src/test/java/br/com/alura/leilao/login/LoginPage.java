package br.com.alura.leilao.login;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginPage {
	private static final String URL_LOGIN = "http://localhost:8080/login";
	private WebDriver browser;
	
	public LoginPage() {
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver");
		this.browser = new EdgeDriver();
		browser.navigate().to(URL_LOGIN);
	}

	public void fechar() {
		this.browser.quit();
		
	}

	public void preecheFormularioDeLogin(String username, String password) {
		browser.findElement(By.id("username")).sendKeys(username);
		browser.findElement(By.id("password")).sendKeys(password);
		
	}

	public void submeteFormulario() {
		browser.findElement(By.id("login-form")).submit();
		
	}
	
	public boolean hePaginaDeLogin() {
		return browser.getCurrentUrl().equals(URL_LOGIN);
	}

	public String getUsuarioLogado() {
		try {
			return browser.findElement(By.id("usuario-logado")).getText();
		}catch(NoSuchElementException e) {
			return null;
		}
		
	}

	public void navegaParaPaginaDeLances() {
		browser.navigate().to("http://localhost:8080/leiloes/2");
	}

	public boolean contemTexto(String texto) {
		return browser.getPageSource().contains(texto);
	}

	public boolean hePaginaDeLoginComDadosInvalidos() {
		return browser.getCurrentUrl().equals(URL_LOGIN + "?error");
	}

	

}
