package br.com.alura.loja;

import java.math.BigDecimal;
import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.orcamento.Orcamento;



public class TesteDescontos {

	public static void main(String[] args) {
		Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
		Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
		CalculadoraDeDesconto calculadora = new CalculadoraDeDesconto();
		
		System.out.println("O valor do desconto é: "+calculadora.calcular(orcamento1));
		System.out.println("O valor do desconto é: "+calculadora.calcular(orcamento2));

	}

}
