package br.com.alura.escola.dominio.aluno;

public interface EncriptadorDeSenha {

    String EncriptarSenha(String senha);
    boolean validarSenhaEncriptada(String senhaEncriptada, String senha);
}
