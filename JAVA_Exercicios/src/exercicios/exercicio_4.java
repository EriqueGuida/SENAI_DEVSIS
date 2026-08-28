package exercicios;
import java.util.Scanner;

public class exercicio_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.println("Digite um Número: ");
			n = sc.nextInt();
		}while (n <0);
		
		for(int i=1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n* i));
		}
		
		sc.close();
	}

}
