package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Telefone;


class TelefoneTest {

	@Test
	void maoDeveriaValidarFormatoDeTelefone() {
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, null));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("aaa", null));
		assertThrows(IllegalArgumentException.class, () -> new Telefone(null, "aaa"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("aaa", "aaa"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("", "aaa"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("aaa", ""));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("", ""));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("000", "00000000000"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("00", "00000000"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("00", "000000000"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("00", "0000-0000"));
		assertThrows(IllegalArgumentException.class, () -> new Telefone("000", "00000-0000"));
	}
	
	@Test
	void deveriaValidarFormatoDeDDD() {
		Telefone telefoneTeste = new Telefone("61", "99123-1234");
		assertEquals("61", telefoneTeste.getDdd());
	}
	
	@Test
	void deveriaValidarFormatoDeNumero() {
		Telefone telefoneTeste1 = new Telefone("61", "99123-1234");
		assertEquals("99123-1234", telefoneTeste1.getNumero());
		
		Telefone telefoneTeste2 = new Telefone("61", "3400-1234");
		assertEquals("3400-1234", telefoneTeste2.getNumero());
		
	}

}












