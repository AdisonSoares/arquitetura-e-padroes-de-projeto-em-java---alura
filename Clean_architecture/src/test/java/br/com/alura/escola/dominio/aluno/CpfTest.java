package br.com.alura.escola.dominio.aluno;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.alura.escola.dominio.aluno.Cpf;

class CpfTest {

	@Test
	void naoDeveriaValidarFormatoDeCpf() {
		assertThrows(IllegalArgumentException.class, () -> new Cpf(null));
		assertThrows(IllegalArgumentException.class, () -> new Cpf(""));
		assertThrows(IllegalArgumentException.class, () -> new Cpf("formato invalido"));
		assertThrows(IllegalArgumentException.class, () -> new Cpf("03185200943"));
		assertThrows(IllegalArgumentException.class, () -> new Cpf("031.852.009.43"));
	}
	
	@Test
	void deveriaValidarFormatoDeCpf() {
		Cpf cpfTeste1 = new Cpf("031.852.009-43");
		assertEquals("031.852.009-43", cpfTeste1.getCpf());
	}
}
