package ex15;

import java.util.Scanner;

public class exercicio_15 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Entrada de Dados
		int par = 0, impar = 0;
		int[] n = new int[8];
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("Digite um número inteiro: ");
			n[i] = sc.nextInt();
			
			if(n[i] % 2 == 0) par++;
			else impar++;
		}
		
		// Exibir Resultados
		for(int i = 0; i < n.length; i++) {
			String resultado = (n[i] % 2 == 0 ? "Par" : "Ímpar");
			System.out.printf("Número %d: %s\n", n[i], resultado);
		}
		System.out.println("Qtd Pares: " + par + "\nQts Ímpares: " + impar);
		
		sc.close();
	}

}
