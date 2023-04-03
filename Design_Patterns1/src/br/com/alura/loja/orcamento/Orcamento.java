package br.com.alura.loja.orcamento;

import br.com.alura.loja.SituacaoDoOrcamento;
import br.com.alura.loja.orcamento.situacao.EmAnalise;
import java.math.BigDecimal;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoDoOrcamento situacao;

	public SituacaoDoOrcamento getSituacao() {
		return situacao;
	}

	public void setSituacao(SituacaoDoOrcamento situacao) {
		this.situacao = situacao;
	}

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacao = new EmAnalise();
	}

	public void aplicarDescontoExtra(){
		BigDecimal valoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
		this.valor = this.valor.subtract(valoDescontoExtra);
	}

	public void aprovar(){
		this.situacao.aprovar(this);
	}
	
	public void reprovar(){
		this.situacao.reprovar(this);
	}
	
	public void finalizar(){
		this.situacao.finalizar(this);
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

}
