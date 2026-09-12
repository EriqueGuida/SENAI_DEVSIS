package lampada;

public class Lampada {
	private boolean status = false; // A lâmpada começa desligada
	private String marca, tipo;
	private int potenciaWatts, quantidade;
	private double preco;

	// Constructor
	public Lampada(String marca, String tipo, int potenciaWatts, int quantidade, double preco) {
		this.marca = marca.trim();
		this.tipo = tipo.trim();
		this.potenciaWatts = potenciaWatts;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public Lampada() {
		this.marca = "Não Cadastrado";
		this.tipo = "Não Cadastrado";
		this.potenciaWatts = 0;
		this.quantidade = 0;
		this.preco = 0;
	}


	// Methods
	public void exibirDados() {
		System.out.printf("Marca: %s | Tipo: %s | Potência em Watts: %d | Preço: R$ %.2f | Quantidade em estoque: %d\n",
				marca, tipo, potenciaWatts, preco, quantidade);
	}

	public void ligar() {
		status = true;
	}

	public void desligar() {
		status = false;
	}

	public void mostrarEstado() {
		System.out.println((status == true) ? "Ligado" : "Desligado");
	}

	// Getters & Setters
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.trim().isEmpty())
			System.err.println("INVÁLIDO");
		else
			this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		if (tipo == null || tipo.trim().isEmpty())
			System.err.println("INVÁLIDO");
		else
			this.tipo = tipo;
	}

	public int getPotenciaWatts() {
		return potenciaWatts;
	}

	public void setPotenciaWatts(int potenciaWatts) {
		if (potenciaWatts < 0)
			System.err.println("INVÁLIDO");
		else
			this.potenciaWatts = potenciaWatts;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade < 0)
			System.err.println("INVÁLIDO");
		else
			this.quantidade = quantidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0)
			System.err.println("INVÁLIDO");
		else
			this.preco = preco;
	}

}
