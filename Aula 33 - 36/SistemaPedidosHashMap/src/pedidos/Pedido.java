package pedidos;

public class Pedido {
	private String cliente, produto;
	private double valorUnitario;
	private int quantidade;

	
	// Constructor
	public Pedido(String cliente, String produto, double valorUnitario, int quantidade) {
		this.cliente = cliente;
		this.produto = produto;
		this.valorUnitario = valorUnitario;
		this.quantidade = quantidade;
	}

	
	// Methods
	public double calcularValorTotal() {
		return (quantidade * valorUnitario);
	}

	public void exibirDados() {
		System.out.printf(
				"Cliente: %s | Produto: %s | Quantidade : %d | Valor Unitário: R$ %.2f | Valor TOTAL: R$ %.2f", 
				cliente, produto, quantidade, valorUnitario, calcularValorTotal());
	}

	
	// Getters e Setters
	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		if (cliente.isEmpty())
			System.out.println("Cliente Inválido");
		else
			this.cliente = cliente;
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		if (produto.isEmpty())
			System.out.println("Produto Inválido.");
		else
			this.produto = produto;
	}

	public double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(double valorUnitario) {
		if (valorUnitario < 0)
			System.out.println("Valor Inválido");
		else
			this.valorUnitario = valorUnitario;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade < 0)
			System.out.println("Quantidade Inválida");
		else
			this.quantidade = quantidade;
	}

}
