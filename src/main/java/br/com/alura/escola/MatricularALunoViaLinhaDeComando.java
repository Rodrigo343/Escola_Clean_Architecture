package br.com.alura.escola;

import br.com.alura.escola.aplicacao.indicacao.aluno.matricular.MatricularALunoDto;
import br.com.alura.escola.aplicacao.indicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularALunoViaLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Fulano da Silva";
        String cpf = "123.456.789-00";
        String email = "Fulano@email.com";

        MatricularAluno matricular = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricular.executa(new MatricularALunoDto(nome, cpf, email));
    }
}
