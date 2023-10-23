package br.com.alura.escola.dominio;

import br.com.alura.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelefoneTest {

    @Test
    void naoDeveriaCriarTelefoneComDddInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "832494669"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "832494669"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "832494669"));
    }
    @Test
    void naoDeveriaCriarTelefoneComNumeroInvalido(){
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("13", "8324954669"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("14", "8324946"));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("14", ""));
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("43", null));
    }

    @Test
    void deveriaCriarTelefoneValido(){

        String ddd = "12";
        String numero = "832494669";
        Telefone telefone = new Telefone(ddd, numero);
        assertEquals(ddd, telefone.getDdd());
        assertEquals(numero, telefone.getNumero());
    }
}
