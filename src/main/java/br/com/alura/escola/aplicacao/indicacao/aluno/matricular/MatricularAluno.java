package br.com.alura.escola.aplicacao.indicacao.aluno.matricular;

import br.com.alura.escola.dominio.PublicadorDeEventos;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.AlunoMatriculado;
import br.com.alura.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;
    private final PublicadorDeEventos publicador;

    public MatricularAluno(RepositorioDeAlunos repositorio, PublicadorDeEventos publicador) {
        this.repositorio = repositorio;
        this.publicador = publicador;
    }

    public void executa(MatricularALunoDto dados){
        Aluno novo = dados.criarALuno();
        repositorio.matricular(novo);
        AlunoMatriculado evento = new AlunoMatriculado(novo.getCpf());
        publicador.publicar(evento);
    }
}
