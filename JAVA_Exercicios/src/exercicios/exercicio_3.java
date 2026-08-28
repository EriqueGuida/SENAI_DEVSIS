package exercicios;
import java.util.Scanner;

public class exercicio_3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a BASE do Triângulo: ");
		double b = sc.nextDouble();

		System.out.println("Digite a ALTURA do Triângulo: ");
		double h = sc.nextDouble();
		
		System.out.println((b * h) / 2);
		
		sc.close();
	}

}
