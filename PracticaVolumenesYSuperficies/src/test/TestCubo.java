package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import clases.Cubo;

class TestCubo {

	@Test
	void testSuperficie() {
		Cubo c = new Cubo();
		int valorEsperado = 6;
		double valorObtenido = c.superficie();
		assertEquals(valorEsperado,valorObtenido);
	}

	@Test
	void testVolumen() {
		Cubo c = new Cubo();
		int valorEsperado = 1;
		double valorObtenido = c.volumen();
		assertEquals(valorEsperado,valorObtenido);
	}
	
	@Test
	void testConstructor_negativo() {
		try {
			new Cubo(-10);
			fail("Se esperaba error");
		} catch (IllegalArgumentException e) {
			assertEquals("Error, lado negativo", e.getMessage());
		}
	}

}
