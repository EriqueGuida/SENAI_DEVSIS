package ex13;
import java.util.Scanner;


public class exercicio_13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double[] notas = new double[4];
		double soma = 0;
		
		for (int i = 0; i < notas.length; i++) {
			do {
				System.out.printf("Digite a %d° nota: ", i);
				notas[i] = sc.nextDouble();
			} while (notas[i] < 0 || notas[i] > 10);
			soma += notas[i];
		}
		
		System.out.println("Notas Cadastradas:");
		for (int i = 0; i < notas.length; i++) {
			System.out.println(notas[i]);
		}
		System.out.println("Média: " + soma / notas.length);
		
		sc.close();
	}

}
