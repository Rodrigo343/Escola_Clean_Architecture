package br.com.alura.escola.aplicacao.indicacao.aluno.matricular;

import static org.junit.jupiter.api.Assertions.*;

import br.com.alura.escola.dominio.PublicadorDeEventos;
import br.com.alura.escola.dominio.aluno.Aluno;
import br.com.alura.escola.dominio.aluno.Cpf;
import br.com.alura.escola.dominio.aluno.LogDeAlunoMatriculado;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

class MatricularAlunoTest {

	@Test
	void alunoDeveriaSerPersisitido() {
		RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();

		PublicadorDeEventos publicador = new PublicadorDeEventos();
		publicador.adicionar(new LogDeAlunoMatriculado());

		MatricularAluno useCase = new MatricularAluno(repositorio, publicador);

		MatricularALunoDto dados = new MatricularALunoDto(
				"Fulano", "123.456.789-00", "fulano@email.com");
		useCase.executa(dados);

		Aluno encontrado = repositorio.buscarPorCpf(new Cpf("123.456.789-00"));

		assertEquals("Fulano", encontrado.getNome());
		assertEquals("123.456.789-00", encontrado.getCpf().getNumero());
		assertEquals("fulano@email.com", encontrado.getEmail());

	}

}
