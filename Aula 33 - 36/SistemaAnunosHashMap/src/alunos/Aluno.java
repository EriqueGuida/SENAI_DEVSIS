package alunos;

public class Aluno {
	private String nome, curso;
	private double nota;

	
	// Constructor
	public Aluno(String nome, String curso, double nota) {
		this.nome = nome;
		this.curso = curso;
		this.nota = nota;
	}
	
	
	// Methods
	public String verificarSituacao() {
		return (nota >= 7) ? "Aprovado" : "Reprovado";
	}
	
	public void exibirDados() {
		System.out.printf("Nome: %s | Curso: %s | Nota: %.2f\n", nome, curso, nota);
	}
	
	
	// Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome.isEmpty()) System.out.println("Nome Inválido.");
		else this.nome = nome;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		if(curso.isEmpty()) System.out.println("Curso Inválido.");
		this.curso = curso;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		if (nota < 0 || nota > 10)
			System.out.println("Nota Inválida.");
		else
			this.nota = nota;
	}

}
