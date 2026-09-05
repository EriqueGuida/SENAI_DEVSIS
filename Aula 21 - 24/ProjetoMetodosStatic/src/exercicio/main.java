package exercicio;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		final int QTD_NUMEROS = 2;
		double num1 = Double.NaN, num2 = Double.NaN;
		int option;
		
		do {
			System.out.println(
					"\nMenu de Opções:\n" +
					"1- Somar\n" +
					"2- Subtrair\n" +
					"3- Multiplicar\n" +
					"4- Maior Número\n" +
					"5- Sair\n"
					);
			option = Integer.parseInt(sc.nextLine());
			
			switch(option) {
			case 1:
				do {
					num1 = Calculadora.lerNumero(sc, "Digite o 1º número (Enter para 0): ");
				} while(Double.isNaN(num1));
				
				do {
					num2 = Calculadora.lerNumero(sc, "Digite o 2º número (Enter para 0): ");
				} while(Double.isNaN(num2));
				
				System.out.printf("Resultado: %.2f\n", Calculadora.somar(num1, num2));

				break;
				
			case 2:
				break;
				
			case 3:
				break;
				
			case 4:
				break;
				
			case 5:
				break;
			}
			
		}while(option != 5);
		
		sc.close();
	}

}
