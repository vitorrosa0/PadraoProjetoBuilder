package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBuilderTest {

    @Test
    void deveRetornarExcessaoParaContaSemNumeroConta() {
        try {
            ContaBuilder contaBuilder = new ContaBuilder();
            Conta conta = contaBuilder
                    .setTitular("Vitor Rosa")
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Número da conta inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcessaoParaContaSemTitular() {
        try {
            ContaBuilder contaBuilder = new ContaBuilder();
            Conta conta = contaBuilder
                    .setNumeroConta(123)
                    .build();
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Titular inválido", e.getMessage());
        }
    }

    @Test
    void deveRetornarAlunoValido() {
        ContaBuilder contaBuilder = new ContaBuilder();
        Conta conta = contaBuilder
                .setNumeroConta(123)
                .setTitular("Vitor Rosa")
                .build();

        assertNotNull(conta);
    }

}