package alunos;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo = 1;

		HashMap<Integer, Aluno> alunos = new HashMap<>();
		String nome = null, curso = null;
		double nota = Double.NaN;
		int option;

		do {

			exibirMenu();
			option = Integer.parseInt(sc.nextLine());

			switch (option) {

			case 1:
				cadastrarAluno(sc,codigo, nome, curso, nota, alunos);
				codigo ++;
				break;
				
			case 2:
				pesquisarAluno(sc, codigo, alunos);
				break;
				
			case 3:
				listarAlunos(alunos);
				break;
				
			case 4:
				alterarNota(sc, codigo, nota, alunos);
				break;
				
			case 5:
				removerAluno(sc, codigo, alunos);
				break;
				
			case 0:
				break;

			}

		} while (option != 0);

		sc.close();
	}

	public static void exibirMenu() {
		System.out.println("=== Menu de Opções ===\n" + "1- Cadastrar Aluno\n" + "2- Pesquisar Aluno\n"
				+ "3- Listar Aluno\n" + "4- Alterar Nota\n" + "5- Remover Aluno\n" + "0- ENCERRAR\n");
	}
	
	public static void cadastrarAluno(Scanner sc,int codigo, String nome, String curso, double nota, HashMap<Integer, Aluno> alunos) {
		System.out.println("Digite o nome: ");
		nome = sc.nextLine().toUpperCase().trim();
		
		System.out.println("Digite o Curso: ");
		curso = sc.nextLine().toUpperCase().trim();
		
		do {
			System.out.println("Digite a Nota: ");
			nota = Double.parseDouble(sc.nextLine());
		}while(nota < 0 || nota > 10);
		
		alunos.put(codigo, new Aluno(nome, curso, nota));
	}

	public static void pesquisarAluno(Scanner sc,int codigo, HashMap<Integer, Aluno> alunos) {
		System.out.println("Nome o Código do Aluno: ");
		codigo = Integer.parseInt(sc.nextLine());
		
		if(alunos.containsKey(codigo)) {
			Aluno aluno = alunos.get(codigo);
			aluno.exibirDados();
		}
		else System.out.println("Aluno não encontrado");
	}
	

	public static void listarAlunos(HashMap<Integer, Aluno> alunos) {
		System.out.println("Lista de Alunos:");
		for(Map.Entry<Integer, Aluno>aluno : alunos.entrySet()) {
			aluno.getValue().exibirDados();
		}
	}

	public static void alterarNota(Scanner sc,int codigo, double nota, HashMap<Integer, Aluno> alunos) {
		System.out.println("Nome o Código do Aluno: ");
		codigo = Integer.parseInt(sc.nextLine());
		
		if(alunos.containsKey(codigo)) {
			Aluno aluno = alunos.get(codigo);
			System.out.printf("Nota Altual: %.2f\n", aluno.getNota());
			
			System.out.println("Digite a Nova Nota: ");
			do {
				System.out.println("Digite a Nota: ");
				nota = Double.parseDouble(sc.nextLine());
			}while(nota < 0 || nota > 10);
			aluno.setNota(nota);
		}
		else System.out.println("Aluno não encontrado");
	}
	
	public static void removerAluno(Scanner sc,int codigo, HashMap<Integer, Aluno> alunos) {
		System.out.println("Nome o Código do Aluno: ");
		codigo = Integer.parseInt(sc.nextLine());
		
		if(alunos.containsKey(codigo)) {
			alunos.remove(codigo);
		}
		else System.out.println("Aluno não encontrado");
	}

}
