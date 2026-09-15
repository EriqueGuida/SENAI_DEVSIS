package banco;

public class ContaEspecial extends Conta {
	private double limiteDeCredito;
	private double limiteDeCreditoAtual;

	// Constructors
	public ContaEspecial(int numConta, String nome, double saldo, double lIMITE_DE_CREDITO) {
		super(numConta, nome, saldo);
		limiteDeCredito = lIMITE_DE_CREDITO;
		limiteDeCreditoAtual = lIMITE_DE_CREDITO;
	}

	public ContaEspecial() {
		super();
		limiteDeCredito = 0;
	}
	
	// Methods
	@Override
	public void exibirDados() {
		System.out.printf("N° Conta: %d | Nome: %s | Saldo: R$ %.2f | Crédito Disponível: R$ %.2f | Limite de Crédito: R$ %.2f\n", this.getNumConta(),
				this.getNome(), saldo, limiteDeCreditoAtual, limiteDeCredito);
	}
	
	@Override
	public void depositar(double valor) {
		if (valor <= 0)
			System.out.println("Valor Inválido");
		else {
			if (saldo == 0 && limiteDeCreditoAtual < limiteDeCredito) {
				double resto = limiteDeCredito - limiteDeCreditoAtual;
				limiteDeCreditoAtual = limiteDeCredito;
				saldo = resto;
			}
			else {
				saldo += valor;
			}
		}
	}

	@Override
	public void sacar(double valor) {
		double limiteDisponivel = saldo + limiteDeCredito;
		if (valor <= 0)
			System.out.println("Valor Inválido");
		else if (valor > limiteDisponivel)
			System.out.println("Saldo Insuficiente");
		else {
			double resto = saldo - valor;
			if (resto < 0) {
				saldo = 0; // Saca tudo disponível do Saldo
				limiteDeCreditoAtual += resto;
			}
		}
	}
	
	// Getters e Setters
	public double getLIMITE_DE_CREDITO() {
		return limiteDeCredito;
	}

	public void setLIMITE_DE_CREDITO(double lIMITE_DE_CREDITO) {
		limiteDeCredito = lIMITE_DE_CREDITO;
	}
	
	
}
