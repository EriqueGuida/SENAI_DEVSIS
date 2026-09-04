package academia;

public class main {

	public static void main(String[] args) {
		AlunoAcademia aluno1 = new AlunoAcademia("Ana", 17, 60, 1.65);
		AlunoAcademia aluno2 = new AlunoAcademia("Bruno", 25, 80, 1.80);
		
		aluno1.exibirDados();
		System.out.printf("IMC: %.2f\n", aluno1.calcularIMC(aluno1.getPeso(), aluno1.getAltura()));
		
		aluno2.exibirDados();
		System.out.printf("IMC: %.2f\n", aluno2.calcularIMC(aluno2.getPeso(), aluno2.getAltura()));
		
		aluno2.setPeso(78);
		System.out.printf("IMC: %.2f", aluno2.calcularIMC(aluno2.getPeso(), aluno2.getAltura()));
		
	}

}
