package br.com.alura.escola;

import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.CPF;
import br.com.alura.escola.dominio.aluno.Email;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAluno {
    public static void main(String[] args) {
        String nome = "Fulano";
        CPF cpf = new CPF("789.456.123-00");
        Email email = new Email("fulando@gmail.com");

        Aluno aluno = new Aluno(cpf, nome, email);
        RepositorioDeAlunos repositorio = new RepositorioDeAlunosEmMemoria();
        repositorio.matricular(aluno);
    }
}
