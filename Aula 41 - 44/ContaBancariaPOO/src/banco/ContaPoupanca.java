package banco;

public class ContaPoupanca extends Conta {
	private final double TAXA_RENDIMENTO = 0.5;

	// Constructor
	public ContaPoupanca(int numConta, String nome, double saldo) {
		super(numConta, nome, saldo);
	}

	public ContaPoupanca() {
		super();
	}

	// Methods
	public void calcularNovoSaldo() {
		System.out.printf("Saldo Atual: R$ %.2f\n", this.getSaldo());

		double novoSaldo = this.getSaldo() + (this.getSaldo() * TAXA_RENDIMENTO);
		this.setSaldo(novoSaldo);

		System.out.printf("Novo Saldo: R$ %.2f\n", this.getSaldo());
	}
}
