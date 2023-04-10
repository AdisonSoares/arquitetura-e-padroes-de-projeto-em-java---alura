package br.com.alura.leilao.login;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginTest {
	
	private LoginPage paginaDeLogin;
	
	@BeforeEach
	public void beforeEach() {
		this.paginaDeLogin = new LoginPage();
	}
	
	@AfterEach
	public void afterEach() {
		this.paginaDeLogin.fechar();
	}
	
	@Test
	public void deveriaEfetuarLoginComDadosValidos() {
		paginaDeLogin.preecheFormularioDeLogin("fulano", "pass");
		paginaDeLogin.submeteFormulario();
	
		Assert.assertFalse(paginaDeLogin.hePaginaDeLogin());
		Assert.assertEquals("fulano", paginaDeLogin.getUsuarioLogado());
	}
	
	@Test
	public void naoDeveriaLogarComDadosInvalidos() {
		paginaDeLogin.preecheFormularioDeLogin("invalido", "invalido");
		paginaDeLogin.submeteFormulario();

		Assert.assertTrue(paginaDeLogin.hePaginaDeLoginComDadosInvalidos());
		Assert.assertNull(paginaDeLogin.getUsuarioLogado());
		Assert.assertTrue(paginaDeLogin.contemTexto("Usuário e senha inválidos."));
		
	}
	
	@Test
	public void naoDeveriaAcessarPaginaRestritaSemEstarLogado() {
		paginaDeLogin.navegaParaPaginaDeLances();	
		
		Assert.assertTrue(paginaDeLogin.hePaginaDeLogin());
		Assert.assertFalse(paginaDeLogin.contemTexto("Dados do Leilão"));
	}
}
