package funcionarios;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		HashMap<Integer, Funcionario> funcionarios = new HashMap<>();
		int codigo = 1, option;

		do {
			exibirMenu();
			option = Integer.parseInt(sc.nextLine());
			
			switch(option) {
			case 1:
				cadastrarFuncionario(sc, codigo, funcionarios);
				codigo++;
				break;
				
			case 2:
				pesquisarFuncionario(sc, funcionarios);
				break;
				
			case 3:
				listarFuncionario(funcionarios);
				break;
				
			case 4:
				alterarCargo(sc, funcionarios);
				break;
				
			case 5:
				aumentoSalarial(sc, funcionarios);
				break;
				
			case 6:
				removerFuncionario(sc, funcionarios);
				break;
				
			case 0:
				System.out.println("Programa Encerrado.");
				break;
			
			default:
				System.out.println("Opção Inválida.");
			}
		} while (option != 0);

		sc.close();
	}

	public static void exibirMenu() {
		System.out.println("\n=== MENU DE OPÇÕES ===\n" + "1- Cadastrar Funcionário\n" + "2- Pesquisar Funcionário\n"
				+ "3- Listar Funcionário\n" + "4- Alterar Cargo\n" + "5- Aplicar Aumento Salarial\n"
				+ "6- Remover Funcionário\n" + "0- ENCERRAR\n");
	}
	
	public static void cadastrarFuncionario(Scanner sc, int codigo, HashMap<Integer, Funcionario> funcionarios) {
		String nome, cargo;
		double salario;
		
		System.out.println("Nome:");
		nome = sc.nextLine().toUpperCase().trim();
		
		System.out.println("Cargo:");
		cargo = sc.nextLine().toUpperCase().trim();
		
		do {
			System.out.println("Salário:");
			salario = Double.parseDouble(sc.nextLine());
		} while (salario < 0);
		
		funcionarios.put(codigo, new Funcionario(nome, cargo, salario));
		
	}
	
	public static void pesquisarFuncionario(Scanner sc, HashMap<Integer, Funcionario> funcionarios) {
		System.out.println("Código do Funcionário:");
		int codigo = Integer.parseInt(sc.nextLine());
		
		if (funcionarios.containsKey(codigo)) {
			Funcionario funcionario = funcionarios.get(codigo);
			funcionario.exibirDados();
		}
		else System.out.println("NÃO ENCONTRADO");
	}
	
	public static void listarFuncionario(HashMap<Integer, Funcionario> funcionarios) {
		System.out.println("Lista de Alunos:");
		
		for (Map.Entry<Integer, Funcionario> funcionario : funcionarios.entrySet()) {
			funcionario.getValue().exibirDados();
			System.out.println("");
		}
	}
	
	public static void alterarCargo(Scanner sc, HashMap<Integer, Funcionario> funcionarios) {
		System.out.println("Código do Funcionário:");
		int codigo = Integer.parseInt(sc.nextLine());
		
		if (funcionarios.containsKey(codigo)) {
			Funcionario funcionario = funcionarios.get(codigo);
			
			System.out.println("Novo Cargo:");
			funcionario.setCargo(sc.nextLine().trim());
		}
		else System.out.println("NÃO ENCONTRADO");
	}
	
	public static void aumentoSalarial(Scanner sc, HashMap<Integer, Funcionario> funcionarios) {
		System.out.println("Código do Funcionário:");
		int codigo = Integer.parseInt(sc.nextLine());
		
		if (funcionarios.containsKey(codigo)) {
			Funcionario funcionario = funcionarios.get(codigo);
			
			System.out.println("Percentual de aumento:");
			double percentual = Double.parseDouble(sc.nextLine());
			funcionario.aumentarSalario(percentual);
		}
		else System.out.println("NÃO ENCONTRADO");
	}
	
	public static void removerFuncionario(Scanner sc, HashMap<Integer, Funcionario> funcionarios) {
		System.out.println("Código do Funcionário:");
		int codigo = Integer.parseInt(sc.nextLine());
		
		if (funcionarios.containsKey(codigo)) {
			funcionarios.remove(codigo);
		}
		else System.out.println("NÃO ENCONTRADO");
	}
}
