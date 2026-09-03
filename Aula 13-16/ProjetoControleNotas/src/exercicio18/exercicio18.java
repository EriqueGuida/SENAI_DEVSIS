package exercicio18;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> alunos = new ArrayList<>();
		ArrayList<Double> notas = new ArrayList<>();
		
		double maior_nota, menor_nota;
		int op;

		do {
			System.out.println("\n=== Menu de Opções ===\n" + "1- Cadastrar alunos\n" + "2- Listar alunos\n"
					+ "3- Procurar aluno\n" + "4- Alterar nota\n" + "5- Remover aluno\n" + "6- Exibir média da turma\n"
					+ "7- Exibir maior e menor nota\n" + "8- Exibir situação dos alunos\n" + "9- Encerrar\n");
			op = Integer.parseInt(sc.nextLine());

			switch (op) {
			case 1:
				System.out.println("Digite o nome do aluno");
				alunos.add(sc.nextLine());
				
				double nota;
				do {
					System.out.println("Digite a nota do aluno");
					nota = Double.parseDouble(sc.nextLine()); 
				} while(nota < 0 || nota > 10);
				notas.add(nota);

				break;

			case 2:
				System.out.println("Alunos Listados:");

				for (int i = 0; i < alunos.size(); i++) {
					System.out.println("Posição " + i + " - " + alunos.get(i) + " - " + "Nota: " + notas.get(i));
				}

				break;

			case 3:
				int op3;
				do {
					System.out.println("1- Procurar por nome.\n" + "2- Procurar por posição.\n");
					op3 = Integer.parseInt(sc.nextLine());

					switch (op3) {
					case 1:
						System.out.println("Digite o nome do aluo: ");
						String nome = sc.nextLine();

						if (alunos.contains(nome)) System.out.println("Posição: " + alunos.indexOf(nome));
						else System.out.println("Nome não encontrado.");

						break;

					case 2:
						System.out.println("Digite a posição do aluno: ");
						int posicao = Integer.parseInt(sc.nextLine());

						if (posicao > alunos.size() - 1) System.out.println("Posição não encontrada.");
						else System.out.println("Nome do Aluno: " + alunos.get(posicao));

						break;
					}

				} while (op3 <= 0 || op3 > 2);
				break;

			case 4:
				System.out.println("Digite o nome do aluo: ");
				String nome = sc.nextLine();

				if (!alunos.contains(nome)) {
					System.out.println("Nome não encontrado.");
					break;
				}

				int posicao = alunos.indexOf(nome);
				
				System.out.printf(
						"Nome: %s\n" + "Nota Atual: %.2f\n" + "Digite a nota nota: ", nome, notas.get(posicao)
						);
				notas.set(posicao, Double.parseDouble(sc.nextLine()));

				break;
				
			case 5:
				System.out.println("Digite a posição do aluno: ");
				int posicao5 = Integer.parseInt(sc.nextLine());
				
				if (posicao5 > alunos.size() - 1) {
					System.out.println("Posição não encontrada.");
					break;
				}
									
				alunos.remove(posicao5);
				notas.remove(posicao5);
				System.out.println("Aluno removido com êxito.");
				
				break;
				
			case 6:
				if (notas.isEmpty()) {
					System.out.println("Lista Vazia");
					break;
				}
				
				double soma = 0;
				for (double nota6 : notas) {
					soma += nota6;
				}
				
				System.out.printf("Média: %.2f\n", (soma / notas.size()));
				
				break;
				
			case 7:
				maior_nota = notas.get(0);
				menor_nota = notas.get(0);
				
				for (double nota7 : notas) {
					if (nota7 > maior_nota) maior_nota = nota7;
					if (nota7 < menor_nota) menor_nota = nota7;
				}
				
				System.out.printf("Maior Nota: %.2f\n" + "Menor Nota: %.2f\n", maior_nota, menor_nota);
				break;
				
			case 8:
				System.out.println("Situação dos Alunos:");
				
				for (int i = 0; i < alunos.size(); i++) {
					if (notas.get(i) >= 7) System.out.println("Nome: "+ alunos.get(i) + "Situação: Aprovado");
					else if (notas.get(i) < 5) System.out.println("Nome: "+ alunos.get(i) + "Situação: Reprovado");
					else System.out.println("Nome: "+ alunos.get(i) + "Situação: Reprovado");
				}
				
				break;
				
			case 9:
				break;
			}
		} while (op != 9);

		sc.close();
	}

}
