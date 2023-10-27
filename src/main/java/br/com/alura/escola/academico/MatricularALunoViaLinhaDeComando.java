package br.com.alura.escola.academico;

import br.com.alura.escola.academico.infra.aluno.RepositorioDeAlunosEmMemoria;
import br.com.alura.escola.academico.aplicacao.indicacao.aluno.matricular.MatricularALunoDto;
import br.com.alura.escola.academico.aplicacao.indicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.academico.dominio.PublicadorDeEventos;
import br.com.alura.escola.academico.dominio.aluno.LogDeAlunoMatriculado;

public class MatricularALunoViaLinhaDeComando {

     public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "Fulano@email.com";

        PublicadorDeEventos publicador = new PublicadorDeEventos();
        publicador.adicionar(new LogDeAlunoMatriculado());

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria(), publicador);
        matricular.executa(new MatricularALunoDto(nome, cpf, email));
    }
}
