package exercicio16;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> tarefas = new ArrayList<>();
		String resposta;
		
		do {
			System.out.println("Digite uma tarefa: ");
			tarefas.add(sc.nextLine());
			
			System.out.println("Deseja adicionar uma nova tarefa ? (S/N)");
			resposta = sc.nextLine().toLowerCase();
			
		}while(resposta.equals("s"));
		
		sc.close();
		
		System.out.println("\nTarefas Cadastradas:");
		for(String t: tarefas) {
			System.out.println(t);
		}
	}

}
