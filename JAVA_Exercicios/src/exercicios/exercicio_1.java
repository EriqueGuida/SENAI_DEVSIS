package exercicios;
import java.util.Scanner;

public class exercicio_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um Número: ");
		int n = sc.nextInt();
		
		if(n > 20) {
			System.out.println("Número maior que 20");
		} else if(n < 20){
			System.out.println("Número menor que 20");
		} else {
			System.out.println("Número igual a 20");
		}
		
		sc.close();
		
		
	}

}
