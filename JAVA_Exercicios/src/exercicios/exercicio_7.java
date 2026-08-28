package exercicios;
import java.util.Scanner;

public class exercicio_7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n1, n2, op;
		
		//Ler e validar números
		do {
			System.out.println("Digite o Primeiro Número: ");
			n1 = sc.nextInt();
		}while (n1 <0);
		
		do {
			System.out.println("Digite o Segundo Número: ");
			n2 = sc.nextInt();
		}while (n2 <0);
		
		//Menu de opções
		do {
			System.out.println(
					"=== MENU DE OPÇÕES ===\n" +
					"1 - Calcular a média dos números.\n" +
					"2 - Subtrair o menor número do maior.\n" +
					"3 - Multiplicar os números.\n" +
					"4 - Dividir o primeiro número pelo segundo.\n" + 
					"-------------------------------------------"
					);
			
			System.out.println("Digite uma Opção: ");
			op = sc.nextInt();
		}while (op <= 0 || op > 4);

		
		
		switch (op) {
		    case 1:
		        System.out.println(
		        		"Calcular a média dos números:\n" +
		        		"Média = " + ((n1 + n2)/2)
		        );
		        break;
		    case 2:
		    	System.out.println("Subtrair o menor número do maior:");
		    	if(n1 > n2) {
		    		System.out.println("Subtração = " + (n1 - n2));
		    	} else {
		    		System.out.println("Subtração = " + (n2 - n1));
		    	}
		        break;
		    case 3:
		        System.out.println(
		        		"Multiplicar os números:\n" +
		        		"Multiplicação = " + (n1 * n2)
		        ); 
		        break; 
		    default:
		        System.out.println(
		        		"Dividir o primeiro número pelo segundo.\n" +
		        		"Divisão = " + (n1 / n2)
		        ); 
		        break;
		}

		
		sc.close();
	}

}
