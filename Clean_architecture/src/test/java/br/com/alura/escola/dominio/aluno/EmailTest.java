package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Email;


class EmailTest {

	@Test
	void naoDeveriaCriarEmailComFormatoInvalido() {
		assertThrows(IllegalArgumentException.class, () -> new Email(null));
		assertThrows(IllegalArgumentException.class, () -> new Email(""));
		assertThrows(IllegalArgumentException.class, () -> new Email("emailInvalido"));
	}
	
	@Test
	void deveriaCriarEmailComFormatoValido() {
		Email emailTeste = new Email("teste@gmail.com");
		assertEquals("teste@gmail.com", emailTeste.getEndereco());
	}

}
