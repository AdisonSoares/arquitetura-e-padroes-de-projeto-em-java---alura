package br.com.alura.leilao;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OlaSistemaSelenium {
	@Test
	public void olaTest() {
		System.setProperty("webdriver.edge.driver", "drivers/msedgedriver");
		WebDriver browser = new EdgeDriver();
		browser.navigate().to("http://localhost:8080/leiloes");
		browser.quit();
	}
}
