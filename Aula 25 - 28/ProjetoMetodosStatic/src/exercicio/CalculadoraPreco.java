package exercicio;

import java.util.Scanner;

public class CalculadoraPreco {
	
	public static double CalcularDesconto(double preco, double percentual) {
		return (preco * (percentual / 100));
	}
	
	public static double calcularPrecoComDesconto(double preco, double percentual) {
		return (preco - (preco * (percentual / 100)));
	}
	
	public static double calcularAcressimo(double preco, double percentual) {
		return (preco * ((percentual + 100) / 100));
	}
	
	public static double calcularParcelamento(double preco, double parcelas) {
		return preco / parcelas;
	}
	
	public static double lerDouble(Scanner sc, String mensagem) {
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
