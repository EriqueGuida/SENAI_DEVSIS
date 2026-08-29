package ex14;

import java.util.Scanner;

public class exercicio_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double[] temperaturas = new double[7];
		
		// Cadastrar Temperaturas 
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.printf("Digite a %d° temperatura: ", i);
			temperaturas[i] = sc.nextDouble();
		}
		
		// Analisar MAIOR e MENOR temperatura
		double maior = temperaturas[0], menor = temperaturas[0];
		for (int i = 0; i < temperaturas.length; i++) {
			if(temperaturas[i] > maior) maior = temperaturas[i];
			if(temperaturas[i] < menor) menor = temperaturas[i];
		}
		
		// Exibir Resultados
		System.out.println("Temperaturas Cadastradas");
		for (int i = 0; i < temperaturas.length; i++) {
			System.out.println(temperaturas[i]);
		}
		System.out.println("Maior temperatura: " + maior + "\nMenor temperatura: " + menor);
		
		sc.close();
	}

}
