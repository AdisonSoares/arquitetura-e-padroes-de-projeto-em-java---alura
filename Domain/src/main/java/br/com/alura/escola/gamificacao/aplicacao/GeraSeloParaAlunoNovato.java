package br.com.alura.escola.gamificacao.aplicacao;

import br.com.alura.escola.gamificacao.dominio.selo.RepositorioDeSelos;
import br.com.alura.escola.gamificacao.dominio.selo.Selo;
import br.com.alura.escola.shared.dominio.CPF;
import br.com.alura.escola.shared.dominio.evento.Evento;
import br.com.alura.escola.shared.dominio.evento.Ouvinte;
import br.com.alura.escola.shared.dominio.evento.TipoDeEvento;

public class GeraSeloParaAlunoNovato extends Ouvinte {
	
	private final RepositorioDeSelos repositorioDeSelos;
	
    public GeraSeloParaAlunoNovato(RepositorioDeSelos repositorioDeSelos) {
		this.repositorioDeSelos = repositorioDeSelos;
	}

	@Override
    protected void reageAo(Evento evento) {
    	CPF cpfDoAluno = (CPF) evento.informacoes().get("cpf");
    	Selo novato = new Selo(cpfDoAluno, "NOVATO");
    	repositorioDeSelos.adicionar(novato);
    }

    @Override
    protected boolean deveProcessar(Evento evento) {
        return evento.tipo() == TipoDeEvento.ALUNO_MATRICULA;
    }
}
