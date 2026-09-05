package senai;

public class Funcionario {
	final double SALARIO_MINIMO = 1612;
	String nome, funcao;
	double salario;
	int codigo;
	
	// Constructor
	public Funcionario(String nome, String funcao, double salario, int codigo) {
		this.nome = nome;
		this.funcao = funcao;
		this.salario = salario;
		this.codigo = codigo;
	}
	
	// Methods
	public void getInfoFuncionario() {
		System.out.println(
				"\nFuncionário:\n" +
				"Nome: " + nome + "\n" +
				"Código: " + codigo + "\n" +
				"Função: " + funcao + "\n" +
				"Salário: R$ " + salario + "\n"
				);
	}
	
	
	// Getters N Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (this.nome.isEmpty()) System.out.println("Nome Inválido");
		this.nome = nome;
	}

	public String getFuncao() {
		return funcao;
	}

	public void setFuncao(String funcao) {
		if (this.funcao.isEmpty()) System.out.println("Função Inválida");
		this.funcao = funcao;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (this.salario < SALARIO_MINIMO) System.out.println("Salário Inválido");
		this.salario = salario;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (this.codigo < 0) System.out.println("Código Inválido");
		this.codigo = codigo;
	}
	
}
