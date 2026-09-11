package estacionamento;

import java.time.LocalDate;
import java.util.*;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo = 1, option;
		
		HashMap<Integer, Veiculo> veiculos = new HashMap<>();
		String placa = null, modelo = null, proprietario = null;
		//Integer ano = null; // int primitivo não aceita "null"
		
		do {

			exibirMenu();
			option = Integer.parseInt(sc.nextLine());

			switch (option) {

			case 1:
				cadastrarVeiculo(sc, codigo, veiculos);
				codigo ++;
				break;
				
			case 2:
				pesquisarVeiculo(sc, veiculos);
				break;
				
			case 3:
				listarVeiculos(veiculos);
				break;
				
			case 4:
				alterarProprietario(sc, codigo, proprietario, veiculos);
				break;
				
			case 5:
				removerVeiculo(sc, codigo, veiculos);
				break;
				
			case 0:
				break;

			}

		} while (option != 0);

		
		sc.close();
	}
	
	public static void exibirMenu() {
		System.out.println("=== Menu de Opções ===\n" + "1- Registrar entrada de veículo\n" + "2- Pesquisar Veículo\n"
				+ "3- Listar Veículos\n" + "4- Alterar Proprietário\n" + "5- Registrar saída do veículo\n" + "0- ENCERRAR\n");
	}
	
	public static void cadastrarVeiculo(Scanner sc, int codigo, HashMap<Integer, Veiculo> veiculos) {
		String placa, modelo, proprietario;
		int ano;
		
		
		do {
			System.out.println("Digite a Placa");
			placa = sc.nextLine().toUpperCase().trim();
		} while (placa.length() != 7);
		
		System.out.println("Digite o Modelo");
		modelo = sc.nextLine().toUpperCase().trim();
		
		System.out.println("Digite o Nome do Proprietário: ");
		proprietario = sc.nextLine().toUpperCase().trim();
		
		int anoAtual = LocalDate.now().getYear();
		do {
			System.out.println("Digite o Ano do Veículo: ");
			ano = Integer.parseInt(sc.nextLine());
		} while (ano < 1889 || ano > (anoAtual + 1));
		
		veiculos.put(codigo, new Veiculo(placa, modelo, proprietario, ano));
		
	}

	public static void pesquisarVeiculo(Scanner sc, HashMap<Integer, Veiculo> veiculos) {
		int codigo;
		System.out.println("Nome o Código do Veículo: ");
		codigo = Integer.parseInt(sc.nextLine());
		
		if(veiculos.containsKey(codigo)) {
			Veiculo veiculo = veiculos.get(codigo);
			veiculo.exibirDados();
		}
		else System.out.println("Veículo não encontrado");
	}
	

	public static void listarVeiculos(HashMap<Integer, Veiculo> veiculos) {
		System.out.println("Lista de Veículos:");
		for(Map.Entry<Integer, Veiculo>veiculo : veiculos.entrySet()) {
			veiculo.getValue().exibirDados();
			System.out.println("");
		}
	}

	public static void alterarProprietario(Scanner sc,int codigo, String proprietario, HashMap<Integer, Veiculo> veiculos) {
		System.out.println("Nome o Código do Veículo: ");
		codigo = Integer.parseInt(sc.nextLine());
		
		if(veiculos.containsKey(codigo)) {
			Veiculo veiculo = veiculos.get(codigo);
			System.out.printf("Proprietário Atual: %s\n", veiculo.getProprietario());
			
			System.out.println("Digite o novo proprietário: ");
			veiculo.setProprietario(sc.nextLine().toUpperCase().trim());
		}
		else System.out.println("Veículo não encontrado");
	}
	
	public static void removerVeiculo(Scanner sc,int codigo, HashMap<Integer, Veiculo> veiculos) {
		System.out.println("Nome o Código do Veículo: ");
		codigo = Integer.parseInt(sc.nextLine());
		
		if(veiculos.containsKey(codigo)) {
			veiculos.remove(codigo);
		}
		else System.out.println("Veículo não encontrado");
	}

}
