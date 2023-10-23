package br.com.alura.escola.dominio;

import br.com.alura.escola.dominio.aluno.Cpf;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CpfTest {

    @Test
    void naoDeveriaCriarCpfComNuemrosInvalidos(){
        assertThrows(IllegalArgumentException.class,
                () -> new Cpf("981272.768-73"));
        assertThrows(IllegalArgumentException.class,
                () -> new Cpf("981272.76873"));
        assertThrows(IllegalArgumentException.class,
                () -> new Cpf("98127276873"));
        assertThrows(IllegalArgumentException.class,
                () -> new Cpf(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Cpf(null));
    }

    @Test
    void deveriaCriarCpfValido(){
        String numero = "957.387.740-60";
        Cpf cpf = new Cpf(numero);
        assertEquals(numero, cpf.getNumero());
    }
}
