package br.com.alura.escola.dominio.aluno;

import br.com.alura.escola.aplicacao.indicacao.aluno.matricular.MatricularALunoDto;
import br.com.alura.escola.aplicacao.indicacao.aluno.matricular.MatricularAluno;
import br.com.alura.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    private Aluno aluno;

    @BeforeEach
    void beforeEach(){
        this.aluno = new Aluno("Fulano da Silva",
                new Cpf("123.456.789-00"),
                new Email("Fulano@email.com"));
    }

    @Test
    void deveriaAdicionar1Telefone() {
        this.aluno.adicionarTelefone("12", "123456789");

        assertEquals(1, this.aluno.getTelefones().size());
    }

    @Test
    void deveriaAdicionar2Telefones() {

        this.aluno.adicionarTelefone("12", "123456789");
        this.aluno.adicionarTelefone("12", "123456769");

        assertEquals(2, this.aluno.getTelefones().size());
    }
    @Test
    void naoDeveriaAdicionar3Telefones() {

        assertThrows(IllegalArgumentException.class, () -> {
            this.aluno.adicionarTelefone("12", "123456789");
            this.aluno.adicionarTelefone("12", "123456769");
            this.aluno.adicionarTelefone("12", "127456769");
        });
    }
}