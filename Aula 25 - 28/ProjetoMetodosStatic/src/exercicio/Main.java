package exercicio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = Double.NaN, percentual = Double.NaN, entradaParcelas = Double.NaN;
		
		// Leitura e Validação de Dados
		do {
			preco = CalculadoraPreco.lerDouble(sc, "Digite o Preço: ");
		} while (Double.isNaN(preco));
		
		do {
			percentual = CalculadoraPreco.lerDouble(sc, "Digite o Percentual de Desconto: ");
		} while (Double.isNaN(percentual));
		
		do {
			entradaParcelas = CalculadoraPreco.lerDouble(sc, "Digite o Número de Parcelas: ");
		} while (Double.isNaN(entradaParcelas));
		int parcelas = (int) entradaParcelas;
		
		System.out.printf(
				"\nPreço Original: R$%.2f\n" +
				"Valor do Desconto: R$%.2f\n" +
				"Preço c/ Desconto: R$%.2f\n" + 
				"%d Parcelas de: R$%.2f\n",
				preco,
				CalculadoraPreco.CalcularDesconto(preco, percentual),
				CalculadoraPreco.calcularPrecoComDesconto(preco, percentual),
				parcelas,
				CalculadoraPreco.calcularParcelamento(preco, parcelas)
				);
		

		sc.close();
	}

}
