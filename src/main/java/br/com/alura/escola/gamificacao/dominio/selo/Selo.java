package br.com.alura.escola.gamificacao.dominio.selo;

import br.com.alura.escola.shared.dominio.Cpf;

public class Selo {

    private Cpf cpfDoAluno;
    private String nome;

    public Selo(Cpf cpfDoAluno, String nome) {
        this.cpfDoAluno = cpfDoAluno;
        this.nome = nome;
    }

    public Cpf getCpfDoAluno() {
        return cpfDoAluno;
    }

    public String getNome() {
        return nome;
    }
}
