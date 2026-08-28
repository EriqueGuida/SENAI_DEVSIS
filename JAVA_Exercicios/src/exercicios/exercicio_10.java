package exercicios;

import java.util.Scanner;

public class exercicio_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int op;
		double salario;

		// Ler e validar números
		do {
			System.out.println("Digite o seu Salário: ");
			salario = sc.nextDouble();
		} while (salario < 0);

		// Menu de opções
		do {
			System.out.println("\n=== MENU DE OPÇÕES ===\n" + "1 - Calcular o imposto sobre o salário.\n"
					+ "2 - Calcular o novo salário após um aumento.\n" + "3 - Mostrar a classificação do salário.\n"
					+ "4 - Finalizar o programa.\n" + "-------------------------------------------");

			System.out.println("Digite uma Opção: ");
			op = sc.nextInt();

			switch (op) {
			case 1:
				System.out.println("Calcular o imposto sobre o salário:\n");

				if (salario < 500) {
					double imposto = salario * 0.05;
					System.out.printf("Valor do Imposto: R$ %.2f\n", imposto);
				} else if (salario < 850) {
					double imposto = salario * 0.1;
					System.out.printf("Valor do Imposto: R$ %.2f\n", imposto);
				} else {
					double imposto = salario * 0.15;
					System.out.printf("Valor do Imposto: R$ %.2f\n", imposto);
				}
				break;
			case 2:
				System.out.println("Calcular o novo salário após um aumento:\n");
				if (salario < 450) {
					System.out.printf("Salário com Aumento: R$ " + (salario + 100));
				} else if (salario < 750) {
					System.out.printf("Salário com Aumento: R$ " + (salario + 75));
				} else if (salario < 1500) {
					System.out.printf("Salário com Aumento: R$ " + (salario + 50));
				} else {
					System.out.printf("Salário com Aumento: R$ " + (salario + 250));
				}
				break;
			case 3:
				System.out.println("Mostrar a classificação do salário");
				if (salario < 700) {
					System.out.println("Mal Remunerado");
				} else {
					System.out.println("Bem Remunerado");
				}
				break;
			default:
				System.out.println("Finalizando o Programa.");
				break;
			}
		} while (op != 4);

		sc.close();
	}

}
