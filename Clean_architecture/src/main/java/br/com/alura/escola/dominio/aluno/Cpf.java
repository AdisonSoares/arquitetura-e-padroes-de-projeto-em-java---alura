package br.com.alura.escola.dominio.aluno;

public class Cpf {
	private String cpf;
	private String regex = "^\\d{3}\\.\\d{3}\\.\\d{3}\\-\\d{2}$";

	public Cpf(String cpf) {
		if (cpf == null || !cpf.matches(this.regex) ) {
			throw new IllegalArgumentException("Formato inválido de cpf!");
		}
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}
}
