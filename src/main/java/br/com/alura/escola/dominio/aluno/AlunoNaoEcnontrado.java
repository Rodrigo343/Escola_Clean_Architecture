package br.com.alura.escola.dominio.aluno;

public class AlunoNaoEcnontrado extends RuntimeException {

    private static  final long serialVersionUID = 1L;
    public AlunoNaoEcnontrado(Cpf cpf) {
        super("Aluno nao encontrado com CPF: " + cpf.getNumero());
    }
}
