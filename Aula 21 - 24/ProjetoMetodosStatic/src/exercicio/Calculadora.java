package exercicio;

import java.util.Scanner;

public class Calculadora {
	
	public static double somar(double a, double b) {
		return a + b;
	}
	
	public static double subtrair(double a, double b) {
		return a - b;
	}
	
	public static double multiplicar(double a, double b) {
		return a * b;
	}
	
	public static double maiorNumero(double a, double b) {
		if (a > b) return a;
		return b;
	}
	
	public static double lerNumero(Scanner sc, String mensagem) {
		while(true) {
			System.out.println(mensagem);
			String entrada = sc.nextLine().trim();
			
			if (entrada.isEmpty()) {
				return 0;
			}
			
			try {
				return Double.parseDouble(entrada);
			} catch (NumberFormatException e) {
				System.out.println("ERRO: Entrada Inválida");
			}
		}
	}
}
