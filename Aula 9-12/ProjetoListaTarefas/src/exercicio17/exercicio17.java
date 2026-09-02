package exercicio17;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> convidados = new ArrayList<>();
		int op; // Lê a opção digitada no menu
		String nome; 
		
		do {
			System.out.println(
					"\n=== MENU DE OPÇÕES ===\n" +
					"1- Adicionar Convidado\n" +
					"2- Alterar Convidado\n" +
					"3- Remover Convidado\n" +
					"4- Procurar Convidade\n" +
					"5- Exibir Convidados\n" +
					"6- Encerrar\n"
			);
			op = Integer.parseInt(sc.nextLine());
			
			switch(op) {
				case 1:
					System.out.println("Digite o nome do convidado:");
					convidados.add(sc.nextLine());
					break;

				case 2:
					System.out.println("Insira a posição que deseja alterar:");
					int posicao = Integer.parseInt(sc.nextLine());
					
					if(posicao <= (convidados.size() - 1)) {					
						System.out.println("Digite o novo nome:");
						nome = sc.nextLine();
						
						convidados.set(posicao, nome);
					}
					else {
						System.out.println("Posição não existente");
					}
					break;
					
				case 3:
					System.out.println("Qual nome deseja remover?");
					nome = sc.nextLine();
					
					if (convidados.contains(nome)) {
						convidados.remove(convidados.indexOf(nome));
					} else {
						System.out.println("Nome não encontrado");
					}
					break;
					
				case 4:
					System.out.println("Nome do Convidado:");
					nome = sc.nextLine();
					
					System.out.println("Posição: " + convidados.indexOf(nome));
					break;
					
				case 5:
					for (String n : convidados) {
						System.out.println(n);
					}
					break;
					
				case 6:
					break;
			}
			
		}while(op != 6);
		
		sc.close();
		
	}

}
