package br.com.alura.escola.dominio.aluno;

public class Telefone {
	private String ddd;
	private String numero;

	public Telefone(String ddd, String numero) {
		if (ddd == null || !ddd.matches("^(1[1-9]|[2-9]\\d)$") ) {
			throw new IllegalArgumentException("Formato inválido de ddd!");
		}
		
		if (numero == null || !numero.matches("[0-9]{4,5}-[0-9]{4}")) {
			throw new IllegalArgumentException("Formato inválido de número!");
		}
		
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public String getDdd() {
		return ddd;
	}

	public String getNumero() {
		return numero;
	}

}
