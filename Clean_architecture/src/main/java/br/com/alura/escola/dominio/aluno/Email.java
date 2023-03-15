package br.com.alura.escola.dominio.aluno;

public class Email {
	private String endereco;
	private String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

	public Email(String endereco) {
		if (endereco == null || !endereco.matches(this.regex)) {
			throw new IllegalArgumentException("E-mail invalido!");
		}
		this.endereco = endereco;
	}

	public String getEndereco() {
		return endereco;
	}
}
