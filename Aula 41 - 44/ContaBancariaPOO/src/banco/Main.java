package banco;

public class Main {

	public static void main(String[] args) {
		ContaEspecial conta1 = new ContaEspecial(1, "Erique", 650.3, 1500);
		conta1.exibirDados();
		
		System.out.println("Depositando $150");
		conta1.depositar(150);
		conta1.exibirDados();
		
		System.out.println("Sacando $900");
		conta1.sacar(900);
		conta1.exibirDados();
		
		System.out.println("Depositando $500");
		conta1.depositar(500);
		conta1.exibirDados();
	}

}
