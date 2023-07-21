package elias.CalculadoraTest.main;

import elias.Calculadora.clase.Calculadora;

public class CalculadoraTest {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora(500.0, '+', 50.0);
	
		calculadora.getResult();
		
	}

}
