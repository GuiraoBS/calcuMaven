package edu.ucam;

public class Calculadora {
	
	private int num1;
	private int num2;
	
	
	
	
	public Calculadora(int a, int b) {
		num1= a;
		num2= b;
	}
	
	public Calculadora(int numeros[]) {
		int numeros1[] = {1,2,3,4,5,6,7,8,9,10};
	}
	
	
	public int suma() {
		int result = num1 + num2;
		return result;
	}
	
	public int resta() {
		int result = num1 - num2;
		return result;
	}
	
	public int multiplica() {
		int result = num1 * num2;
		return result;
	}
	
	public int divide() {
		int result = num1 / num2;
		return result;
	}
	
	public int mitad() {
		int result = num1 / 2;
		return result;
	}
	
	public int doble() {
		int result = num1 * 2;
		return result;
	}
	
	public int cuadrado() {
		int result = num1 * num1;
		return result;
	}
	public int cubo() {
		int result = num1 * num1 * num1;
		return result;
	}
	
	public boolean validarMaximo(int maximo){
		 boolean max = false;
		 
		 for (int i = 0; i < maximo; i++) {
			 if(i == 3){
				 max = true;
				 break;
			 }
		 }
		 return max;
		}
	
	public boolean validarMinimo(int minimo){
		 boolean min = false;
		 
		 for (int i = 3; i > minimo; i++) {
			 if(i == 0){
				 min = true;
				 break;
			 }
		 }
		 return min;
		}
	
	public int[] coleccion(int[] numeros) {
		for (int i=0;i<numeros.length;i++) {
			System.out.println(numeros[i]);
		}
		return numeros;
	}
}