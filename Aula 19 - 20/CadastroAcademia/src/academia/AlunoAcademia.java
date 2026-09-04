package academia;

public class AlunoAcademia {
	String nome;
	int idade;
	double peso, altura;
	
	// Constructor
	public AlunoAcademia(String nome, int idade, double peso, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	public boolean ehMenorDeIdade() {
		if (this.idade < 18) return true;
		return false;
	}
	
	public static double calcularIMC(double peso, double altura) {
		if (altura < 0 || peso < 0) {
			System.out.println("Peso ou altura inválidos.");
			return 0;
		}
		
		return (peso / Math.pow(altura, 2));
	}
	
	public void exibirDados() {
		System.out.println(
				"\nDADOS DO ALUNO:\n" +
				"Nome: " + this.nome + "\n" +
				"Idade: " + this.idade + "\n" +
				"Peso: " + this.peso + "\n" +
				"Altura: " + this.altura + "\n" +
				"Direito a desconto: " + ((this.idade < 18) ? "Tem Desconto" : "Não Tem Desconto")
				);
	}
	
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (this.nome.isEmpty()) System.out.println("Nome Inválido");
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (this.idade < 4) System.out.println("Idade Inválida");
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (this.peso < 0) System.out.println("Peso Inválido");
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		if (this.altura < 1) System.out.println("Altura Inválida");
		this.altura = altura;
	}
	
}
