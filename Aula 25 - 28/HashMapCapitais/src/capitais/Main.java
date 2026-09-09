package capitais;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, String> capitais = new HashMap<>();
		
		capitais.put("RJ", "Rio de Janeiro");
		capitais.put("SP", "São Paulo");
		capitais.put("MG", "Belo Horizonte");
		capitais.put("BH", "Salvador");
		capitais.put("PR", "Curitiba");
		
		System.out.println("Digite a sigla do Estado:");
		String capital = sc.nextLine().toUpperCase();
		
		if (capitais.containsKey(capital)) System.out.println("Capital: " + capitais.get(capital));
		else System.out.println("Capital não encontrada.");
		
		sc.close();
	}

}
