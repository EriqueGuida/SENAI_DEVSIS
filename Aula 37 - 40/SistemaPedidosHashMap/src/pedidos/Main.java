package pedidos;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo = 1;

		HashMap<Integer, Pedido> pedidos = new HashMap<>();
		String cliente, produto;
		double valorUnitario;
		int quantidade, option;

		do {
			
			exibirMenu();
			option = Integer.parseInt(sc.nextLine());
			
			switch(option) {
			case 1:
				cadastrarPedido(sc, codigo, pedidos);
				codigo++;
				break;
				
			case 2:
				pesquisarPedido(sc, pedidos);
				break;
				
			case 3:
				listarPedidos(pedidos);
				break;
				
			case 4:
				alterarQuantidade(sc, pedidos);
				break;
				
			case 5:
				removerPedido(sc, pedidos);
				break;
				
			case 6:
				exibirFaturamento(pedidos);
				break;
				
			case 0:
				break;
			}
			
		} while (option != 0);

		sc.close();
	}

	public static void exibirMenu() {
		System.out.println("\n=== MENU DE OPÇÕES ===\n" + "1- Cadastrar Pedido\n" + "2- Pesquisar Pedido\n"
				+ "3- Listar Pedido\n" + "4- Alterar Quantidade\n" + "5- Cancelar Pedido\n"
				+ "6- Exibir Faturamento Total\n" + "0- ENCERRAR\n");
	}
	
	public static void cadastrarPedido(Scanner sc, int codigo, HashMap<Integer, Pedido> pedidos) {
		String cliente, produto;
		double valorUnitario;
		int quantidade;
		
		System.out.println("Nome do Cliente: ");
		cliente = sc.nextLine().toUpperCase().trim();
		
		System.out.println("Nome do Produto: ");
		produto = sc.nextLine().toUpperCase().trim();
		
		do {
			System.out.println("Valor Unitário: ");
			valorUnitario = Double.parseDouble(sc.nextLine());
		} while (valorUnitario < 0);
		
		do {
			System.out.println("Quantidade: ");
			quantidade = Integer.parseInt(sc.nextLine());
		} while (quantidade < 0);
		
		pedidos.put(codigo, new Pedido(cliente, produto, valorUnitario, quantidade));
	}

	public static void pesquisarPedido(Scanner sc, HashMap<Integer, Pedido> pedidos) {
		int codigo;
		System.out.println("Nome o Código do Pedido: ");
		codigo = Integer.parseInt(sc.nextLine());
		
		if(pedidos.containsKey(codigo)) {
			Pedido pedido = pedidos.get(codigo);
			pedido.exibirDados();;
		}
		else System.out.println("Veículo não encontrado");
	}
	

	public static void listarPedidos(HashMap<Integer, Pedido> pedidos) {
		System.out.println("Lista de Veículos:");
		for(Map.Entry<Integer, Pedido> pedido : pedidos.entrySet()) {
			pedido.getValue().exibirDados();
			System.out.println("");
		}
	}

	public static void alterarQuantidade(Scanner sc, HashMap<Integer, Pedido> pedidos) {
		System.out.println("Nome o Código do Pedido: ");
		int codigo = Integer.parseInt(sc.nextLine());
		
		int quantidade;
		if(pedidos.containsKey(codigo)) {
			Pedido pedido = pedidos.get(codigo);
			System.out.printf("Quantidade Atual: %d\n", pedido.getQuantidade());
			
			do {
				System.out.println("Nova Quantidade: ");
				quantidade = Integer.parseInt(sc.nextLine());
			} while (quantidade < 0);
			
			pedido.setQuantidade(quantidade);
		}
		else System.out.println("Veículo não encontrado");
	}
	
	public static void removerPedido(Scanner sc, HashMap<Integer, Pedido> pedidos) {
		System.out.println("Nome o Código do Veículo: ");
		int codigo = Integer.parseInt(sc.nextLine());
		
		if(pedidos.containsKey(codigo)) {
			pedidos.remove(codigo);
		}
		else System.out.println("Veículo não encontrado");
	}
	
	public static void exibirFaturamento(HashMap<Integer, Pedido> pedidos) {
		System.out.println("Faturamento TOTAL:");
		
		double faturamentoTotal = 0;
		int numeroPedidos = 0;
		
		for(Map.Entry<Integer, Pedido> pedido : pedidos.entrySet()) {
			faturamentoTotal += pedido.getValue().calcularValorTotal();
			numeroPedidos ++;
		}
		
		System.out.printf("R$ %.2f | N° Pedidos: %d", faturamentoTotal, numeroPedidos);
	}

}
