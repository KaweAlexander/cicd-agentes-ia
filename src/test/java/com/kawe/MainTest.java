package com.kawe;

import com.kawedev.Main;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    @Test
    void deveRetornarZeroPorCentoParaPrecoAbaixoDeCem() {
        double resultado = Main.calcularDesconto(50);

        assertEquals(0, resultado);
    }

    @Test
    void deveRetornarDezPorCentoParaPrecoDeCemReais() {
        double resultado = Main.calcularDesconto(100);

        assertEquals(10, resultado);
    }

    @Test
    void deveRetornarDezPorCentoParaPrecoAbaixoDeQuinhentos() {
        double resultado = Main.calcularDesconto(499.99);

        assertEquals(10, resultado);
    }

    @Test
    void deveRetornarVintePorCentoParaPrecoDeQuinhentosReais() {
        double resultado = Main.calcularDesconto(500);

        assertEquals(20, resultado);
    }

    @Test
    void deveRetornarVintePorCentoParaPrecoAcimaDeQuinhentos() {
        double resultado = Main.calcularDesconto(1000);

        assertEquals(20, resultado);
    }
}

