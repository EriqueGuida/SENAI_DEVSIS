package funcionarios;

public class Funcionario {
	private String nome, cargo;
	private double salario;

	// Constructor
	public Funcionario(String nome, String cargo, double salario) {
		this.nome = nome;
		this.cargo = cargo;
		this.salario = salario;
	}

	// Methods
	public void exibirDados() {
		System.out.printf("Nome: %s | Cargo: %s | Salário: R$ %.2f", nome, cargo, salario);
	}

	public void aumentarSalario(double percentual) {
		double aumento = salario * percentual;
		salario += aumento;
	}

	// Getters & Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty())
			System.out.println("Nome Inválido");
		else
			this.nome = nome.trim();
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		if (cargo == null || cargo.trim().isEmpty())
			System.out.println("Cargo Inválido");
		else
			this.cargo = cargo.trim();
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		if (salario < 0)
			System.out.println("Salário Inválido");
		else
			this.salario = salario;
	}

}
