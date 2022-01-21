package edu.ucam;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class TestPartition2 {
	@Test
	void testValidarMaximo() {
		Calculadora calc= new Calculadora (0, 0);
		assertFalse("Esta variable no es false: ", calc.validarMaximo(3));
	}
	
	@Test
	void testValidarMinimo() {
		Calculadora calc= new Calculadora (0, 0);
		assertTrue("Esta variable es false: ", calc.validarMinimo(8));
	}

	@Test
	void testcoleccion() {
		int[] numeros = {};
		Calculadora calc= new Calculadora (numeros);
		int[] coleccion = calc.coleccion(numeros);
		int[] coleccion1 = {5,4,3,2,1};
		assertArrayEquals("Fallo - No son los mismos arreglos", coleccion, coleccion1);
	}

}

