package estoque;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> estoque = new HashMap<>();
		
		estoque.put("Teclado", 10);
		estoque.put("Mouse", 15);
		estoque.put("Monitor", 6);
		estoque.put("Notebook", 4);
		
		System.out.println("Lista de Produtos:");
		for(Map.Entry<String, Integer> produto : estoque.entrySet()) {
			System.out.println(
					"Nome: " + produto.getKey()
					+ " | Qtd: " + produto.getValue()
			);
		}
		
		System.out.println("Digite o nome do Produto:");
		String nome = sc.nextLine();
		
		
		sc.close();
	}

}
