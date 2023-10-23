package escola;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

    private Cpf nome;
    private String cpf;
    private Email email;
    private List<Telefone> telefones = new ArrayList<>();

    public Aluno(Cpf nome, String cpf, Email email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public Cpf getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Email getEmail() {
        return email;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void adicionarTelefone(String ddd, String numero){
        this.telefones.add(new Telefone(ddd, numero));
    }
}
