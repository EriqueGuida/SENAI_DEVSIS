package exercicio18;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int op; // Lê a opção digitada no menu

		do {
			System.out.println(
					"\n=== MENU DE OPÇÕES ===\n" +
					"1- Adicionar Convidado\n" +
					"2- Alterar Convidado\n" +
					"3- Remover Convidado\n" +
					"4- Procurar Convidade\n" +
					"5- Exibir Convidados\n" +
					"6- Encerrar\n"
					"7- Exibir maior e menor nota\n"
					"8- Exibir situação dos alunos\n"
					"9- Encerrar\n"
			);
			op = Integer.parseInt(sc.nextLine());
			
			}while(op != 9);
	}

}
