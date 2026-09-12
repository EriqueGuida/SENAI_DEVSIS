package livros;

public class Main {

	public static void main(String[] args) {
		Livro livro1 = new Livro("Título 1", "Autor 1", "Editora 1", 500, 2019);
		Livro livro2 = new Livro();
		
		livro1.exibirDados();
		livro2.exibirDados();
		
		LivroDeLivraria livro3 = new LivroDeLivraria("Título 1", "Autor 1", "Editora 1", 500, 2019, 50, 43.6);
		LivroDeLivraria livro4 = new LivroDeLivraria();
		
		livro3.exibirDados();
		livro4.exibirDados();
	}

}
