package edu.ucam;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestPartition1 {

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

}
