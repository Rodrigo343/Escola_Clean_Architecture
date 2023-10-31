package br.com.alura.escola.academico.dominio.aluno;

import br.com.alura.escola.shared.dominio.Cpf;

public class AlunoNaoEcnontrado extends RuntimeException {

    private static  final long serialVersionUID = 1L;
    public AlunoNaoEcnontrado(Cpf cpf) {
        super("Aluno nao encontrado com CPF: " + cpf.getNumero());
    }
}
