package livros;

public class LivroDeLivraria extends Livro{
	private int qtdEstoque;
	private double preco;
	
	
	// Constructor
	public LivroDeLivraria(String titulo, String autor, String editora, int numPaginas, int anoPublicacao, int qtdEstoque, double preco) {
		super(titulo, autor, editora, numPaginas, anoPublicacao);
		this.qtdEstoque = qtdEstoque;
		this.preco = preco;
	}
	
	public LivroDeLivraria() {
		super();
		this.qtdEstoque = 0;
		this.preco = 0;
	}
	
	
	// Methods
	public void exibirDados() {
		System.out.printf("Título: %s | Autor(a): %s | Editora: %s | N° Páginas: %d | Ano de Publicação: %d | Qtd Estoque: %d | Preço: R$ %.2f\n",
				this.getTitulo(), this.getAutor(), this.getEditora(), this.getNumPaginas(), this.getAnoPublicacao(), qtdEstoque, preco);
	}
	
	
	// Getters & Setters
	public int getQtdEstoque() {
		return qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		if (qtdEstoque < 0)
			System.out.println("INVÁLIDO");
		else
			this.qtdEstoque = qtdEstoque;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		if (preco < 0)
			System.out.println("INVÁLIDO");
		else
			this.preco = preco;
	}
	
	
}
