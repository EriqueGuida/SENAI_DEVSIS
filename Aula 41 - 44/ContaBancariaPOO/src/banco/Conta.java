package banco;

public class Conta {
	private int numConta;
	protected double saldo;
	private String nome;
	
	
	// Constructor
	public Conta(int numConta, String nome, double saldo) {
		this.numConta = numConta;
		this.saldo = saldo;
		this.nome = nome;
	}
	
	public Conta() {
		this.numConta = 0;
		this.saldo = 0;
		this.nome = "Não Cadastrado";
	}
	
	
	// Methods
	public void exibirDados() {
		System.out.printf("N° Conta: %d | Nome: %s | Saldo: R$ %.2f\n", numConta, nome, saldo);
	}
	
	public void depositar(double valor) {
		if (valor <= 0)
			System.out.println("Valor Inválido");
		else
			saldo += valor;
	}
	
	public void sacar(double valor) {
		if (valor <= 0)
			System.out.println("Valor Inválido");
		else if (valor > saldo)
			System.out.println("Saldo Insuficiente");
		else
			saldo -= valor;
	}
	
	public void consultarSaldo() {
		System.out.printf("Saldo Atual: R$ %.2f\n", saldo);
	}

	
	// Getters & Setters
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		if (numConta < 0)
			System.out.println("INVÁLIDO");
		else
			this.numConta = numConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo < 0)
			System.out.println("INVÁLIDO");
		else
			this.saldo = saldo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null || nome.trim().isEmpty())
			System.out.println("INVÁLIDO");
		else
			this.nome = nome;
	}
	
	
}
