package exercicios;
import java.util.Scanner;

public class exercicio_8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		double n;
		
		do {
			System.out.println(
					"=== PARA FINALIZAR DIGITE UM NÚMERO MENOR OU IGUAL A 0 ===\n\n" +
					"Digite um número positivo: "
			);
			n = sc.nextDouble();
			
			System.out.println(
					"\nValor digitado: " + n + "\n" +
					"O quadrado do número: " + Math.pow(n, 2) + "\n" +
					"O cubo do número: " + Math.pow(n, 3) + "\n" +
					"A raiz quadrada do número: " + Math.sqrt(n) + "\n" 
			);
			
		} while(n > 0);
		
		sc.close();
	}

}
