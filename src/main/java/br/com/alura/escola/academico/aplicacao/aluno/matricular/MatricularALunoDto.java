package br.com.alura.escola.academico.aplicacao.aluno.matricular;

import br.com.alura.escola.academico.dominio.aluno.Aluno;
import br.com.alura.escola.shared.dominio.Cpf;
import br.com.alura.escola.academico.dominio.aluno.Email;

public class MatricularALunoDto {

    private String nomeALuno;
    private String cpfALuno;
    private String emailALuno;

    public MatricularALunoDto(String nomeALuno, String cpfALuno, String emailALuno) {
        this.nomeALuno = nomeALuno;
        this.cpfALuno = cpfALuno;
        this.emailALuno = emailALuno;
    }

    public Aluno criarALuno() {
        return new Aluno(nomeALuno, new Cpf(cpfALuno), new Email(emailALuno));
    }
}
