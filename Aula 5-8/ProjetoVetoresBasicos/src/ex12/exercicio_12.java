package ex12;

import java.util.Scanner;

public class exercicio_12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int[] n = new int[5];

		for (int i = 0; i < n.length; i++) {
			do {
				System.out.printf("Digite o número da posição %d: \n", i);
				n[i] = sc.nextInt();
			} while (n[i] < 0);
		}
		
		for (int i = 0; i < n.length; i++) {
			System.out.println(n[i]);
		}
		
		sc.close();
		
	}

}
