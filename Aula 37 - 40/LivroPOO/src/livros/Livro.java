package livros;

import java.time.*;

public class Livro {
	private String titulo, autor, editora;
	private int numPaginas, anoPublicacao;
	
	// Constructor
	public Livro() {
		this.titulo = "Não Cadastrado";
		this.autor = "Não Cadastrado";
		this.editora = "Não Cadastrado";
		this.numPaginas = 0;
		this.anoPublicacao = 0;
	}
	
	public Livro(String titulo, String autor, String editora, int numPaginas, int anoPublicacao) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.numPaginas = numPaginas;
		this.anoPublicacao = anoPublicacao;
	}
	
	
	// Methods
	public void exibirDados() {
		System.out.printf("Título: %s | Autor(a): %s | Editora: %s | N° Páginas: %d | Ano de Publicação: %d\n",
				titulo, autor, editora, numPaginas, anoPublicacao);
	}
	
	
	// Getters & Setters
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		if (titulo == null || titulo.trim().isEmpty())
			System.out.println("INVÁLIDO");
		else
			this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		if (autor == null || autor.trim().isEmpty())
			System.out.println("INVÁLIDO");
		else
			this.autor = autor;
	}

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		if (autor == null || autor.trim().isEmpty())
			System.out.println("INVÁLIDO");
		else
			this.editora = editora;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		if (numPaginas <= 0)
			System.out.println("INVÁLIDO");
		else
			this.numPaginas = numPaginas;
	}

	public int getAnoPublicacao() {
		return anoPublicacao;
	}

	public void setAnoPublicacao(int anoPublicacao) {
		int anoAtual = Year.now().getValue();
		if (anoPublicacao > anoAtual)
			System.out.println("INVÁLIDO");
		else this.anoPublicacao = anoPublicacao;
	}
	
	
}
