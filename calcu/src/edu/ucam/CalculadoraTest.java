package edu.ucam;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {
	
	
	
	@Test
	void testSuma() {
		Calculadora calc= new Calculadora (6, 2);
		int resultado = calc.suma();
		assertNotNull("El resultado no es null ", resultado);
	}

	@Test
	void testResta() {
		Calculadora calc= new Calculadora (6, 2);
		Object resultado = calc.resta();
		resultado =  null;
		assertNull("El resultado es es null:", resultado);
	}

	@Test
	void testMultiplica() {
		Calculadora calc= new Calculadora (6, 2);
		int resultadomult = calc.multiplica();
		int resultadodiv = calc.divide();
		assertNotSame("No son iguales : ", resultadomult, resultadodiv);
	}

	@Test
	void testDivide() {
		Calculadora calc= new Calculadora (6, 2);
		int resultadomult = calc.multiplica();
		int resultadodiv = calc.divide();
		assertSame("Son iguales : ", resultadomult, resultadodiv);
	}

	@Test
	void testDoble() {
		Calculadora calc= new Calculadora (6, 2);
		int resultado = calc.doble();
		assertEquals(17, resultado);
	}
	
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
